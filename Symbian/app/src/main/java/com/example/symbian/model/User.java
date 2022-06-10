package com.example.symbian.model;

public class User {

    private int id_user;
    private String name;
    private String last_name;
    private String email;
    private String phone;
    private String password;

    public User() {
    }

    public User(int id_user, String name, String  last_name, String email, String phone, String password){
        this.id_user = id_user;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getId_user() { return id_user; }
    public void setId_user(int id_user) { this.id_user = id_user; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLast_name() { return last_name; }
    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
