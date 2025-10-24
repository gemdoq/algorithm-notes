package programmers;

public class ProblemSampleIntInt {
	// 프로그래머스 제출용 solution 메서드
	// 예: 두 수의 합
	public int solution(int num1, int num2) {
		return num1 + num2;
	}

	// 테스트 케이스 실행
	public static void run() {
		ProblemSampleIntInt problem = new ProblemSampleIntInt();
		// 테스트 케이스 (예: 프로그래머스 120802)
		int[][] inputs = {{2, 3}, {100, 2}};
		int[] expecteds = {5, 102};

		for (int i = 0; i < inputs.length; i++) {
			int num1 = inputs[i][0];
			int num2 = inputs[i][1];
			int output = problem.solution(num1, num2);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: num1=" + num1 + ", num2=" + num2);
			System.out.println("Output: " + output);
			System.out.println("Expected: " + expecteds[i]);
			System.out.println("Result: " + (output == expecteds[i] ? "Pass" : "Fail"));
			System.out.println();
		}
	}
}
