package com.fordemo;

///declaring a class
public class BreakContinue {

	// main method
	public static void main(String args[]) {

		System.out.println("-------With Break------");
		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}
		// break : to come out of the loop

		System.out.println("-------With continue-------");
		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				continue; // skips the iteration for that particular value
			System.out.println(i); // these statements are skipped
		}//end of continue
	}//end of main
}//end of class
