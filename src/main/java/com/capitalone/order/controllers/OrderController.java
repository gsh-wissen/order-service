package com.capitalone.order.controllers;

import com.capitalone.order.repositories.OrderRepository;
import com.capitalone.order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {

    private OrderRepository repo;

    @Autowired
    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/api/orders")
    public Order createOrder(@RequestBody Order order) {
        return repo.save(order);
    }

    @GetMapping("/api/orders/{id}")
    public Optional<Order> findOrderById(@PathVariable Long id) {
        return repo.findById(id);
    }

}
