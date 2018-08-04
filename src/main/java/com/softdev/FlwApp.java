package com.softdev;

import org.flywaydb.core.Flyway;

public class FlwApp {


    public static void flw(String[] args) {

        String url = "jdbc:postgresql://ec2-54-228-251-254.eu-west-1.compute.amazonaws.com:5432/d1sphsh3sk42u4?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
        String user = "dwwublhcwmgikj";
        String password = "4d749d66d00b50a93931f28ae63f0cdf1337dfd3397baa47b941dce63df57b1e";

        Flyway flyway = new Flyway();
        flyway.setDataSource(url,user,password);
        flyway.baseline();
        flyway.migrate();
    }
}
