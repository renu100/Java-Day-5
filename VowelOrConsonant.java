//Java Program to Check Whether an Alphabet is Vowel or Consonant
package com.dayfiveproblem;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet ");
		ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " " + "is vowel");
		} else {
			System.out.println(ch + " is consonant");
		}
	}
}
