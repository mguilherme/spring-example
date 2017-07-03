package com.guilherme.miguel.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Order Collection
 *
 * @author Miguel Guilherme
 */
@Value
@Builder
@EqualsAndHashCode(of = "id")
@Document(collection = "orders")
public class Order {

    @Id
    String id;

    String title;

    String description;

    List<OrderItem> orderItems;

    @CreatedDate
    LocalDateTime createdDate;

    @LastModifiedDate
    LocalDateTime LastModifiedDate;

    @Value
    public static class OrderItem {

        String name;

        Integer quantity;

    }

}
