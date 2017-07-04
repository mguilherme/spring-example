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

    void deleteOrder(String id);

    Order getOrderByTitle(String title);

    Order getOrder(String id);

    Order createOrder(Order order);
}
