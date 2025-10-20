package baekjoon;

import java.util.Scanner;

public class Problem2739 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N 선언하고 넥스트인트로 할당하여 초기화
		int N = sc.nextInt();

		// static 메서드 호출하고 정수 N을 매개변수로 전달
		gugudan(N);
	}

	public static void gugudan(int N) {
		// 1부터 9까지 반복 실행
		for (int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = " + (N * i));
		}
	}
}
