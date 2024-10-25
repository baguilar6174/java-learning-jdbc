package com.baguilar.jdbc;

import com.baguilar.jdbc.util.DataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CustomerDAO extends DataAccessObject<Customer> {

    private static final String INSERT = "INSERT INTO customer (first_name, last_name, email, phone, address, city, state, zipcode) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    public CustomerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Customer findById(long id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public Customer update(Customer dto) {
        return null;
    }

    @Override
    public Customer create(Customer dto) {
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(INSERT)) {

            preparedStatement.setString(1, dto.getFirstname());
            preparedStatement.setString(2, dto.getLastname());
            preparedStatement.setString(3, dto.getEmail());
            preparedStatement.setString(4, dto.getPhone());
            preparedStatement.setString(5, dto.getAddress());
            preparedStatement.setString(6, dto.getCity());
            preparedStatement.setString(7, dto.getState());
            preparedStatement.setString(8, dto.getZipcode());

            preparedStatement.execute();

            return null;

        } catch (SQLException exception) {
            exception.printStackTrace();
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void delete(long id) {

    }
}
