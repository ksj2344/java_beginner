package com.green.database;

import java.util.List;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao=new BoardDao();
        Board board=null;
        if(args.length>0){
            board = new Board();
            board.setTitle(args[0]);
            board.setContents(args[1]);
            board.setWriter(args[2]);

            if(args.length==4){
                board.setBoardId(Integer.parseInt(args[3]));
            }
        }

        //insert(dao, board);  //추가
        //delete(dao);  //삭제
        //update(dao, board); //정적 UPDATE
        //updateDynamic(dao, board); //동적 UPDATE
        //selectAll(dao); //튜플 전체 출력
        selectOne(dao,3); // 튜플 하나 출력
    }

    private static void insert(BoardDao dao, Board board){
        int result=dao.insBoard(board);
        System.out.println("result: "+result);
    }
    private static void update(BoardDao dao, Board board){
        int result= dao.updBoard(board);
        System.out.println("result: "+result);
    }
    private static void updateDynamic(BoardDao dao, Board board){
        int result= dao.updBoardDynamic(board);
        System.out.println("result: "+result);
    }
    private static void delete(BoardDao dao){
        int result= dao.delBoard(2);
        System.out.println("result: "+result);
    }

    private  static void selectAll(BoardDao dao){
        List<Board> list=dao.selBoardList();
        for(Board b: list) {
            System.out.println(b);
        }
    }

    private static void selectOne(BoardDao dao, int boardID){
        Board board=dao.selBoardList(boardID);
        System.out.println(board);
    }

}
