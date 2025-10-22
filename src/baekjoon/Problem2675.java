package baekjoon;

import java.util.Scanner;

public class Problem2675 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 T 선언하고 넥스트인트로 할당
		int T = sc.nextInt();

		// 버퍼에 남은 개행 문자 제거를 위한 넥스트라인
		sc.nextLine();

		// 정수 T만큼 반복 실행
		for (int i = 0; i < T; i++) {
			// 문자열 testcase를 선언하고 넥스트라인으로 할당
			String testcase = sc.nextLine();

			// 문자열배열 arr 선언하고 문자열 testcase를 나눠서 할당
			String[] arr = testcase.split(" ");

			// 정수 R 선언하고 문자열배열 arr의 첫번째 요소를 정수로 변환하여 할당
			int R = Integer.parseInt(arr[0]);

			// 문자열 S 선언하고 문자열배열 arr의 첫번째 요소를 할당
			String S = arr[1];

			// 문자열 S 길이만큼 반복 실행
			for (int j = 0; j < S.length(); j++) {
				// 정수 R만큼 해당 인덱스의 문자 출력
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			// 개행 출력
			System.out.println();
		}
	}

	public static void run2() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 T 선언하고 넥스트인트로 할당
		int T = sc.nextInt();

		// 버퍼에 남은 개행 문자 제거를 위한 넥스트라인
		sc.nextLine();

		// 정수 T만큼 반복 실행
		for (int i = 0; i < T; i++) {
			// 정수 R 선언하고 넥스트인트로 할당
			int R = sc.nextInt();

			// 문자열 S 선언하고 넥스트라인으로 버퍼에 남아있는 한 줄 전체(개행 문자를 포함한)를 읽고, 공백을 제거(앞뒤)하여 할당
			String S = sc.nextLine().trim();

			// StringBuilder 타입의 result를 선언하고 StringBuilder 객체를 생성하여 할당(result 변수 초기화)
			StringBuilder result = new StringBuilder();

			// 문자열 S 길이만큼 반복 실행
			for (int j = 0; j < S.length(); j++) {
				// 문자열 c를 선언하고 문자열 S의 인덱스 j의 문자를 할당
				char c =  S.charAt(j);

				// R번 반복 실행
				for (int k = 0; k < R; k++) {
					// StringBuilder인 result에 문자열 c를 추가
					result.append(c);
				}
			}
			// 완성된 StringBuilder인 result를 println으로 출력
			System.out.println(result); // println() 메서드 사용 시, 내부적으로 출력하고자 하는 Object(객체 StringBuilder)의 toString() 메서드 자동 호출
		}
	}
}
