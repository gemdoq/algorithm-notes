package baekjoon;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem2501 {
	public static void run() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N 선언 후 넥스트인트로 할당
		int N = sc.nextInt();
		// 정수 K 선언 후 넥스트인트로 할당
		int K = sc.nextInt();

		// 해쉬셋 set 선언 및 초기화(중복 제거용)
		HashSet<Integer> set = new HashSet<>();

		// priorityqueue pq 선언 및 초기화(오름차순 정렬용)
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		// 1부터 N까지 반복 실행
		for (int i = 1; i <= N; i++) {
			// i가 N의 약수인지 확인
			if (N % i == 0) {
				// i를 set에 추가(중복이 아니면 true, 중복이면 false)
				if (set.add(i)) {
					// pq에 추가
					pq.offer(i);
				}
			}
		}

		// 정수 result 선언 및 초기화
		int result = 0;
		// K번 반복 실행
		for (int i = 1; i <= K; i++) {
			// pq가 비어 있으면 실행
			if (pq.isEmpty()) {
				// 정수 result값을 0으로 초기화
				result = 0;
				break;
			}
			// result에 pq에서 가장 작은 값 꺼내서 할당
			result = pq.poll();
		}

		// 정수 result 출력
		System.out.println(result);
	}

	public static void run2() {
		// 스캐너 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		// 정수 N 선언 후 넥스트인트로 할당
		int N = sc.nextInt();
		// 정수 K 선언 후 넥스트인트로 할당
		int K = sc.nextInt();

		// 정수 count 선언 및 0으로 초기화
		int count = 0;
		// 정수 result 선언 및 0으로 초기화
		int result = 0;

		// 1부터 N까지 반복
		for (int i = 1; i <= N; i++) {
			// N을 i로 나누었을 때 나머지가 0이면
			if (N % i == 0) {
				// count 1 증가
				count++;
				// count가 K와 같으면
				if (count == K) {
					// result에 i 할당
					result = i;
					// 반복문 종료
					break;
				}
			}
		}

		// result 출력 (만약 k번째 약수가 없으면 0 출력)
		System.out.println(result);
	}
}
