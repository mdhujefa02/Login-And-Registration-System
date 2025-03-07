package com.mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	 private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	 private static final String USERNAME = "hujefa";
	 private static final String PASSWORD = "Hujefa123";
    static {
        try {
            // Load the SQL JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}