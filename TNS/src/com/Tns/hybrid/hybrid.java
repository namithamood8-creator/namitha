package com.Tns.hybrid;
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

interface Pet {
    void friendly();
}

interface Guard {
    void protect();
}

class GermanShepherd extends Dog implements Pet, Guard {
    public void friendly() {
        System.out.println("German Shepherd is friendly");
    }
    public void protect() {
        System.out.println("German Shepherd protects");
    }
}

public class hybrid {
    public static void main(String[] args) {
        GermanShepherd g = new GermanShepherd();
        g.eat();
        g.bark();
        g.friendly();
        g.protect();
    }
}




