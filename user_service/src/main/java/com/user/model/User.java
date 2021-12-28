package com.user.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String phone;

    private List<Contact> contacts = new ArrayList<>();

    public User(Long id, String name, String phone) {
        this.userId = id;
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }

    public User(Long id, String name, String phone, List<Contact> contacts) {
        this.userId = id;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id) {
        this.userId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
