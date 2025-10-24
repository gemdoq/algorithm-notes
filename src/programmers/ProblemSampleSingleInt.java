package programmers;

public class ProblemSampleSingleInt {
	public int solution(int n) {
		return n * 2; // 예: 입력 2배
	}

	public static void run() {
		ProblemSampleSingleInt problem = new ProblemSampleSingleInt();
		int[] inputs = {5, 10};
		int[] expecteds = {10, 20};

		for (int i = 0; i < inputs.length; i++) {
			int input = inputs[i];
			int output = problem.solution(input);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: " + input);
			System.out.println("Output: " + output);
			System.out.println("Expected: " + expecteds[i]);
			System.out.println("Result: " + (output == expecteds[i] ? "Pass" : "Fail"));
			System.out.println();
		}
	}
}
