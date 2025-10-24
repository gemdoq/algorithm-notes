package programmers;

import java.util.Arrays;

public class ProblemSampleIntLong {
	// 프로그래머스 제출용 solution 메서드
	// 예: n의 k번째 제곱근을 포함하는 배열 반환
	public int[] solution(int n, long k) {
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			answer[i] = (int) Math.pow(i + 1, k);
		}
		return answer;
	}

	// 테스트 케이스 실행
	public static void run() {
		ProblemSampleIntLong problem = new ProblemSampleIntLong();
		// 테스트 케이스 (가상)
		int[][] inputsN = {{3}, {4}};
		long[] inputsK = {2, 3};
		int[][] expecteds = {{1, 4, 9}, {1, 8, 27, 64}};

		for (int i = 0; i < inputsN.length; i++) {
			int n = inputsN[i][0];
			long k = inputsK[i];
			int[] output = problem.solution(n, k);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: n=" + n + ", k=" + k);
			System.out.println("Output: " + Arrays.toString(output));
			System.out.println("Expected: " + Arrays.toString(expecteds[i]));
			System.out.println("Result: " + (Arrays.equals(output, expecteds[i]) ? "Pass" : "Fail"));
			System.out.println();
		}
	}
}
