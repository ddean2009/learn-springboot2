package com.flydean.service;

import com.flydean.entity.Employee;

import java.util.List;

/**
 * @author wayne
 * @version EmployeeService,  2020/1/25 1:09 下午
 */
public interface EmployeeService {
    public Employee getEmployeeById(Long id);

    public Employee getEmployeeByName(String name);

    public List<Employee> getAllEmployees();

    public boolean exists(String email);

    public Employee save(Employee employee);
}
