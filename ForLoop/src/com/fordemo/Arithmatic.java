package com.fordemo;

import java.util.Scanner;

//declaring a class
public class Arithmatic {

	private static void printFactorial(int num) {

		long fact = 1;
		for (int i = num; i > 1; i--) {
			fact = fact * i;
			System.out.print(fact + " ");

		}//end of for loop
		System.out.println("The factorial is :" + fact);
		System.out.println();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			System.out.print(fact + " ");

		}//end of for loop
		System.out.println("The factorial is :" + fact);

	}//end of static

	private static void checkPrime(int num) {

		boolean flag = false;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number ");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number ");
					flag = true;
					break;
				}//end of if
			}//end of for loop

			if (!flag) {
				System.out.println(num + "  is a prime number");
			}//end of if
		}//end of else
	}//end of static

	//main started
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int number = sc.nextInt();
		// printFactorial(number);
		checkPrime(number);

		sc.close();

	}//end of main

}//end of class
