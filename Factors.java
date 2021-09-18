/* Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.*/

package com.dayfiveproblem;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		System.out.println("Enter a number:-");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factor of " + num + " is");
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num /= i;
				System.out.print(i + " ");
			}
		}
	}

}
