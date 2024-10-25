package com.baguilar.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Database connection
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DBConnectionManager dbConnectionManager = new DBConnectionManager(
                "localhost",
                "ecommerce_db",
                "5432",
                "postgres",
                "123456"
        );
        try {
            Connection connection = dbConnectionManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM CUSTOMER");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
