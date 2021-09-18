//Java Program to Find the Largest Among Three Numbers

package com.dayfiveproblem;
import java.util.Scanner;
public class LargestAmong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number");
		int number1 = scan.nextInt();
		System.out.println("Enter a second number");
		int number2 = scan.nextInt();
		System.out.println("Enter a Third number");
		int number3 = scan.nextInt();
		if (number1 > number2 && number1 > number3) {
			System.out.println(number1 + " first number is greater");
		} else if (number2 > number3) {
			System.out.println(number2 + " secound number is greater");
		} else {
			System.out.println(number3 + "  third number is greater");
		}
	}

}
