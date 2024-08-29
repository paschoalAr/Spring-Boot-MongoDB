package com.paschoal.api_restful_sring_mongodb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paschoal.api_restful_sring_mongodb.domain.User;
import com.paschoal.api_restful_sring_mongodb.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

}
