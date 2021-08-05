package com.example.application.entity;

import com.example.application.role.Role;

public class User {
    private int id;
    private String companyName;
    private String password;
    private String email;
    private String numberPhone;
    private Role role;

    public User() {
    }

    public User(String password, String email) {
        this.email = email;
        this.password = password;

    }

    public User(String companyName, String password, Role role) {
        this.companyName = companyName;
        this.password = password;
        this.role = role;
    }

    public User(int id, String companyName, String password, String email, String numberPhone, Role role) {
        this.id = id;
        this.companyName = companyName;
        this.password = password;
        this.email = email;
        this.numberPhone = numberPhone;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
