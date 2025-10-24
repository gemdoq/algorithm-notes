package programmers;

import java.util.Arrays;

public class ProblemSampleIntIntArray {
	// 프로그래머스 제출용 solution 메서드
	// 예: money 배열에서 n원을 만드는 방법 수
	public int solution(int n, int[] money) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int m : money) {
			for (int i = m; i <= n; i++) {
				dp[i] += dp[i - m];
			}
		}
		return dp[n];
	}

	// 테스트 케이스 실행
	public static void run() {
		ProblemSampleIntIntArray problem = new ProblemSampleIntIntArray();
		// 테스트 케이스 (예: 프로그래머스 12907)
		int[] inputsN = {5, 5};
		int[][] inputsMoney = {{1, 2, 5}, {2, 3}};
		int[] expecteds = {4, 2};

		for (int i = 0; i < inputsN.length; i++) {
			int n = inputsN[i];
			int[] money = inputsMoney[i];
			int output = problem.solution(n, money);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: n=" + n + ", money=" + Arrays.toString(money));
			System.out.println("Output: " + output);
			System.out.println("Expected: " + expecteds[i]);
			System.out.println("Result: " + (output == expecteds[i] ? "Pass" : "Fail"));
			System.out.println();
		}
	}
}
