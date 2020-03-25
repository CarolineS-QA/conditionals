package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// variables to modify for part 1
		int firstNumber = 4;
		int secondNumber = 5;
		Boolean trueToSumFalseForProduct = false;

//		// variables for part 2 (Appendix A)
//		int inputA = 450;

		// instance class to use methods
		ConditionalsExercise callMethod = new ConditionalsExercise();

		// part 1 and 3 method
		callMethod.sumOrMultiply(firstNumber, secondNumber, trueToSumFalseForProduct);

//		// part 2 appendix method
//		callMethod.appendixAFlowChart(inputA);
	}

}
