package com.example.back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class KittyModel {

    @Id
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private Boolean sex;

    @Column
    private String breed;

    @Column
    private int user_id;

    public KittyModel() {
    }

    public KittyModel(Long id, String name, int age, Boolean sex, String breed, int user_id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.breed = breed;
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
