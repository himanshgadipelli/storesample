package com.store.annotation;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bobby on 2/9/2017.
 */
@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "CUSTOMER_ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID",nullable=false,unique=true)
    private Customer customer;

    @Column(name = "ORDER_STATUS")
    private Status status;


    public Long getId() {
        return id;
    }

    public void setId(Long orderID) {
        this.id = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
