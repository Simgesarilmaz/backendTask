package com.backendwork.repositories;

import com.backendwork.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByCompanyId(int companyId);
}
