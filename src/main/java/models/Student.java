package models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    private String sex;
    private String studentClass;

    public Student (){

    }
    public Student (String id,String name,int age, String address, String sex, String studentClass){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.studentClass = studentClass;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}

