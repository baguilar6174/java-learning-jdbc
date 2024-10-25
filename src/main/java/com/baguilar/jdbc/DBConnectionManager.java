package com.baguilar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionManager {

    private final String url;
    private final Properties properties;

    public DBConnectionManager(String host, String dbName, String port, String username, String password) {
        // this.url = "jdbc:postgresql://" + host + "/" + dbName;
        this.url = "jdbc:postgresql://"+ host + ":" + port + "/" + dbName;
        this.properties = new Properties();
        this.properties.setProperty("user", username);
        this.properties.setProperty("password", password);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }
}
