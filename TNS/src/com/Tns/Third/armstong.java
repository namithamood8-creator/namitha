package com.Tns.Third;
import java.util.*;

public class armst153ong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int original = sc.nextInt();
        int n = original;
        int temp, armstrong = 0;
        while (n > 0) {
            temp = n % 10;
            temp = (int) Math.pow(temp, 3);
            armstrong += temp;
            n = n / 10;
        }
        if (armstrong == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
        sc.close();
    }
}
