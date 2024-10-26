package com.baguilar.jdbc;

import com.baguilar.jdbc.util.DataTransferObject;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order implements DataTransferObject {

    private long id;
    private String customerFirstName;
    private String customerLastname;
    private String customerEmail;
    private Date creationDate;
    private BigDecimal totalDue;
    private String status;
    private String salespersonFirstname;
    private String salespersonLastname;
    private String salesPersonEmail;
    private List<OrderLine> orderLines;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastname() {
        return customerLastname;
    }

    public void setCustomerLastname(String customerLastname) {
        this.customerLastname = customerLastname;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSalespersonFirstname() {
        return salespersonFirstname;
    }

    public void setSalespersonFirstname(String salespersonFirstname) {
        this.salespersonFirstname = salespersonFirstname;
    }

    public String getSalespersonLastname() {
        return salespersonLastname;
    }

    public void setSalespersonLastname(String salespersonLastname) {
        this.salespersonLastname = salespersonLastname;
    }

    public String getSalesPersonEmail() {
        return salesPersonEmail;
    }

    public void setSalesPersonEmail(String salesPersonEmail) {
        this.salesPersonEmail = salesPersonEmail;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastname='" + customerLastname + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", creationDate=" + creationDate +
                ", totalDue=" + totalDue +
                ", status='" + status + '\'' +
                ", salespersonFirstname='" + salespersonFirstname + '\'' +
                ", salespersonLastname='" + salespersonLastname + '\'' +
                ", salesPersonEmail='" + salesPersonEmail + '\'' +
                ", orderLines=" + orderLines +
                '}';
    }
}
