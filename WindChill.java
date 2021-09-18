/* Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).*/
package com.dayfiveproblem;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temprature(Number Should be above 50)");
		double t = sc.nextDouble();
		System.out.println("Enter Wind Speed(Number Should be between 3 to 120)");
		double v = sc.nextDouble();
		if (t > 50 && v < 120 && v > 3) {
			double windchill = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
			System.out.println("WindChill Value :- " + windchill);
		}
	}

}
