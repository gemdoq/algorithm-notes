package baekjoon;

import java.util.Scanner;

public class Problem2562 {
	public static void run() {
		// 스캐너를 선언하고 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 max 선언하고 초기화
		int max = 0;

		// 정수 maxPosition 선언하고 초기화
		int maxPosition = 0;

		// 9번 반복 실행('몇 번째'인지 알아야 하므로 i의 초기값을 직관적으로 1로 초기화)
		for (int i = 1; i <= 9; i++) {
			// 정수 num 선언하고 넥스트인트로 할당
			int num = sc.nextInt();

			// num이 max보다 크면 실행
			if (num > max) {
				// max에 num값을 저장
				max = num;
				// maxPosition에 i값을 저장
				maxPosition = i;
			}
		}

		// 정수 max 출력
		System.out.println(max);

		// 정수 maxPosition 출력
		System.out.println(maxPosition);
	}
}
