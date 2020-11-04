
/*
 * Author : Nidhi
 * Desc: Age exception
 */
package com.exceptionhandling;

import java.util.Scanner;

/**
 * This class checks whether age given is valid or not
 *
 */
public class AgeException {

	public static void main(String[] args) {
		/**
		 * we have taken a variable of integer type
		 */
		int age;
		/**
		 * taking input from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();

		/**
		 * calling a method to check the condition
		 */
		ageNotValied(age);
		sc.close();
	}

	private static void ageNotValied(int age) {
		try {
			if (age < 15)
				throw new Exception("Age is not valid");

			else
				System.out.println("The age you have entered is :" + age);

		} catch (Exception ex) {

			System.out.println("You have entered an in valid age :" + age);

		}
	}

}
