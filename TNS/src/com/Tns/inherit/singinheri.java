package com.Tns.inherit;

class singinheri {   // Changed to start with capital letter (Java convention)
    int a = 10;

    public void show() {
        System.out.println("This is class A");
    }
}

class B extends SingInheri {
    public void display() {
        System.out.println("This is class B");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();   // Object creation
        obj.display();     // Call method from class B
        System.out.println(obj.a);  // Access variable from parent class
        obj.show();        // Call method from parent class
    }
}
