package com.store.annotation;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bobby on 2/12/2017.
 */
@Entity
@Table(name = "CUSTOMER_CART")
public class ShoppingCart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CUSTOMER_ORDER_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name="CUSTOMER_ID")
    private Customer customer;

    @Column(name = "RECEIPT")
    private boolean receipt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isReceipt() {
        return receipt;
    }

    public void setReceipt(boolean receipt) {
        this.receipt = receipt;
    }
}
