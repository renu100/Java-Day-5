/*Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.*/

package com.dayfiveproblem;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
			System.out.println(year + "it is leap year");
		} else {
			System.out.println(year + "it is not leap year");
		}
	}

}
