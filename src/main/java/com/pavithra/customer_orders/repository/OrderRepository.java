package com.pavithra.customer_orders.repository;

import com.pavithra.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pavithra
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
