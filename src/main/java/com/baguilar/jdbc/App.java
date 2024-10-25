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

            // Simple connection and query execution

            /* Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM CUSTOMER");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            } */


            // Create new record in Customer table

            /* CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = new Customer();

            customer.setFirstname("Bryan");
            customer.setLastname("Aguilar");
            customer.setEmail("baguilar@test.com");
            customer.setPhone("(555) 555-5555");
            customer.setAddress("Address");
            customer.setCity("Miami");
            customer.setState("NY");
            customer.setZipcode("11111");

            customerDAO.create(customer); */

            // Get data from Database

            /* CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = customerDAO.findById(1000);
            System.out.println(customer.getFirstname() + " " + customer.getLastname());*/

            // Update data from database

            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = customerDAO.findById(10000);
            System.out.println(customer.getFirstname() + " " + customer.getLastname() + " " + customer.getEmail());
            customer.setEmail("baguilar6174@test.com");
            customer = customerDAO.update(customer);
            System.out.println(customer.getFirstname() + " " + customer.getLastname() + " " + customer.getEmail());

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
