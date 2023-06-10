package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Admin
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;

    private String username;

    private String adminPassword;

    public Admin(String username, String adminPassword) {
        this.username = username;
        this.adminPassword = adminPassword;
    }

    public Admin(int adminId, String username, String adminPassword) {
        this.adminId = adminId;
        this.username = username;
        this.adminPassword = adminPassword;
    }

    public Admin() {
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return adminPassword;
    }

    public void setPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}