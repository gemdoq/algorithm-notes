package baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem1715 {
	public static void run() {
		// 스캐너 선언 후 초기화
		Scanner sc = new Scanner(System.in);
		// 정수 묶음갯수 선언 후 넥스트인트로 할당
		int N = sc.nextInt();
		// 우선순위큐<Long> 묶음큐 선언 후 최소 힙 초기화
		PriorityQueue<Long>  pq = new PriorityQueue<>();
		// 묶음갯수만큼 반복 실행
		for (int i = 0; i < N; i++) {
			// 우선순위큐에 넥스트인트로 받은 값 long으로 형변환하여 추가
			pq.add((long) sc.nextInt());
		}

		// long 비교총합 선언 후 0으로 초기화
		long total = 0;
		// 우선순위큐에 하나 이상일 동안 반복
		while (pq.size() > 1) {
			// long first 선언 후 우선순위큐의 첫요소(poll) 할당
			long first = pq.poll();
			// long second 선언 후 우선순위큐의 첫요소(poll) 할당
			long second = pq.poll();
			// long 합계 선언 후 first+second 값 할당
			long sum = first + second;
			// 비교총합에 합계값 누적
			total += sum;
			// 우선순위큐에 합계값 추가
			pq.add(sum);
		}

		// 비교총합 출력
		System.out.println(total);
	}
}
