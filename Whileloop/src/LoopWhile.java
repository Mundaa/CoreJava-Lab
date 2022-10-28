import java.util.Scanner;

//declaring a class
public class LoopWhile {

	private static String fruit;

	//main started
	public static void main(String[] args) {

//		int i = 0;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}

		
		Scanner sc = new Scanner(System.in);
		boolean ch = false;

		//do while strated
		do // ch==true
		{
			System.out.println("Enter a fruit:");
			fruit = sc.next();
			System.out.println("Do you want to enter more (true/false):");
			ch = sc.nextBoolean();
		} while (ch);
		//do while end

		sc.close();

	}//end of main

}//end of class
