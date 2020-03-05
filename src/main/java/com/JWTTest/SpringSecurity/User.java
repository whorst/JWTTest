package com.JWTTest.SpringSecurity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private String username;
    private String password;
    private int enabled;
//    private boolean active;
//    private int id;
//    private String roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public boolean isActive() {
//        return true;
//    }

//    public void setActive(boolean active) {
//        this.active = active;
//    }

//    public String getRoles() {
//        return roles;
//    }

//    public int getId() {
//        return id;
//    }

//    public void setRoles(String roles) {
//        this.roles = roles;
//    }
}
