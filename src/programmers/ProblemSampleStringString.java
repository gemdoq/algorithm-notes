package programmers;

public class ProblemSampleStringString {
	// 프로그래머스 제출용 solution 메서드
	// 예: 문자열에서 특정 문자를 제거
	public String solution(String my_string, String letter) {
		return my_string.replaceAll(letter, "");
	}

	// 테스트 케이스 실행
	public static void run() {
		ProblemSampleStringString problem = new ProblemSampleStringString();
		// 테스트 케이스 (예: 프로그래머스 120826)
		String[][] inputs = {{"abcdef", "f"}, {"BCBdbe", "B"}};
		String[] expecteds = {"abcde", "Cdbe"};

		for (int i = 0; i < inputs.length; i++) {
			String my_string = inputs[i][0];
			String letter = inputs[i][1];
			String output = problem.solution(my_string, letter);
			System.out.println("Test " + (i + 1));
			System.out.println("Input: my_string=" + my_string + ", letter=" + letter);
			System.out.println("Output: " + output);
			System.out.println("Expected: " + expecteds[i]);
			System.out.println("Result: " + (output.equals(expecteds[i]) ? "Pass" : "Fail"));
			System.out.println();
		}
	}
}
