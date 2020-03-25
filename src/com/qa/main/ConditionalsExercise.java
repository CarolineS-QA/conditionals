package com.qa.main;

public class ConditionalsExercise {

	// part 1 and 3
	public int sumOrMultiply(int number, int secondNumber, boolean sumOrProduct) {
		if (sumOrProduct == true) {
			int sum = number + secondNumber;
			System.out.println("Working out sum...\n" + "Sum is: " + sum);
			if (number % 2 == 0 || secondNumber % 2 == 0) {
				System.out.println("At least one of your numbers is even.");
				// if firstNumber OR secondNumber has no remainder (equal to zero) its even
				return 0;
			} else {
				return (sum);
			}
		} else {
			int product = number * secondNumber;
			System.out.println("Working out product...\n" + "Product is: " + product);
			if (number % 2 == 0 || secondNumber % 2 == 0) {
				System.out.println("At least one of your numbers is even.");
				// if firstNumber OR secondNumber has no remainder (equal to zero) its even
				return 0;
			} else {
				return (product);
			}
		}

	}
	// part 2 appendix A method
//	public void appendixAFlowChart(int start) {
//		if (start > 2000) {
//			// if the input is more than 2000, A will appear in the console
//			System.out.println("A - your input is more that 2000... (sorting)");
//			if (start > 6000) {
//				// if the input if more than 6000, a C will appear after A
//				System.out.println("C - your input is more than 6000. \n END");
//			} else {
//				// otherwise if its more than 2000 but less than 6000, a B will appear
//				System.out.println("B - your input is between 2000 and 6000... (sorting)");
//				if (start > 4000) {
//					// after printing a B it will sort for more or less than 4000
//					System.out.println("D - your input is between 4000 and 6000. \n END");
//				} else {
//					System.out.println("E - your input is between 2000 and 4000. \n END");
//				}
//			}
//		} else {
//			// input is less than 2000
//			System.out.println("1 - your input is less than 2000... (sorting)");
//			if (start > 100) {
//				System.out.println("3 - your input is between 100 and 2000... (sorting)");
//				if (start > 600) {
//					System.out.println("5 - your input is between 600 and 2000. \n END");
//				} else {
//					System.out.println("4 - your input is between 100 and 600... (sorting)");
//					if (start > 500) {
//						System.out.println("6 - your input is between 500 and 600. \n END");
//					} else {
//						System.out.println("7 - your input is between 100 and 500. \n END");
//					}
//				}
//			} else {
//				System.out.println("2 - your input is less than 100. \n END");
//			}
//		}
//
//	}

}
