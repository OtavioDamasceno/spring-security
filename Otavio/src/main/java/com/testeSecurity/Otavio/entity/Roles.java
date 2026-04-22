package com.testeSecurity.Otavio.entity;

public enum Roles {

    USER("user"),
    ADMIN("admin");

    private String role;

     Roles(String role){
        this.role = role;
    }

    public String getRole(){
         return role;
    }

}
