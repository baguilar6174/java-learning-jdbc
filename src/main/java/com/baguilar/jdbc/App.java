package com.baguilar.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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

            // Simple CRUD operations in database

            /* CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = new Customer();

            customer.setFirstname("Bryan");
            customer.setLastname("Aguilar");
            customer.setEmail("baguilar@test.com");
            customer.setPhone("(555) 555-5555");
            customer.setAddress("Address");
            customer.setCity("New York");
            customer.setState("NY");
            customer.setZipcode("11111");

            // Create
            Customer customerCreated = customerDAO.create(customer);
            System.out.println(customerCreated);

            // Find one
            customerCreated = customerDAO.findById(customerCreated.getId());
            System.out.println(customerCreated);

            // Update
            customerCreated.setEmail("baguilar6174@test.com");
            customerCreated = customerDAO.update(customerCreated);
            System.out.println(customerCreated);

            // Delete
            customerDAO.delete(customerCreated.getId());*/

            // ------------------------------------------------------------------------------------------------------

            /* OrderDAO orderDAO = new OrderDAO(connection);
            Order order = orderDAO.findById(1000);
            System.out.println(order); */

            // -------------------------------------------------------------------------------------------------------

            OrderDAO orderDAO = new OrderDAO(connection);
            List<Order> orders = orderDAO.getOrdersForCustomer(789);
            orders.forEach(System.out::println);

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
