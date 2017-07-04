package com.guilherme.miguel.service;

import com.guilherme.miguel.domain.Order;

import java.util.List;

/**
 * OrderService
 *
 * @author Miguel Guilherme
 */
public interface OrderService {

    List<Order> getAll();

    void delete(String id);

    Order getByTitle(String title);

    Order get(String id);

    Order create(Order order);
}
