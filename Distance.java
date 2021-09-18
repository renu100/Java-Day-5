/* Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function */

package com.dayfiveproblem;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		double x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x condinate");
		double x1 = sc.nextDouble();
		System.out.println("Enter y condinate");
		double y1 = sc.nextDouble();
		// calulating distance
		double distance = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		System.out.println(distance);

	}

}
