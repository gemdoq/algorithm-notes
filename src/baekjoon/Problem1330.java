package baekjoon;

import java.util.Scanner;

public class Problem1330 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 a를 선언하고 넥스트인트로 할당하여 초기화
		int a = sc.nextInt();

		// 정수 b를 선언하고 넥스트인트로 할당하여 초기화
		int b = sc.nextInt();

		// a가 b보다 크면 실행
		if(a > b) {
			// >를 출력
			System.out.println(">");
		} else if( a < b) {
			// <를 출력
			System.out.println("<");
		} else {
			// ==를 출력
			System.out.println("==");
		}
	}
}
