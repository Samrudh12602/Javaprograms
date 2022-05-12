package com.samrudh.Other;

public class Employee {
    private int age;
    private String name;
    private String post;
    public Employee(){

    }
    public Employee(String name , String post, int age) {
        this.age = age;
        this.name = name;
        this.post = post;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
