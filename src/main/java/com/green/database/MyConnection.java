package com.green.database;

import java.sql.*;

// DB-Connection을 만드는 공장
public class MyConnection {
    private static final String DB_URL="jdbc:mariadb://localhost:3306/board_1"; //목적지 URL //3306기본포트라 :3306 나옴
    //JDBC 뜻. java data base connection
    private static final String DB_USER="root";
    private static final String DB_PASSWORD="green502";

    public static Connection getConn() throws SQLException{
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        System.out.println("접속 성공");
        return conn;
    }
}
