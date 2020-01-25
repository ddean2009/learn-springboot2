package com.flydean.repository;

import com.flydean.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wayne
 * @version EmployeeRepository,  2020/1/25 1:03 下午
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Employee findByName(String name);

}
