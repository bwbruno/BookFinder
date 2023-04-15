package br.ufrn.rmi.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookFinderServer {

    private static void connect() {

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:data/library-1.sqlite")) {

            System.out.println("Conexão sqlite da biblioteca realizada !!!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    } 

    public static void main(String[] args) throws InterruptedException {
        connect();

        int i = 0;

        for(;;) {
            System.out.println("Server... " + i++);
            Thread.sleep(1000);
        }
    }

}
