package programmers;

import java.util.Arrays;

public class ProblemSampleInt2DArray {
	public int[][] solution(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] answer = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				answer[i][j] = matrix[i][j] * 2;
			}
		}
		return answer;
	}

	public static void run() {
		ProblemSampleInt2DArray problem = new ProblemSampleInt2DArray();
		int[][][] inputs = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		int[][][] expecteds = {{{2, 4}, {6, 8}}, {{10, 12}, {14, 16}}};

		for (int i = 0; i < inputs.length; i++) {
			int[][] input = inputs[i];
			int[][] output = problem.solution(input);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: " + array2DToString(input));
			System.out.println("Output: " + array2DToString(output));
			System.out.println("Expected: " + array2DToString(expecteds[i]));
			System.out.println("Result: " + (arrays2DEqual(output, expecteds[i]) ? "Pass" : "Fail"));
			System.out.println();
		}
	}

	private static String array2DToString(int[][] arr) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < arr.length; i++) {
			sb.append(Arrays.toString(arr[i]));
			if (i < arr.length - 1) sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}

	private static boolean arrays2DEqual(int[][] arr1, int[][] arr2) {
		if (arr1.length != arr2.length) return false;
		for (int i = 0; i < arr1.length; i++) {
			if (!Arrays.equals(arr1[i], arr2[i])) return false;
		}
		return true;
	}
}
