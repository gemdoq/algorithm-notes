package baekjoon;

import java.util.Scanner;

public class Problem11720 {
	public static void run() {
		// 스캐너를 선언하고 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N을 선언하고 넥스트인트로 할당
		int N = sc.nextInt();

		// 넥스트라인으로 버퍼 정리
		sc.nextLine();

		// 문자열 numbers를 선언하고 넥스트라인으로 할당
		String numbers = sc.nextLine();

		// 정수 sum을 선언하고 0으로 초기화
		int sum = 0;

		// 1부터 N까지 N번 반복 실행
		for (int i = 0; i < N; i++) {
			// 정수 sum에 charAt(i)로 문자열에서 문자를 추출하여 아스키문자 차를 누적
			sum += numbers.charAt(i) - '0';
		}

		// sum을 출력
		System.out.println(sum);
	}
}
