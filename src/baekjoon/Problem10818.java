package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10818 {
	// 배열의 정렬 메서드를 사용 → 정렬은 순회보다 더 많은 비교 및 데이터 이동을 포함하므로 오버헤드 있음. 공간복잡도는 O(N)이지만, 시간복잡도가 O(N log N).
	public static void run() {
		// 스캐너를 선언하고 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N을 선언하고 넥스트인트로 입력받는 값으로 초기화
		int N = sc.nextInt();

		// 정수 배열 arr를 선언하고 정수 N 크기의 배열로 초기화
		int[] arr = new int[N];

		// 1부터 N까지 반복 실행
		for (int i = 0; i < N; i++) {
			// 정수 배열 arr에 넥스트인트로 받는 값을 추가
			arr[i] = sc.nextInt();
		}

		// 정수 배열의 요소들을 오름차순으로 정렬
		Arrays.sort(arr);

		// 정수 배열의 첫번째(최소값)와 N번째 요소(최대값)를 출력
		System.out.println(arr[0]+" "+arr[N-1]);
	}

	// 입력받으면서 동시에 최소값과 최대값을 갱신 → 배열 저장이 없고, 정렬이 없음. 공간복잡도는 O(N)으로 동일하지만, 시간복잡도가 O(N)으로 동일함.
	public static void run2() {
		// 스캐너를 선언하고 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N을 선언하고 넥스트인트로 입력받는 값으로 초기화
		int N = sc.nextInt();

		// 정수 min 선언하고 초기 최소값은 `가장 큰 값`을 의미하는 `Integer.MAX_VALUE` 할당
		int min = Integer.MAX_VALUE;

		// 정수 max 선언하고 초기 최대값은 `가장 작은 값`을 의미하는 `Integer.MIN_VALUE` 할당
		int max = Integer.MIN_VALUE;

		// 1부터 N까지 반복 실행
		for (int i = 0; i < N; i++) {
			// 정수 input을 선언하고 넥스트인트로 입력받는 값으로 초기화
			int input = sc.nextInt();

			// input이 min보다 작으면 실행
			if (input < min) {
				// min에 input값을 저장
				min = input;
			}
			// input이 max보다 크면 실행
			if (input > max) {
				// max에 input값을 저장
				max = input;
			}
		}

		// 정수 min(최소값)와 max(최대값)를 출력
		System.out.println(min+" "+max);
	}
}
