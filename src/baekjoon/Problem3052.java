package baekjoon;

import java.util.Scanner;

public class Problem3052 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 참거짓 배열 remainderCheck 선언 후 42 크기 배열로 초기화
		boolean[] remainderCheck = new boolean[42];

		// 10번 반복 실행
		for (int i = 0; i < 10; i++) {
			// 정수 num 선언 후 넥스트인트로 할당
			int num = sc.nextInt();
			// 정수 remainder 선언 후 num을 42로 나눈 나머지를 할당
			int remainder = num % 42;
			// 참거짓 배열 remainderCheck의 remainder번째 요소를 true로 변경
			remainderCheck[remainder] = true;
		}

		// 정수 count 선언 후 0으로 초기화
		int count = 0;

		// 참거짓 배열 remainderCheck 순회하며 실행
		for (boolean b : remainderCheck) {
			// 배열의 해당 요소가 true라면 실행
			if (b) {
				// 정수 count에 1씩 누적
				count++;
			}
		}

		// 정수 count 출력
		System.out.println(count);
	}
}
