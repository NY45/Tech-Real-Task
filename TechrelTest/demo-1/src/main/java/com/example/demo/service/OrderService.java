package com.example.demo.service;


import com.example.demo.model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getOrdersFromLast7Days();
    Order updateOrderTotalAmount(Long id, Double totalAmount);
}
