package com.paschoal.api_restful_sring_mongodb.repository;

import org.springframework.stereotype.Repository;

import com.paschoal.api_restful_sring_mongodb.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;;;

@Repository
public interface UserRepository extends MongoRepository<User,String>{
    
}
