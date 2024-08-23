package com.example.demo.controller;


import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.createOrder(order);
        return ResponseEntity.ok(createdOrder);
    }

    @GetMapping("/recent")
    public ResponseEntity<List<Order>> getOrdersFromLast7Days() {
        List<Order> orders = orderService.getOrdersFromLast7Days();
        return ResponseEntity.ok(orders);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrderTotalAmount(@PathVariable Long id, @RequestParam Double totalAmount) {
        Order updatedOrder = orderService.updateOrderTotalAmount(id, totalAmount);
        return ResponseEntity.ok(updatedOrder);
    }
}
