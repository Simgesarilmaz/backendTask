package com.backendwork.services;

import com.backendwork.entities.Employee;
import com.backendwork.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Map list() {
        Map<String,Object> employees=new LinkedHashMap<>();
        Employee employee=new Employee();
        employee.setName("Ali");
        employee.setId(0);

        employees.put("status",true);
        employees.put("result",employee);
        employees.put("message","");
        return employees;

    }
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


}
