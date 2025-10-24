package programmers;

import java.util.Arrays;

public class ProblemSampleIntArray {
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		for (int i = num1; i <= num2; i++) {
			answer[i - num1] = numbers[i];
		}
		return answer;
	}

	public static void run() {
		ProblemSampleIntArray problem = new ProblemSampleIntArray();
		int[][] inputsNumbers = {{1, 2, 3, 4, 5}, {1, 3, 5}};
		int[] inputsNum1 = {1, 0};
		int[] inputsNum2 = {3, 2};
		int[][] expecteds = {{2, 3, 4}, {1, 3}};

		for (int i = 0; i < inputsNumbers.length; i++) {
			int[] numbers = inputsNumbers[i];
			int num1 = inputsNum1[i];
			int num2 = inputsNum2[i];
			int[] output = problem.solution(numbers, num1, num2);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: numbers=" + Arrays.toString(numbers) + ", num1=" + num1 + ", num2=" + num2);
			System.out.println("Output: " + Arrays.toString(output));
			System.out.println("Expected: " + Arrays.toString(expecteds[i]));
			System.out.println("Result: " + (Arrays.equals(output, expecteds[i]) ? "Pass" : "Fail"));
			System.out.println();
		}
	}
}
