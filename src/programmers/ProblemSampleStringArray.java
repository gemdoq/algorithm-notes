package programmers;

import java.util.Arrays;

public class ProblemSampleStringArray {
	public String[] solution(String[] strings) {
		String[] answer = new String[strings.length];
		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].toUpperCase();
		}
		return answer;
	}

	public static void run() {
		ProblemSampleStringArray problem = new ProblemSampleStringArray();
		String[][] inputs = {{"hello", "world"}, {"java", "code"}};
		String[][] expecteds = {{"HELLO", "WORLD"}, {"JAVA", "CODE"}};

		for (int i = 0; i < inputs.length; i++) {
			String[] input = inputs[i];
			String[] output = problem.solution(input);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: " + Arrays.toString(input));
			System.out.println("Output: " + Arrays.toString(output));
			System.out.println("Expected: " + Arrays.toString(expecteds[i]));
			System.out.println("Result: " + (Arrays.equals(output, expecteds[i]) ? "Pass" : "Fail"));
			System.out.println();
		}
	}
}