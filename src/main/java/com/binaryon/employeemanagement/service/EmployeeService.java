package com.binaryon.employeemanagement.service;

import com.binaryon.employeemanagement.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAllEmployees();
    Optional<Employee> findById(Long id);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);
}
