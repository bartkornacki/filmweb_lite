package main;

import connection.ConnectionManager;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        ConnectionManager.getConnection();



    }
}
