package com.Tns.variables;
public class variables {
    int instanceVar = 50;  

    void display() {
        int localVar = 20;  
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        variables obj = new variables();
        obj.display();
    }
}



