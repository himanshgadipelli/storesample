package com.store.annotation;

import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by bobby on 2/12/2017.
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    @ListIndexBase
    private Set<Order> orderSet = new HashSet<Order>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }

    public void addOrder(Order order){
        order.setCustomer(this);
        orderSet.add(order);
    }

}
