package com.store.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bobby on 2/12/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/storefront.xml"})
@Transactional
public class HibernateSchemaTest {

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    @Rollback(value = false)
    public void testCreate(){
        Session session = sessionFactory.getCurrentSession();

        Customer customer = new Customer();
        customer.setFirstName("Barack");
        customer.setLastName("Obama");
//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.setCustomer(customer);
//        shoppingCart.setReceipt(true);
        session.save(customer);
    }
}
