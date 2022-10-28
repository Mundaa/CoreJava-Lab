package com.fordemo;

//declaring a class
public class Print1 {

	static void printEven() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			// end if
		}
		// end for loop
	}

	static void infiniteLoop() {
		// infinite for loop
		for (;;) {
			System.out.println("Hello");

		}//end of for loop
	}//end of static

	private static void printTable(int num) {
		

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}//end of for loop

	}//end of static

	//main started
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printEven();

		printTable(Integer.parseInt(args[0]));

		// infiniteLoop();
	}//end of main

}//end of class
