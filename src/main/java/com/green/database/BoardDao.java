package com.green.database;

import java.sql.*;

//Data Access Object (DB 작업하는 객체)
public class BoardDao {
    public int insBoard(Board board){
        int result =0;
        String sql = " INSERT INTO board "+
                    " SET title = ? " +
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
}
