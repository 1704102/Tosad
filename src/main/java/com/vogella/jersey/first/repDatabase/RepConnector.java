package com.vogella.jersey.first.repDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by marti on 22-1-2018.
 */
public class RepConnector {

    private String url;
    private String port;
    private String username;
    private String password;
    private String data;

    public RepConnector(String url, String port, String username, String password){
        this.url = url;
        this.port = port;
        this.username = username;
        this.password = password;


        connect();
    }


    public void connect() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//ondora02.hu.nl:8521/cursus02.hu.nl","tosad_2017_2b_team5","tosad_2017_2b_team5");
            System.out.println("connection succesfull");
        } catch (Exception e) {
            System.out.println("connection failed");
            e.printStackTrace();
        }
    }

    public void disconnect() {

    }
}