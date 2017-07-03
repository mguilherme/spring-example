package com.guilherme.miguel.repository;

import com.guilherme.miguel.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Order Repository
 *
 * @author Miguel Guilherme
 */
public interface OrderRepository extends MongoRepository<Order, String> {

    Optional<Order> findFirstByTitle(String title);

}
