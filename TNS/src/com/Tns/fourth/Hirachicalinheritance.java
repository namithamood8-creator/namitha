package com.Tns.fourth;
public class Hirachicalinheritance{
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("---------------");

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
}
