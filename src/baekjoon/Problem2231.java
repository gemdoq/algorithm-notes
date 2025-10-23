package baekjoon;

import java.util.Scanner;

public class Problem2231 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N 선언 후 넥스트인트로 할당
		int N = sc.nextInt();

		// 정수 length 선언 후 자릿수(10의 제곱수+1) 구해서 할당
		int length = (int)(Math.log10(N) + 1);

		// 정수 start 선언 후 최소 생성자 값 할당(N = 최소 생성자 + 자릿수 * 9)
		int start = N - length * 9;

		// 정수 start가 음수면 0으로 초기화
		if (start < 0) start = 0;

		// 정수 result 선언 후 0으로 초기화
		int result = 0;

		// 정수 start에서 정수 N까지 반복
		for (int i = start; i <= N; i++) {
			// 정수 sum 선언 후 i 할당(분해합 누적용)
			int sum = i;
			// 정수 tmp 선언 후 i 할당(자릿수 합 계산용)
			int tmp = i;

			// 정수 tmp가 0보다 크면 실행
			while (tmp > 0) {
				// 정수 sum 값에 나머지 누적
				sum += tmp % 10;
				// 자릿수 감소
				tmp /= 10;
			}

			// 정수 sum이 정수 N과 같으면 실행
			if (sum == N) {
				// 정수 result에 i값 저장
				result = i;
				// 반복문 종료
				break;
			}
		}

		// 정수 result 출력(생성자가 없으면 0 출력)
		System.out.println(result);
	}
}
