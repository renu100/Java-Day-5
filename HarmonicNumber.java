/* Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.*/

package com.dayfiveproblem;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number:-");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		double Harmonic = 0.0;
		for (int i = 1; i <= num; i++) {
			Harmonic = Harmonic + (double) 1 / i;
			System.out.println("Harmonic number's are :-" + Harmonic);
		}
	}
}
