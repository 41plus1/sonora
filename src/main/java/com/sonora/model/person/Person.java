package com.sonora.model.person;

public class Person {
    private String name;
    private String email;
    private String password;
    private String photo;

    public Person(String name, String email, String password, String photo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.photo = photo;
    }

    public void updateProfile() {

    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }
}
