//Java Program to Compute Quotient and Remainder
package com.dayfiveproblem;

import java.util.Scanner;

public class QuotientRemender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to divide :- ");
		int number = sc.nextInt();
		System.out.println("Enter a number by which you divide :- ");
		int number1 = sc.nextInt();
		int quotient = number / number1;
		int remender = number % number1;
		System.out.println("Quotient is :- " + quotient);
		System.out.println("Remender is :- " + remender);

	}

}
