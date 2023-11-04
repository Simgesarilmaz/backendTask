package com.backendwork.controllers;

        import com.backendwork.entities.Employee;
        import com.backendwork.services.EmployeeService;
        import org.springframework.web.bind.annotation.*;

        import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService= employeeService;
    }

    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return employee;
    }
    @GetMapping("/list")
    public Map list(){
        return employeeService.list();
    }
}
