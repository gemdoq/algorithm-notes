package baekjoon;

import java.util.Scanner;

public class Problem2753 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 year 선언하고 넥스트라인으로 할당하여 초기화
		int year = sc.nextInt();

		// 정수 result 선언하고, result 반환하는 메서드 호출하여 할당
		int result = getResult(year);

		// result 출력
		System.out.println(result);
	}

	// 정수 year 매개변수를 전달받아 정수 result 반환하는 static 메서드
	public static int getResult(int year) {
		// 정수 result 선언하고 초기값 0으로 할당하여 초기화
		int result = 0;

		// 정수 year가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 실행
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			result = 1;
		}

		// 정수 result 반환
		return result;
	}
}
