package com.guilherme.miguel.config;

import com.guilherme.miguel.domain.Order;
import com.guilherme.miguel.domain.Order.OrderItem;
import com.guilherme.miguel.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Dummy data
 *
 * @author Miguel Guilherme
 */
@Configuration
public class DataLoaderConfig {

    @Bean
    public CommandLineRunner commandLineRunner(OrderRepository orderRepository) {
        return args -> {

            List<OrderItem> orderItems = Stream.of(
                    new OrderItem("Order item 1", 1),
                    new OrderItem("Order item 2", 2),
                    new OrderItem("Order item 3", 3),
                    new OrderItem("Order item 4", 4),
                    new OrderItem("Order item 5", 5)
            ).collect(Collectors.toList());

            Order order1 = Order.builder()
                    .title("Order1")
                    .description("My first Order")
                    .orderItems(orderItems)
                    .build();

            Order order2 = Order.builder()
                    .title("Order2")
                    .description("My second Order")
                    .orderItems(orderItems)
                    .build();

            Order order3 = Order.builder()
                    .title("Order3")
                    .description("My third Order")
                    .orderItems(orderItems)
                    .build();

            List<Order> orders = Stream.of(order1, order2, order3)
                    .collect(Collectors.toList());

            orderRepository.save(orders);

            orderRepository.findAll().forEach(System.out::println);
        };
    }

}
