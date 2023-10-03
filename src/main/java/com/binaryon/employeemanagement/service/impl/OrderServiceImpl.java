package com.binaryon.employeemanagement.service.impl;

import com.binaryon.employeemanagement.entity.Employee;
import com.binaryon.employeemanagement.entity.Order;
import com.binaryon.employeemanagement.exception.ResourceNotFoundException;
import com.binaryon.employeemanagement.repository.OrderRepository;
import com.binaryon.employeemanagement.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order", id));
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order orderData) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order", id));

        order.setDescription(orderData.getDescription());
        order.setStatus(orderData.getStatus());

        return orderRepository.save(order);
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }
}
