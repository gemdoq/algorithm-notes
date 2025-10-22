package baekjoon;

import java.util.Scanner;

public class Problem1546 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N 선언하고 넥스트인트로 할당
		int N = sc.nextInt();

		// 정수 배열 scores 선언하고 N크기의 배열로 초기화
		int[] scores = new int[N];

		// 정수 max 선언하고 초기 최대값은 `가장 작은 값`을 의미하는 `Integer.MIN_VALUE` 할당
		int max = Integer.MIN_VALUE;

		// N번 반복 실행
		for (int i = 0; i < N; i++) {
			// 정수 배열 scores의 해당 요소에 넥스트인트로 할당
			scores[i] = sc.nextInt();

			// 배열의 해당 요소가 정수 max보다 크면 실행
			if (scores[i] > max) {
				// 정수 max에 배열의 해당 요소를 할당
				max = scores[i];
			}
		}

		// 실수 sum 선언하고 0을 할당해서 초기화
		double sum = 0;

		// N번 반복 실행
		for (int i = 0; i < N; i++) {
			// 실수 sum에 정수 배열 scores의 해당 요소를 정수 max로 나누고 100을 곱해서 누적
			sum += (double) scores[i] / max * 100;
		}

		// 실수 avg를 선언하고 실수 sum을 정수 N으로 나눈 값을 할당
		double avg = sum / N;

		// 실수 avg를 출력
		System.out.println(avg);
	}
}
