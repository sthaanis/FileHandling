/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fileioapp.entity;

/**
 *
 * @author User
 */
public class Student {

    private int id;
    private String name, email, address, phoneNo;
    private boolean status;

    public Student() {
    }

    public Student(int id, String name, String email, String address, String phoneNo, boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phoneNo=" + phoneNo + ", status=" + status + '}';
    }
    public String toCSV(){
    return id + "," + name + "," + email + "," + address + "," + phoneNo + "," + status + "\r\n";
    }

}
