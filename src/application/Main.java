package application;

import db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}