package com.green.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// insert delete update select의 반환타입과 파라미터 타입을 알아 둘 것.

//Data Access Object (DB 작업하는 객체)
public class BoardDao {
    // insert, update, delete >> 리턴값은 영향받은 행 값
    // executeUpdate() 메소드 호출
    public int insBoard(Board board){
        int result =0;
        String sql = " INSERT INTO board "+
                    " SET title = ? " +         //ps ? 안쓰면  " SET title = ' " + board.getTitle() + " ' " 했어야 했음
                    "  , contents = ? " +
                    "  , writer = ? ";
        //데이터 베이스 통신과정.
        //마이바티스가 아래를 자동화 해줄 것임.
        try(Connection conn = MyConnection.getConn(); PreparedStatement ps=conn.prepareStatement(sql)){
            // ? 부분 값 채우기.
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());

            result= ps.executeUpdate(); //쿼리 실행 메소드
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    public int updBoard(Board board){
        int result=0;
        String sql=" UPDATE board " +
                " SET title = ? " +
                " , contents = ? " +
                " , writer = ? " +
                " WHERE board_id = ? ";
        try(Connection conn = MyConnection.getConn(); PreparedStatement ps=conn.prepareStatement(sql)){
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());
            ps.setInt(4, board.getBoardId());
            result= ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    public int updBoardDynamic(Board board){ // 동적인 UPDATE문
        int result =0;
        StringBuilder sb= new StringBuilder();
        if(board.getTitle() != null && !"".equals(board.getTitle())){
            sb.append(String.format(", title ='%s' ", board.getTitle()));
        }
        if(board.getContents() !=null && !"".equals(board.getContents())){
            sb.append(String.format(", contents ='%s' ", board.getContents()));
        }
        if(board.getWriter() !=null && !"".equals(board.getWriter())){
            sb.append(String.format(", writer ='%s' ", board.getWriter()));
        }

        String sql= String.format("UPDATE board SET %s WHERE board_id = %d",
                                    sb.deleteCharAt(0), board.getBoardId());
        // 앞에 항상 콤마(,)가 오므로 deleteCharAt으로 콤마 하나를 삭제하도록 하자.
        System.out.println(sql);
        try(Connection conn = MyConnection.getConn();
            PreparedStatement ps=conn.prepareStatement(sql)){
            result=ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public int delBoard(int boardid){
        int result = 0;
        String sql=" DELETE FROM board " +
                    " WHERE board_id = ? ";

        try(Connection conn = MyConnection.getConn(); PreparedStatement ps=conn.prepareStatement(sql)){
            ps.setInt(1,boardid);
            result=ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public List<Board> selBoardList(){
        List<Board> list=new ArrayList<>();
        String sql="SELECT board_id, title, writer, created_at " +
                " FROM board" +
                " ORDER BY board_id DESC";  //created_at 쓰면 속도 느려지니 PK사용
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)
             ; ResultSet rs = ps.executeQuery()/*물음표 없어서 자동으로 닫힐것임*/) {

            while (rs.next()){ //튜플이 있을때까지(true) board에 추가, 없으면(false) 종료
                Board board=new Board(); // 튜플마다 Board 객체가 있음.
                list.add(board);
                board.setBoardId(rs.getInt("board_id")); //해당 컬럼에 있는 값 가져와 board에 넣는다.
                String title =rs.getString("title");
                board.setTitle(title); // 따로 만들어서 넣어도 되고 바로 넣어도 되고.
                board.setWriter(rs.getString("writer"));
                board.setCreatedAt(rs.getString("created_at"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public Board selBoardList(int boardid){
        String sql="SELECT board_id, title, contents, writer, created_at " +
                " FROM board" +
                " WHERE board_id= ?";
        ResultSet rs =null;
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, boardid);
            rs=ps.executeQuery();

            // 튜플이 넘어올 경우의 수: 있거나 없거나.
            if (rs.next()){ //튜플이 있으면(true) board 반환, 없으면(false) 종료
                Board board=new Board();
                board.setBoardId(rs.getInt("board_id"));
                board.setTitle(rs.getString("title"));
                board.setContents(rs.getString("contents"));
                board.setWriter(rs.getString("writer"));
                board.setCreatedAt(rs.getString("created_at"));
                return board;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {  // finally는 실행 보장. 얘 먼저 실행되고 위의 try문이 실행 될 것.
            if(rs != null){
                try {rs.close();}catch (Exception e){ e.printStackTrace();} //기존 select 구조 바꾸기 귀찮아서 여기서 닫은거지 insert문처럼 해도됨.
            }
        }
        return null;
    }

}
