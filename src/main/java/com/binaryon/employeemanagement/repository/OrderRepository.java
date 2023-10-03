package com.binaryon.employeemanagement.repository;

import com.binaryon.employeemanagement.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
