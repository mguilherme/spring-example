package com.guilherme.miguel.service;

import com.guilherme.miguel.domain.Order;

import java.util.List;

/**
 * OrderService
 *
 * @author Miguel Guilherme
 */
public interface OrderService {

    List<Order> getOrders();

    Order getOrderByTitle(String title);

    Order getOrder(String id);

    Order create(Order order);
}
