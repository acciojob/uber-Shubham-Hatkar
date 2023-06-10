package com.driver.model;

import com.driver.model.TripBooking;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String password;

    private String mobile;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList = new ArrayList<>();


    public Customer() {
    }

    public Customer(int id, String password, String mobile) {
        this.customerId = id;
        this.password = password;
        this.mobile = mobile;
    }

    public Customer(String password, String mobile) {
        this.password = password;
        this.mobile = mobile;
    }
    public List<TripBooking> getTripBookingList()
    {
        return this.tripBookingList;
    }

    public int getId() {
        return customerId;
    }

    public void setId(int id) {
        this.customerId = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}