package com.tnf.Exception;
public class StringIndex{
public static void main (String[] args) {
	try {
		String str="Hello";
		char ch=str.charAt(10);
		System.out.println("character at index 10:"+ch);
	}
	catch(StringIndexOutOfBoundsException e) {

		System.out.println("Exception caught:"+e);
	}
	System.out.println("Exception caught:" );
}

	
	}

	

