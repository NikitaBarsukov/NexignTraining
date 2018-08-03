package com.softdev;

import org.flywaydb.core.Flyway;

public class FlwApp {


    public static void main(String[] args) {

        String url = "jdbc:postgresql://192.168.1.137:5432/postgres?currentSchema=orders";
        String user = "postgres";
        String password = "qwerty";

        Flyway flyway = new Flyway();
        flyway.setDataSource(url,user,password);
        flyway.baseline();
        flyway.migrate();
    }
}
