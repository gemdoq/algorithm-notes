package baekjoon;

import java.util.Scanner;

public class Problem5597 {
	public static void run() {
		// 스캐너를 선언하고 초기화
		Scanner sc = new Scanner(System.in);

		// 참거짓배열 submitted 선언하고 배열크기 31 할당(학생번호가 1부터 시작하므로 인덱스 0은 사용하지 않음으로써 직관적으로 인덱스와 학생 번호를 맞추기 위함)
		boolean[] submitted = new boolean[31];

		// 28번 반복 실행
		for (int i = 0; i < 28; i++) {
			// 정수 n 선언하고 넥스트인트로 할당
			int n =  sc.nextInt();
			// submitted의 n번째 요소를 초기값(false)에서 true로 변경
			submitted[n] = true;
		}

		// 1부터 30까지 30번 반복 실행(학생 번호가 1부터 시작하므로 학생번호와 인덱스를 맞추기 위해 i는 1부터 시작)
		for (int i = 1; i <= 30; i++) {
			// submitted 배열의 해당 요소가 false라면 실행
			if (!submitted[i]) {
				// 해당 i값 출력
				System.out.println(i);
			}
		}
	}
}
