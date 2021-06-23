package com.srm.cjava.wk01.day01;

import java.util.Scanner;
import java.util.logging.Logger;

public class PrimeAndSumOfDigit {
	public static final Logger logg = Logger.getLogger(PrimeAndSumOfDigit.class.getName());

	public static void main(String[] args) {
		logg.info("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// PRIME NUMBER
		logg.info("PRIME NUMBER");
		boolean prime = false;
		if (number < 0) {
			logg.info(number + "is not a valid number");
		} else if (number == 0 || number == 1) {
			logg.info(number + " is not a Prime Number");
		} else {
			int val = number / 2;
			for (int i = 2; i <= val; i++) {
				if (val % i == 0) {
					logg.info(number + " is not a Prime Number");
					prime = true;
					break;
				}
			}
			if (prime != true) {
				logg.info(number + " is a Prime Number");
			}
		}
		// sum of digits
		logg.info("----------------------------------------------");
		logg.info("SUM OF DIGITS");
		int digit;
		int sum = 0;
		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println("Sum of digits" + sum);
		sc.close();
	}
}