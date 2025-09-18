package com.Tns.getset;
class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class getter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Namitha");
        s1.setAge(21);
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}


