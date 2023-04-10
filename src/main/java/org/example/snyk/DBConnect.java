package org.example.snyk;

import java.sql.*;

public class DBConnect {
    public static boolean login(String username, String password) throws SQLException {
        String jdbcUrl = "jdbc:sqlserver://localhost:1433;user=sa;password=1qaz-pl,A;" +
                "databaseName=testDB";
        Connection conn = DriverManager.getConnection(jdbcUrl);
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("hello");
        return rs.next();
    }

//    public static String getUsers(Connection conn) throws SQLException {
//        Statement stmt = conn.createStatement();
//        String sql = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
//        ResultSet rs = stmt.executeQuery(sql);
//        return "";
//    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        login("","");
    }
}
