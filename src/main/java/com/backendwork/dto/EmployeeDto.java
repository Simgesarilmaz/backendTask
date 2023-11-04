package com.backendwork.dto;

import com.backendwork.entities.Company;
import lombok.Data;

@Data
public class EmployeeDto {
    private Integer id;
    private String name;
    private Company company;

    public EmployeeDto(Integer id, String name, Company company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    // Getter ve Setter metotları
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
