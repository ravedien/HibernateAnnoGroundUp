package com.hibernate.core.util;

public class Static {
	static{
		int x = 5;
	}
	
	static int x,y;
	
	public static void main(String[] args) {
		System.out.println(x+" "+y);
		x--;
		myMethod();
		System.out.println(x+ " " +y);
	}

	private static void myMethod() {
		System.out.println(x+ " " +y);
		y= ++x + x++;
		System.out.println(x+ " " +y);
		
	}
	
}
