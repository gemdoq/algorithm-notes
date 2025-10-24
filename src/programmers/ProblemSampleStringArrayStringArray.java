package programmers;

import java.util.Arrays;

public class ProblemSampleStringArrayStringArray {
	// 프로그래머스 제출용 solution 메서드
	// 예: banned_id에 매칭되는 user_id 조합 수
	public int solution(String[] user_id, String[] banned_id) {
		// 간단한 예시 구현 (실제 문제는 복잡)
		int count = 0;
		for (String user : user_id) {
			for (String banned : banned_id) {
				if (user.matches(banned.replace("*", "."))) {
					count++;
				}
			}
		}
		return count;
	}

	// 테스트 케이스 실행
	public static void run() {
		ProblemSampleStringArrayStringArray problem = new ProblemSampleStringArrayStringArray();
		// 테스트 케이스 (예: 프로그래머스 64064)
		String[][] inputsUserId = {{"frodo", "fradi", "crodo", "abc123", "frodoc"}, {"frodo", "fradi", "crodo"}};
		String[][] inputsBannedId = {{"fr*d*", "abc1**"}, {"*rodo", "*rodo"}};
		int[] expecteds = {2, 3};

		for (int i = 0; i < inputsUserId.length; i++) {
			String[] user_id = inputsUserId[i];
			String[] banned_id = inputsBannedId[i];
			int output = problem.solution(user_id, banned_id);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: user_id=" + Arrays.toString(user_id) + ", banned_id=" + Arrays.toString(banned_id));
			System.out.println("Output: " + output);
			System.out.println("Expected: " + expecteds[i]);
			System.out.println("Result: " + (output == expecteds[i] ? "Pass" : "Fail"));
			System.out.println();
		}
	}
}