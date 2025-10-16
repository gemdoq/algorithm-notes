package programmers;

public class ProblemSample {

	public static void run() {
		// 정수 배열 선언 후 {1, 2, 3, 4}로 초기화
		int[] arr = {1, 2, 3, 4};

		// 정수 합계 선언 후 0으로 초기화
		int sum = 0;

		// 배열을 순회
		for (int num : arr) {
			// 합계에 배열 요소 값 누적
			sum += num;
		}
		// 합계 출력
		System.out.println("총 합: " + sum);
	}
}
