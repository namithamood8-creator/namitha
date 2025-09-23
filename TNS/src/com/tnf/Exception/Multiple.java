package com.tnf.Exception;

public class Multiple {
	public static void main(String[] args) {
		try {
			String str="Hello";
			char ch=str.charAt(10);
			int num=10/0;
			System.out.println("character:" + ch);
			System.out.println("number:" + num);
		}
		catch(ArithmeticException e) {
			System.out.println("String Index out of Bounds Exception caught:"+e);
		}
		catch (Exception e)
		System.out.println("General Exception caught:"+e);
	}
	System.out.println("program continues after handling exception...";);
}
}