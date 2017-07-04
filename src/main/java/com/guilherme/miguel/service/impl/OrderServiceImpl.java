package com.guilherme.miguel.service.impl;

import com.guilherme.miguel.domain.Order;
import com.guilherme.miguel.exception.OrderNotFoundException;
import com.guilherme.miguel.repository.OrderRepository;
import com.guilherme.miguel.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Order Service implementation
 *
 * @author Miguel Guilherme
 */
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order get(String id) {
        return Optional.ofNullable(orderRepository.findOne(id)).orElseThrow(OrderNotFoundException::new);
    }

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public void delete(String id) {
        orderRepository.delete(id);
    }

    @Override
    public Order getByTitle(String title) {
        return orderRepository.findFirstByTitle(title).orElseThrow(OrderNotFoundException::new);
    }

}
