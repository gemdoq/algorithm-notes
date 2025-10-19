package baekjoon;

import java.util.Scanner;

public class Problem9498 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 score를 선언하고 넥스트라인으로 할당하여 초기화
		int score = sc.nextInt();

		// 문자열 grade를 선언하고, 문자열 grade 가져오는 메서드를 호출하여 할당
		String grade = getGrade(score);

		// grade를 출력
		System.out.println(grade);
	}

	// 정수 score 매개변수를 전달받아 문자열 grade를 반환하는 static 메서드
	public static String getGrade(int score) {
		// 90보다 크거나 같고 100보다 작거나 같으면 실행
		if(score >= 90 && score <= 100) {
			return "A";
		// 80보다 크거나 같고 90보다 작으면 실행
		} else if(score >= 80) {
			return "B";
		// 70보다 크거나 같고 80보다 작으면 실행
		} else if(score >= 70) {
			return "C";
		// 60보다 크거나 같고 70보다 작으면 실행
		} else if(score >= 60) {
			return "D";
		// 나머지 경우 실행
		} else {
			return "F";
		}
	}
}
