package com.cg.eis.exception;

import java.util.Scanner;

public class MainException {

	public static void main(String[] args) {
		/**
		 * employee object is created
		 */
		EmployeeException employee = new EmployeeException();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary:");
		employee.setSalary(sc.nextFloat());

		salaryException(employee.getSalary());
	}

	private static void salaryException(float salary) {
		/**
		 * checking whether salary <3000 if it is true exception is thrown
		 */
		try {
			if (salary < 3000)
				throw new Exception();
			else
				System.out.println("The salary of the employee is " + salary);
		} catch (Exception e) {
			System.out.println("Salary cannot be less than 3000");
		}
	}

}
