package com.binaryon.employeemanagement.service;

import com.binaryon.employeemanagement.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> findAllOrders();
    Order findById(Long id);
    Order saveOrder(Order order);
    Order updateOrder(Long id, Order order);
    void deleteOrderById(Long id);
}
