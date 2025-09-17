package com.Tns.inherit;

class SingleInheri {
    int a = 10;
    public void show() {
        System.out.println("This is class A");
    }
}

class B extends SingleInheri {
    public void display() {
        System.out.println("This is class B");
    }
}

public class singinheri {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        System.out.println(obj.a);
        obj.show();
    }
}
