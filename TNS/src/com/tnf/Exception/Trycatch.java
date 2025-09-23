package com.tnf.Exception;

public class Trycatch {
	public static void main(String[] args) {
		try {
			int number =10;
			int result=number/0;
			System.out.println("Result:"+ result);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught:"+e);
		}
		System.out.println("program continues after handling exception");
	}

}
