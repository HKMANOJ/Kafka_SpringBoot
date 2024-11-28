package com.example.kafka.entity;


public class Customer {

    private int customerID;
    private String name;
    private String location;

    private String contactNO;

    public Customer() {
    }

    public Customer(int customerID, String name, String location, String contactNO) {
        this.customerID = customerID;
        this.name = name;
        this.location = location;
        this.contactNO = contactNO;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNO() {
        return contactNO;
    }

    public void setContactNO(String contactNO) {
        this.contactNO = contactNO;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", contactNO='" + contactNO + '\'' +
                '}';
    }
}
