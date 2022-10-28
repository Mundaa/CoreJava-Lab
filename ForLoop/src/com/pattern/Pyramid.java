package com.pattern;

//declaring a class
public class Pyramid {

	//Program to print:
	// 1
	// 1 2
	// 1 2 3 pattern
	static void pattern1(int num) {
		//for loop started
		for (int i = 1; i <= num; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
		}//end of for loop
	}//end of static

	
	//Program to print:
	// 1 2 3
	// 1 2
	// 1

	static void pattern2(int num) {
		//for loop started
		for (int i = num; i >= 1; i--) {
			System.out.println();
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
		}//end of for loop
	}//end of static

	//main started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1(6);
		System.out.println(""
				+ "");
		System.out.println("--------------------------------------------");
		pattern2(5);

	}//end of main

}//end of class
