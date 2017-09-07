package com.test;

import java.sql.*;

public class MySQLConnUtils {
    public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException{
        String hostName = "localhost";
        String dbName = "restaurant";
        String userName = "root";
        String password = "root";
        return getMySQLConnection(hostName,dbName,userName,password);
    }

    private static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }

    public Statement createStatement() throws SQLException{
        try {
            Statement stmt = getMySQLConnection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DISH");
            getMySQLConnection().close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return createStatement();
    }

//    public String getAllUsers(){
//
//        return users;
//    }
}
