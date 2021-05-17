package com.example.catalogueapp.Model;

public class User {
    private String Admin,Elev,Password,email;

    public User(String password, String email) {
        Password = password;
        this.email = email;
    }

    public User() {
    }

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String admin) {
        Admin = admin;
    }

    public String getElev() {
        return Elev;
    }

    public void setElev(String elev) {
        Elev = elev;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
