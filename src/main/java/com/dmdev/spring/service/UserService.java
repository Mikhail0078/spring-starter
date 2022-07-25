package com.dmdev.spring.service;

import com.dmdev.spring.database.repository.CompanyRepository;
import com.dmdev.spring.database.repository.UserRepository;

public class UserService {
    private final UserRepository userrepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userrepository, CompanyRepository companyRepository) {
        this.userrepository = userrepository;
        this.companyRepository = companyRepository;
    }
}
