package com.samaham.studentexample8;

public class Student {
    
    private String name;
    private int age;
    private String favClass;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String favClass(){
        return favClass;
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
    
    public void setFavClass(String favClass){
        this.favClass = favClass;
    }

    
}
