package com.backendwork.services;

import com.backendwork.entities.Company;
import com.backendwork.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    public CompanyService(CompanyRepository companyRepository){
        this.companyRepository=companyRepository;
        System.out.println("***********Company Service started*****");
    }
    public List<Company> getAllEmployees(){
        return companyRepository.findAll() ;
    }
    public Map list() {
        Map<String,Object> companys=new LinkedHashMap<>();

        Company company=new Company();
        company.setName("Cisco");
        company.setId(0);
        companys.put("status",true);
        companys.put("result",company);
        companys.put("message","");
        return companys;
    }
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(Integer companyId) {
        companyRepository.deleteById(companyId);
    }

    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }
}
