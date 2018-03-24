package com.sxt.pojo;

public class Student {
    private Integer id;
    private String name;
    private String password;
    private String hobby;

    public Student() {
    }

    public Student(Integer id, String name, String password, String hobby) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.hobby = hobby;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
