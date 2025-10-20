package baekjoon;

import java.util.Scanner;

public class Problem14681 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 x 선언하고 넥스트인트로 할당하여 초기화
		int x = sc.nextInt();

		// 정수 y 선언하고 넥스트인트로 할당하여 초기화
		int y = sc.nextInt();

		// 정수 n 선언하고 사분면 n 반환하는 메서드 호출하여 할당
		int n = getQuadrant(x, y);

		// 사분면 출력
		System.out.println(n);
	}

	public static int getQuadrant(int x, int y) {
		// x > 0, y > 0 이면 1사분면
		if (x > 0 && y > 0) {
			return 1;
		}
		// x < 0, y > 0 이면 2사분면
		else if (x < 0 && y > 0) {
			return 2;
		}
		// x < 0, y < 0 이면 3사분면
		else if (x < 0 && y < 0) {
			return 3;
		}
		// x > 0, y < 0 이면 4사분면
		else {
			return 4;
		}
	}
}
