package com.paschoal.api_restful_sring_mongodb.dto;

import java.io.Serializable;

import com.paschoal.api_restful_sring_mongodb.domain.User;

public class UserDTO implements Serializable{
    
    private String id;
    private String name;
    private String email;

    public UserDTO(){

    }

    public UserDTO(User user){
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
