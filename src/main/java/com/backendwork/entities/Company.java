package com.backendwork.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<Employee> employees;

    // Getter metotları
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter metotları
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
