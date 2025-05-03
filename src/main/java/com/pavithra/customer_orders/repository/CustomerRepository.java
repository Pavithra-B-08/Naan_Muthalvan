package com.pavithra.customer_orders.repository;

import com.pavithra.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pavithra
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
