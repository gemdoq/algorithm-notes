package baekjoon;

import java.util.Scanner;

public class Problem10950 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 T 선언하고 넥스트인트로 할당
		int T = sc.nextInt();

		// T번 반복 실행
		for (int i = 0; i < T; i++) {
			// 정수 A를 선언하고 넥스트인트로 할당
			int A = sc.nextInt();

			// 정수 B를 선언하고 넥스트인트로 할당
			int B = sc.nextInt();

			// A와 B를 합한 값을 출력
			System.out.println(A + B);
		}
	}
}
