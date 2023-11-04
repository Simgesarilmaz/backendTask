package com.backendwork.controllers;

import com.backendwork.entities.Company;
import com.backendwork.services.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/companys")
public class CompanyController {
    final CompanyService companyService;
    public CompanyController(CompanyService companyService){
        this.companyService=companyService;
    }

    @PostMapping
    public Company save(@RequestBody Company company){
        return company;
    }
    @GetMapping("/list")
    public Map list(){
        return companyService.list();
    }
}
