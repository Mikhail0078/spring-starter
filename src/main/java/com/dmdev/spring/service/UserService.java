package com.dmdev.spring.service;

import com.dmdev.spring.database.entity.Company;
import com.dmdev.spring.database.repository.CompanyRepository;
import com.dmdev.spring.database.repository.CrudRepository;
import com.dmdev.spring.database.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userrepository;
    private final CrudRepository<Integer, Company> companyRepository;


    public UserService(UserRepository userrepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userrepository = userrepository;
        this.companyRepository = companyRepository;
    }

}
