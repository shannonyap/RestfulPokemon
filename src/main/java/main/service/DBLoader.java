package main.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBLoader {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://otwsl2e23jrxcqvx.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/qoku3xkesuvipcpp";

    //  Database credentials
    static final String USER = "jbehzwu2oe6w5h7p";
    static final String PASS = "sx44hhkjc7lkfvx3";

    public Connection connection = null;

    public DBLoader() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
