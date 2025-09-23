package com.tnf.Exception;

public class Nestedtry {
	public static void main(String[] args) {
		try {
			int num=10/2;
			System.out.println("Outer try: Division succesful:" +num);
			try {
				String str="Hello";
				char ch=str.charAt(10);
				
			}
		}
	}

}
