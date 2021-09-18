/*
Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is positive integer .
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
c. O/P -> Percentage of Head vs Tails 
*/

package com.dayfiveproblem;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {

		System.out.println("Enter the number hoe many time you want to flip the coin");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		// INITIALIZATION
		int head_cnt = 0, tail_cnt = 0;

		// COMPUTATION
		for (int i = 0; i < input; i++) {
			double random = Math.random();
			System.out.println(random);
			if (random < 0.5)
				tail_cnt++;
			else
				head_cnt++;

		}
		double heads = head_cnt / (double) input * 100;
		double tails = tail_cnt / (double) input * 100;
		System.out.println("Number of  head comes = " + head_cnt);
		System.out.println("Number of tail comes = " + tail_cnt);
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");
	}

}
