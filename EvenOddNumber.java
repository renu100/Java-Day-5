//Java Program to Check Whether a Number is Even or Odd
package com.dayfiveproblem;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even number" + num);
		} else {
			System.out.println("Odd number" + num);
		}
	}

}
