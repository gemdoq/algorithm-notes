package baekjoon;

import java.util.Scanner;

public class Problem8393 {
	public static void run() {
		// 스캐너 선언 후 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 n을 선언하고 넥스트인트로 할당
		int n = sc.nextInt();

		// 정수 sum을 선언하고 0을 할당하여 초기화
		int sum = 0;

		// 1부터 n까지 반복 실행
		for (int i = 1; i <= n; i++) {
			// 정수 sum에 i를 누적
			sum += i;
		}

		// 정수 sum을 출력
		System.out.println(sum);
	}
}
