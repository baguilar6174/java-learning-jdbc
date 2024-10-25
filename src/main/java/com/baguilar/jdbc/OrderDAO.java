package com.baguilar.jdbc;

import com.baguilar.jdbc.util.DataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDAO extends DataAccessObject<Order> {

    public final String GET_BY_ID =
            "SELECT c.first_name, c.last_name, c.email, o.order_id, o.creation_date, o.total_due, o.status, s.first_name, s.last_name, s.email, ol.quantity, p.code, p.name, p.size, p.variety, p.price " +
            "FROM orders o " +
            "JOIN customer c ON o.customer_id=c.customer_id " +
            "JOIN salesperson s ON o.salesperson_id=s.salesperson_id " +
            "JOIN order_item ol ON ol.order_id=o.order_id " +
            "JOIN product p ON ol.product_id=p.product_id " +
            "WHERE o.order_id = ?";

    public OrderDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Order findById(long id) {
        Order order = new Order();
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(GET_BY_ID)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            long orderId = 0;
            List<OrderLine> orderLines = new ArrayList<>();

            while (resultSet.next()) {

                if(orderId == 0) {
                    order.setCustomerFirstName(resultSet.getString(1));
                    order.setCustomerLastname(resultSet.getString(2));
                    order.setCustomerEmail(resultSet.getString(3));
                    order.setId(resultSet.getLong(4));

                    orderId = order.getId();

                    order.setCreationDate(new Date(resultSet.getDate(5).getTime()));
                    order.setTotalDue(resultSet.getBigDecimal(6));
                    order.setStatus(resultSet.getString(7));
                    order.setSalespersonFirstname(resultSet.getString(8));
                    order.setSalespersonLastname(resultSet.getString(9));
                    order.setSalesPersonEmail(resultSet.getString(10));
                }

                OrderLine orderLine = new OrderLine();

                orderLine.setQuantity(resultSet.getInt(11));
                orderLine.setProductCode(resultSet.getString(12));
                orderLine.setProductName(resultSet.getString(13));
                orderLine.setProductSize(resultSet.getInt(14));
                orderLine.setProductVariety(resultSet.getString(15));
                orderLine.setProductPrice(resultSet.getBigDecimal(16));
                orderLines.add(orderLine);
            }
            order.setOrderLines(orderLines);
        } catch (SQLException exception) {
            exception.printStackTrace();
            throw new RuntimeException(exception);
        }
        return order;
    }

    @Override
    public List<Order> findAll() {
        return List.of();
    }

    @Override
    public Order update(Order dto) {
        return null;
    }

    @Override
    public Order create(Order dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
