package com.Tns.evenodd;
import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        sc.close();
    }
}
