package com.tnf.Exception;
public class Nestedtry{
    public static void main(String[] args) {
        try {
            // Outer try block
            int arr[] = {10, 20, 30, 40, 50};
            System.out.println("Outer try block started");

            try {
                // Inner try block 1
                System.out.println("Inner try block 1");
                int result = arr[2] / 0;  // ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Exception in inner try block 1: " + e);
            }

            try {
                // Inner try block 2
                System.out.println("Inner try block 2");
                System.out.println(arr[10]);  // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception in inner try block 2: " + e);
            }

            System.out.println("Rest of outer try block code");
        }

        
