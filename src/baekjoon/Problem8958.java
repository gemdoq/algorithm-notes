package baekjoon;

import java.util.Scanner;

public class Problem8958 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N 선언 후 넥스트인트로 할당
		int N = sc.nextInt();
		// 버퍼에 남은 개행 문자 제거를 위한 넥스트라인
		sc.nextLine();

		// N번 반복 실행
		for (int i = 0; i < N; i++) {
			// 문자열 testcase 선언 후 넥스트라인으로 할당
			String testcase = sc.nextLine();

			// 정수 sum 선언
			int sum = 0;

			// 정수 consecutive 선언
			int consecutive = 0;

			// 문자열 testcase의 길이만큼 반복 실행
			for (int j = 0; j < testcase.length(); j++) {
				// testcase의 j번째 문자가 O면 실행
				if (testcase.charAt(j) == 'O') {
					// 정수 consecutive에 1씩 누적
					consecutive++;
					// 정수 sum에 정수 consecutive를 누적
					sum += consecutive;
				} else {
					// 정수 consecutive에 저장된 값을 0으로 초기화
					consecutive = 0;
				}
			}

			// 정수 sum 출력
			System.out.println(sum);
		}
	}
}
