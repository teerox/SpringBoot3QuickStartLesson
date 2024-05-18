package com.example.mycoolapp.rest;

import com.example.mycoolapp.entity.Company;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CompanyController {

    private List<Company> companies;

    @PostConstruct
    public void loadData() {
        System.out.println("Loading data...");
        companies = List.of(
                new Company(1, "Apple"),
                new Company(2, "Google"),
                new Company(3, "Microsoft")
        );
    }
    @RequestMapping("/company")
    public List<Company> getCompanies() {
        return companies;
    }

    @RequestMapping("/company/{companyId}")
    public Company getCompany(@PathVariable int companyId) {
        if (companyId < 0 || companyId >= companies.size()) {
            throw new CompanyNotFoundException("Company id not found - " + companyId);
        }
        return companies.get(companyId);
    }



}
