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

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class setter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Namitha");
        s1.setAge(21);
        s1.display();
    }
}
