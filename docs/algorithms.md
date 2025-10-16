# Algorithms

## Overview
알고리즘은 문제를 단계별로 해결하는 절차와 방법
효율적인 설계는 프로그램 성능 개선과 문제 해결에 도움됨

## What is an Algorithm?
알고리즘은 문제 해결을 위한 명확하고 순차적인 단계와 규칙
입력 데이터를 받아 처리하여 원하는 결과를 산출하는 절차
종료 조건이 있고, 효율적이어야 함

---

## 1. 재귀 (Recursion)

### 개념
재귀는 함수가 자기 자신을 호출하는 프로그래밍 기법
복잡한 문제를 같은 유형의 작은 문제로 나누어 해결할 때 유용
분할 정복, DFS, 백트래킹 등 고급 알고리즘의 근본적인 사고방식

### 기본 구조
- 기본 사례: 재귀 종료 조건. 무한 호출 방지 목적
- 재귀 사례: 함수가 자기 자신을 다시 호출하여 문제를 해결하는 부분

### 예시 1: 팩토리얼 (n!)

```java
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) return 1; // 기본 사례 (재귀 종료 조건)
        return n * factorial(n - 1); // 재귀 사례 (자기 자신 호출)
    }
}
```

### 예시 2: 피보나치 수열 (재귀 버전)

```java
public class Fibonacci {
    public static int fib(int n) {
        if (n < 2) return n;  // 기본 사례 (F(0)=0, F(1)=1)
        return fib(n - 1) + fib(n - 2); // 재귀 사례
    }
}
```

### 중요 개념: 스택 메모리 구조
재귀 함수 호출 시, 각 호출은 호출 스택 (Call Stack)에 쌓임
기본 사례에 도달하면 호출이 역순으로 종료되면서 스택에서 해제됨

---

## 2. 선형 탐색 (Linear Search)

### 개념
선형 탐색은 배열의 처음부터 끝까지 원소를 하나씩 순차적으로 비교해 원하는 값을 찾는 가장 단순한 탐색 알고리즘
데이터가 정렬되어 있지 않아도 사용 가능
* 시간 복잡도: $\text{O}(n)$

### 작동 원리
1. 배열 첫 원소부터 목표값을 찾을 때까지 하나씩 비교
2. 찾으면 해당 인덱스 반환
3. 끝까지 찾지 못하면 `-1` 반환

### 자바 예시 코드

```java
public class LinearSearch {
	public static int linearSearch(int[] arr, int target) {

		// 1. 배열의 첫 번째 요소(인덱스 0)부터 마지막 요소까지 순회 시작
		// 'i'는 현재 보고 있는 배열 요소의 위치(인덱스)를 나타냄
		for (int i = 0; i < arr.length; i++) {

			// 2. 현재 인덱스(i)의 배열 값(arr[i])이 찾으려는 값(target)과 같은지 비교
			if (arr[i] == target) {
				// 3. 만약 값이 같다면, 탐색에 성공했으므로 현재 인덱스(i)를 즉시 반환하고 메서드 종료
				return i;
			}
		}

		// 4. 반복문이 끝날 때까지 target 값을 찾지 못했다면
		// 배열 전체를 다 살펴보았다는 의미
		// 찾지 못했음을 나타내는 특정한 값인 -1을 반환
		return -1;
	}
}
```

---

## 3. 버블 정렬 (Bubble Sort)

### 개념
버블 정렬은 인접한 원소를 비교해 큰 값을 뒤로 보내면서 정렬
단순하고 정렬의 기본 개념을 이해하기 좋음
* 시간 복잡도: $\text{O}(n^2)$

#### 동작 과정 예시:
`[5, 3, 8, 4, 2] → [3, 5, 4, 2, 8] → [3, 4, 2, 5, 8] → ...`

```java
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		// 배열의 길이(전체 요소의 개수)를 저장
		int n = arr.length;

		// 1. 외부 반복문: 정렬을 몇 번 반복할지 결정
		// 배열의 크기(n)만큼 반복하면 정렬이 완료되므로, n-1번 반복
		// 매 반복마다 가장 큰 값이 배열의 맨 뒤로 확정됨 (정렬 범위가 하나씩 줄어듦)
		for (int i = 0; i < n - 1; i++) {

			// 2. 내부 반복문: 인접한 두 요소를 비교하고 교환하는 실제 작업 수행
			// 정렬이 완료된 맨 뒤의 요소들(i개)은 다시 비교할 필요가 없으므로 범위를 줄임
			// 'n - 1 - i'는 아직 정렬되지 않은 부분까지만 순회하겠다는 뜻
			for (int j = 0; j < n - 1 - i; j++) {

				// 3. 인접한 두 요소(arr[j]와 arr[j+1])를 비교
				// 만약 현재 요소(arr[j])가 다음 요소(arr[j+1])보다 크다면, 순서가 잘못된 것
				if (arr[j] > arr[j + 1]) {

					// 4. 두 요소의 위치를 교환 (Swap)
					// 임시 변수(temp)를 사용하여 arr[j] 값을 잠시 보관
					int temp = arr[j];

					// arr[j] 자리에 더 작은 값(arr[j+1])을 넣음
					arr[j] = arr[j + 1];

					// arr[j+1] 자리에 원래 arr[j]였던 큰 값(temp)을 넣음
					arr[j + 1] = temp;
				}
				// 이 과정을 반복하며 가장 큰 값이 배열의 오른쪽 끝으로 이동함
			}
		}
	}
}
```

---

## 4. 선택 정렬 (Selection Sort)

### 개념
선택 정렬은 배열에서 최솟값을 찾아 맨 앞 요소와 교체하며 정렬
버블 정렬보다 비교 횟수는 적음
* 시간 복잡도: $\text{O}(n^2)$

```java
public class SelectionSort {
	public static void selectionSort(int[] arr) {
		// 배열의 길이(전체 요소의 개수)를 저장
		int n = arr.length;

		// 1. 외부 반복문: 배열의 앞에서부터 하나씩 정렬된 위치를 확정
		// 마지막 요소는 자동으로 정렬되므로 n-1번까지만 반복
		for (int i = 0; i < n - 1; i++) {

			// 2. 현재 정렬하려는 위치(i)를 가장 작은 값이 있는 위치라고 가정하고 시작
			int minIdx = i;

			// 3. 내부 반복문: 정렬되지 않은 나머지 부분(i+1부터 끝까지)에서 실제 최솟값을 탐색
			for (int j = i + 1; j < n; j++) {

				// 4. 현재까지 찾은 최솟값(arr[minIdx])과 배열의 다음 값(arr[j])을 비교
				if (arr[j] < arr[minIdx]) {
					// 5. 만약 arr[j]가 더 작다면, 최솟값의 위치(minIdx)를 j로 업데이트
					minIdx = j;
				}
			}

			// 6. 탐색이 끝나면, 현재 위치(i)와 찾은 최솟값의 위치(minIdx)를 교환 (Swap)
			// 즉, 가장 작은 값을 정렬되지 않은 부분의 맨 앞(i)으로 가져옴

			// 임시 변수(temp)를 사용하여 최솟값(arr[minIdx])을 잠시 보관
			int temp = arr[minIdx];

			// 최솟값이 있던 자리(minIdx)에 원래 arr[i] 값 삽입
			arr[minIdx] = arr[i];

			// 현재 정렬 위치(arr[i])에 실제 최솟값(temp) 삽입
			arr[i] = temp;
		}
	}
}
```

---

## 5. 삽입 정렬 (Insertion Sort)

### 개념
삽입 정렬은 정렬된 부분 리스트에 새 원소를 적절히 삽입하며 정렬 과정을 수행
데이터가 거의 정렬된 상태에서 효율적
* 시간 복잡도: $\text{O}(n^2)$

```java
public class InsertionSort {
	public static void insertionSort(int[] arr) {
		// 배열의 길이(요소의 개수)를 저장
		int n = arr.length;

		// 1. 외부 반복문: 두 번째 요소(인덱스 1)부터 시작해서 배열 끝까지 순회
		// 인덱스 0은 이미 정렬된 부분이라고 가정하고 시작함
		for(int i = 1; i < n; i++) {

			// 2. 현재 삽입할 요소를 'key' 변수에 임시로 저장
			// 이 key가 이미 정렬된 부분에 들어갈 올바른 위치를 찾게 됨
			int key = arr[i];

			// 3. 'j'는 key의 바로 왼쪽 인덱스(정렬된 부분의 마지막 요소)를 가리킴
			int j = i - 1;

			// 4. 내부 반복문 (while): key가 들어갈 위치를 찾을 때까지 정렬된 부분을 왼쪽으로 탐색
			// 조건 1: j가 0 이상이어야 함 (배열의 시작 부분까지만 탐색)
			// 조건 2: 현재 요소(arr[j])가 삽입할 값(key)보다 크다면, key가 들어갈 자리가 아님
			while(j >= 0 && arr[j] > key) {

				// 5. arr[j]가 key보다 크므로, 한 칸 오른쪽(j+1)으로 이동(밀어냄)
				// 이렇게 해야 key가 들어갈 공간이 생김
				arr[j + 1] = arr[j];

				// 6. 다음 왼쪽 요소로 이동하여 계속 비교
				j--;
			}

			// 7. while 루프가 멈추면, arr[j + 1] 자리가 key가 들어갈 올바른 위치
			// 밀어내기가 멈춘 곳(j) 바로 다음(j+1)에 key 값을 삽입
			arr[j + 1] = key;
		}
	}
}
```

---

## 6. 이진 탐색 (Binary Search)

### 개념
이진 탐색은 정렬된 배열에서 중간 값을 기준으로 탐색 범위를 절반씩 좁혀 나가는 탐색 기법
탐색 속도가 빠름
* 시간 복잡도: $\text{O}(\log n)$

### 작동 원리
1. 중간 원소와 목표값 비교
2. 목표값이 크면 오른쪽 절반 탐색, 작으면 왼쪽 절반 탐색
3. 범위가 없어질 때까지 반복

### 자바 예시 코드

```java
public class BinarySearch {
	public static int binarySearch(int[] arr, int target) {
		// 1. 탐색 범위의 시작점(가장 왼쪽 인덱스)을 'left'로 설정
		int left = 0;

		// 2. 탐색 범위의 끝점(가장 오른쪽 인덱스)을 'right'로 설정
		int right = arr.length - 1;

		// 3. left가 right보다 작거나 같을 때까지 반복 (탐색 범위가 남아있는 동안)
		while (left <= right) {

			// 4. 탐색 범위의 '중간 인덱스(mid)'를 계산
			// (left + right) / 2 대신 이 공식을 사용하면 정수 오버플로우를 방지할 수 있음
			int mid = left + (right - left) / 2;

			// 5. 중간 값이 찾으려는 값(target)과 같은지 확인
			if (arr[mid] == target) {
				// 6. 같으면 찾았으므로 해당 인덱스를 반환하고 종료
				return mid;
			}

			// 7. 중간 값이 target보다 작은 경우 (target이 중간 값의 오른쪽에 있음)
			else if (arr[mid] < target) {
				// 8. 탐색 범위를 오른쪽 절반으로 좁힘
				// left를 mid + 1로 업데이트 (중간 값은 이미 확인했으므로 제외)
				left = mid + 1;
			}

			// 9. 중간 값이 target보다 큰 경우 (target이 중간 값의 왼쪽에 있음)
			else {
				// 10. 탐색 범위를 왼쪽 절반으로 좁힘
				// right를 mid - 1로 업데이트 (중간 값은 이미 확인했으므로 제외)
				right = mid - 1;
			}
		}

		// 11. 반복문이 끝날 때까지 target을 찾지 못했다면
		// left > right가 되어 탐색 범위가 없다는 의미
		// 찾지 못했음을 나타내는 -1을 반환
		return -1;
	}
}
```

---

## 7. 분할 정복 (Divide and Conquer)

### 개념
분할 정복은 문제를 작은 하위 문제로 나누어 각각 해결하고, 그 해답을 합쳐서 원래 문제를 해결하는 알고리즘 전략
재귀를 기반으로 함

* 분할 (Divide): 큰 문제를 작고 같은 유형의 문제로 나눔
* 정복 (Conquer): 각 하위 문제를 재귀적으로 해결
* 결합 (Combine): 하위 문제들의 결과를 합쳐 문제를 완성

### 장점
복잡한 문제를 단순 문제로 분리해 해결하므로 설계와 분석 용이
많은 효율적인 알고리즘 (퀵 정렬, 병합 정렬, 이진 탐색 등)이 이 패턴을 기반으로 함

---

## 8. 병합 정렬 (Merge Sort)

### 개념
분할 정복 알고리즘의 대표
배열을 반씩 나눠 정렬 후 병합
* 시간 복잡도: $\text{O}(n \log n)$로 안정적 성능 보장

```java
public class MergeSort {
	/**
	 * 배열을 절반씩 나누는 (분할) 역할을 수행하는 재귀 메서드
	 */
	public static void mergeSort(int[] arr, int left, int right) {
		// 배열의 시작(left)이 끝(right)보다 작을 때만 실행 (나눌 요소가 최소 2개 이상일 때)
		if(left < right) {

			// 1. 중간 지점(mid)을 계산하여 배열을 두 부분으로 나눔
			int mid = (left + right) / 2;

			// 2. 왼쪽 절반을 재귀적으로 정렬
			mergeSort(arr, left, mid);

			// 3. 오른쪽 절반을 재귀적으로 정렬
			mergeSort(arr, mid + 1, right);

			// 4. 왼쪽과 오른쪽 절반이 모두 정렬되면, 두 부분을 합치는(병합) 작업을 수행
			merge(arr, left, mid, right);
		}
	}

	/**
	 * 정렬된 두 부분 배열(왼쪽 L, 오른쪽 R)을 하나의 정렬된 배열로 합치는 (병합) 메서드
	 */
	private static void merge(int[] arr, int left, int mid, int right) {

		// 1. 왼쪽 부분 배열(L)과 오른쪽 부분 배열(R)의 크기를 계산
		int n1 = mid - left + 1; // L의 크기
		int n2 = right - mid;    // R의 크기

		// 2. 임시 배열 L과 R을 생성하여 데이터를 복사
		int[] L = new int[n1];
		int[] R = new int[n2];

		// 원본 배열 arr에서 왼쪽 부분 데이터를 L로 복사
		for(int i = 0; i < n1; i++) L[i] = arr[left + i];

		// 원본 배열 arr에서 오른쪽 부분 데이터를 R로 복사
		for(int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

		// 3. L, R 배열에서 데이터를 꺼내 원래 배열(arr)에 병합
		int i = 0, j = 0;   // i: L 배열의 인덱스, j: R 배열의 인덱스
		int k = left;       // k: arr 배열에 병합할 위치(시작점은 left)

		// L과 R 둘 중 하나라도 끝날 때까지 반복
		while(i < n1 && j < n2) {

			// L[i]와 R[j]를 비교하여 더 작은 값을 먼저 arr[k]에 넣음
			if(L[i] <= R[j]) {
				arr[k++] = L[i++]; // L[i]가 작거나 같으면 arr에 넣고 L의 인덱스를 증가
			} else {
				arr[k++] = R[j++]; // R[j]가 더 작으면 arr에 넣고 R의 인덱스를 증가
			}
		}

		// 4. 남아있는 요소들을 처리 (둘 중 한 쪽 배열만 남아있음)

		// 만약 L 배열에 남아있는 요소가 있다면, 모두 arr 뒤에 순서대로 넣음
		while(i < n1) arr[k++] = L[i++];

		// 만약 R 배열에 남아있는 요소가 있다면, 모두 arr 뒤에 순서대로 넣음
		while(j < n2) arr[k++] = R[j++];
	}
}
```

---

## 9. 퀵 정렬 (Quick Sort)

### 개념
피벗 값을 기준으로 작은 값과 큰 값으로 분할해 재귀적으로 정렬
* 시간 복잡도: 평균 $\text{O}(n \log n)$, 최악 $\text{O}(n^2)$

```java
public class QuickSort {
	/**
	 * 배열의 특정 범위(low부터 high)를 정렬하는 재귀 함수
	 */
	public static void quickSort(int[] arr, int low, int high) {
		// 정렬할 요소가 최소 2개 이상일 때만 실행 (low가 high보다 작을 때)
		if(low < high) {

			// 1. partition 함수를 호출하여 피벗을 기준으로 배열을 분할
			// pi는 피벗이 최종적으로 자리 잡은 위치(인덱스)를 반환
			int pi = partition(arr, low, high);

			// 2. 피벗의 왼쪽 부분(피벗보다 작은 값들)을 재귀적으로 다시 정렬
			quickSort(arr, low, pi - 1);

			// 3. 피벗의 오른쪽 부분(피벗보다 큰 값들)을 재귀적으로 다시 정렬
			quickSort(arr, pi + 1, high);
		}
	}

	/**
	 * 피벗을 기준으로 배열 요소를 재배치하고, 피벗의 최종 위치를 반환하는 함수 (분할 작업)
	 */
	private static int partition(int[] arr, int low, int high) {
		// 1. 배열의 가장 오른쪽 요소(high)를 피벗(기준 값)으로 선택
		int pivot = arr[high];

		// 2. 피벗보다 작은 요소들의 '경계' 또는 '가장 오른쪽 인덱스'를 나타내는 포인터 i
		// low - 1에서 시작 (아직 작은 요소가 하나도 없기 때문)
		int i = low - 1;

		// 3. low부터 high-1까지 모든 요소를 순회하며 피벗과 비교
		for(int j = low; j < high; j++) {

			// 4. 현재 요소(arr[j])가 피벗보다 작다면
			if(arr[j] < pivot) {
				// 5. 작은 요소의 경계(i)를 한 칸 증가시킴
				i++;

				// 6. arr[j]와 arr[i]의 위치를 교환(Swap)
				// arr[j]를 피벗보다 작은 값들의 영역(i) 안으로 넣는 작업
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// 7. 반복문 종료 후, 피벗을 i+1 위치에 삽입하여 최종 위치 확정
		// i+1 위치는 피벗보다 작은 값들(i) 바로 다음 자리이며, 피벗보다 큰 값들의 시작 자리임
		int temp = arr[i + 1];
		arr[i + 1] = arr[high]; // 피벗 값을 i+1 위치로 이동
		arr[high] = temp;       // 원래 피벗 위치(high)에는 i+1 위치의 값(피벗보다 컸던 값)이 들어감

		// 8. 피벗의 최종 위치(i + 1)를 반환
		return i + 1;
	}
}
```

---

## 10. 힙 정렬 (Heap Sort)

### 개념
힙 자료구조를 사용해 최대값 또는 최소값을 추출하며 정렬
공간 효율적
* 시간 복잡도: $\text{O}(n \log n)$

```java
public class HeapSort {
	/**
	 * 주된 정렬 로직을 수행하는 메서드
	 */
	public static void heapSort(int[] arr) {
		// 배열의 총 요소 개수를 저장
		int n = arr.length;

		// --- 1단계: 최대 힙(Max Heap) 구성 ---

		// 배열을 최대 힙 구조로 만듦
		// n/2 - 1 부터 시작하는 이유는, 그 이후 인덱스들은 모두 리프 노드(자식이 없는 노드)라서 
		// 이미 힙 조건을 만족한다고 간주하기 때문
		for (int i = n / 2 - 1; i >= 0; i--) {
			// heapify: 현재 서브 트리(i를 루트로 하는)를 힙 속성에 맞게 정리
			heapify(arr, n, i);
		}

		// --- 2단계: 힙에서 요소를 추출하며 정렬 ---

		// 배열의 맨 끝(정렬된 부분)부터 시작해서 루트 노드(최댓값)를 순서대로 배치
		// i는 정렬되지 않은 부분의 마지막 인덱스를 의미
		for (int i = n - 1; i > 0; i--) {

			// 1. 현재 루트 노드(가장 큰 값, arr[0])와 배열의 마지막 요소(arr[i])를 교환 (Swap)
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// 2. 가장 큰 값(루트)이 제자리를 찾아갔으므로, 정렬되지 않은 부분(크기 i)을 
			// 다시 힙 구조로 재구성 (루트 위치 0에서 다시 heapify 시작)
			// 크기가 i인 배열 범위 내에서만 작업함
			heapify(arr, i, 0);
		}
	}

	/**
	 * 특정 노드 i를 루트로 하는 서브 트리를 최대 힙 규칙에 맞게 조정하는 메서드
	 * 이 함수가 재귀적으로 호출되며 힙 구조를 만듭니다.
	 */
	private static void heapify(int[] arr, int n, int i) {
		// 가장 큰 요소의 인덱스를 현재 노드 i라고 가정
		int largest = i;

		// 왼쪽 자식 노드의 인덱스를 계산
		int left = 2 * i + 1;

		// 오른쪽 자식 노드의 인덱스를 계산
		int right = 2 * i + 2;

		// 1. 왼쪽 자식이 배열 범위 내에 있고, 현재 largest보다 값이 크다면
		if (left < n && arr[left] > arr[largest]) {
			// largest 인덱스를 왼쪽 자식으로 업데이트
			largest = left;
		}

		// 2. 오른쪽 자식이 배열 범위 내에 있고, 현재 largest보다 값이 크다면
		if (right < n && arr[right] > arr[largest]) {
			// largest 인덱스를 오른쪽 자식으로 업데이트
			largest = right;
		}

		// 3. 만약 largest 인덱스가 i(현재 루트)와 다르다면 (즉, 자식 중 더 큰 값이 있다면)
		if (largest != i) {
			// 현재 노드(i)와 가장 큰 자식(largest)의 위치를 교환 (Swap)
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// 교환된 자식 노드(largest) 위치에서 다시 heapify를 재귀 호출하여
			// 아래쪽 서브 트리도 힙 규칙을 만족하도록 조정
			heapify(arr, n, largest);
		}
	}
}
```

---

## 11. DFS (깊이 우선 탐색)

### 개념
DFS(Depth First Search)는 그래프나 트리에서 한 방향으로 가능한 깊게 탐색을 진행하는 알고리즘
재귀 또는 스택을 활용
경로 탐색, 사이클 검사 등에 유용

### 동작 과정
1. 현재 노드를 방문 처리
2. 방문하지 않은 인접 노드가 있으면 그 노드로 이동 (재귀 호출)
3. 더 이상 방문할 인접 노드 없으면 이전 노드로 되돌아감 (Backtracking)

### 자바 예시 코드 (재귀 방식)

```java
import java.util.*;

public class DFS {
	// 그래프의 구조를 저장하는 맵 (인접 리스트 방식)
	// Key: 현재 노드 (정수), Value: 현재 노드와 연결된 이웃 노드들의 리스트
	static Map<Integer, List<Integer>> graph = new HashMap<>();

	// 이미 방문한 노드를 기록하여 중복 탐색을 방지하는 집합 (Set)
	static Set<Integer> visited = new HashSet<>();

	/**
	 * 깊이 우선 탐색(DFS)을 수행하는 재귀 메서드
	 * @param node 현재 탐색을 시작할 노드 번호
	 */
	public static void dfs(int node) {

		// 1. 현재 노드를 방문했음을 기록
		visited.add(node);

		// 2. 현재 노드를 출력 (탐색 순서 확인)
		System.out.print(node + " ");

		// 3. 현재 노드와 연결된 모든 이웃 노드들을 순회
		// getOrDefault: 노드에 연결된 이웃이 없으면 빈 리스트를 반환하여 오류 방지
		for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {

			// 4. 이웃 노드가 아직 방문하지 않은 노드라면
			if (!visited.contains(neighbor)) {

				// 5. 해당 이웃 노드로 이동하여 깊이 우선 탐색을 다시 시작 (재귀 호출)
				// 즉, 이 경로를 따라 더 깊이 들어감
				dfs(neighbor);
			}
		}
		// 재귀 호출이 끝났다는 것은, 이 노드에서 더 이상 갈 곳이 없거나
		// 모든 깊은 경로 탐색을 완료하고 되돌아왔다는 뜻 (백트래킹)
	}

	public static void main(String[] args) {
		// 그래프 초기화 예시: 노드 간의 연결 관계 정의
		// 1번 노드는 2, 3번 노드와 연결됨
		graph.put(1, Arrays.asList(2, 3));
		// 2번 노드는 4번 노드와 연결됨
		graph.put(2, Arrays.asList(4));
		// 3번 노드는 5, 6번 노드와 연결됨
		graph.put(3, Arrays.asList(5, 6));
		// 4, 5, 6번 노드는 더 이상 연결된 노드가 없음
		graph.put(4, Arrays.asList());
		graph.put(5, Arrays.asList());
		graph.put(6, Arrays.asList());

		// 1번 노드부터 DFS 시작
		dfs(1);  // 예상 출력: 1 2 4 3 5 6 (탐색 순서는 구현에 따라 약간 다를 수 있음)
	}
}
```

---

## 12. BFS (너비 우선 탐색)

### 개념
BFS(Breadth First Search)는 그래프나 트리에서 시작 노드로부터 가까운 노드를 우선 방문하는 알고리즘
큐(Queue) 자료구조를 이용해 구현
주로 최단 경로 문제에 적합

### 동작 과정
1. 시작 노드를 큐에 넣고 방문 처리
2. 큐에서 노드를 꺼내 해당 노드와 인접한 방문하지 않은 노드 모두 큐에 넣고 방문 처리
3. 큐가 빌 때까지 반복

### 자바 예시 코드

```java
import java.util.*;

public class BFS {
	// 그래프의 구조를 저장하는 맵 (인접 리스트 방식)
	// Key: 현재 노드 (정수), Value: 현재 노드와 연결된 이웃 노드들의 리스트
	static Map<Integer, List<Integer>> graph = new HashMap<>();

	// 이미 방문한 노드를 기록하여 중복 탐색을 방지하는 집합 (Set)
	static Set<Integer> visited = new HashSet<>();

	/**
	 * 너비 우선 탐색(BFS)을 수행하는 메서드
	 * @param start 탐색을 시작할 노드 번호
	 */
	public static void bfs(int start) {

		// 1. BFS를 위해 큐(Queue) 자료구조를 준비
		// 큐는 '먼저 들어온 노드를 먼저 처리'하여 너비 우선 탐색을 가능하게 함
		Queue<Integer> queue = new LinkedList<>();

		// 2. 시작 노드를 큐에 넣고, 방문 처리
		queue.add(start);
		visited.add(start);

		// 3. 큐가 빌 때까지 반복 (더 이상 방문할 노드가 없을 때까지)
		while (!queue.isEmpty()) {

			// 4. 큐에서 가장 먼저 들어온 노드(현재 레벨의 노드)를 꺼냄
			int node = queue.poll();

			// 5. 현재 노드를 출력 (탐색 순서 확인)
			System.out.print(node + " ");

			// 6. 현재 노드와 연결된 모든 이웃 노드들을 순회
			for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {

				// 7. 이웃 노드가 아직 방문하지 않은 노드라면
				if (!visited.contains(neighbor)) {
					// 8. 해당 이웃 노드를 큐의 맨 뒤에 넣음 (다음 레벨에서 탐색될 예정)
					queue.add(neighbor);

					// 9. 중복 추가를 막기 위해 즉시 방문 처리
					visited.add(neighbor);
				}
			}
		}
	}

	public static void main(String[] args) {
		// 그래프 초기화 예시
		// 1 -> 2, 3
		// 2 -> 4
		// 3 -> 5, 6
		graph.put(1, Arrays.asList(2, 3));
		graph.put(2, Arrays.asList(4));
		graph.put(3, Arrays.asList(5, 6));
		graph.put(4, Arrays.asList());
		graph.put(5, Arrays.asList());
		graph.put(6, Arrays.asList());

		// 1번 노드부터 BFS 시작
		bfs(1); // 예상 출력: 1 2 3 4 5 6 (레벨 1 -> 레벨 2 -> 레벨 3 순서)
	}
}
```

---

## 13. 그리디 알고리즘 (Greedy Algorithm)

### 개념
그리디 알고리즘은 매 순간 가장 좋아 보이는 선택 (국소 최적)을 하여 전체 문제에 대한 최적해 (전역 최적)에 도달하려는 방법
단순하고 구현이 쉬움

### 탐욕 선택 속성
각 단계에서 선택한 해가 이후 선택에 영향을 주지 않고 전체 최적해의 일부가 될 수 있어야 함

### 최적 부분 구조
전체 문제의 최적해는 부분 문제의 최적해로 구성될 수 있어야 함

### 예시: 거스름돈 문제
가장 큰 단위 동전부터 최대한 써서 최소 개수 동전으로 거슬러 줌

```java
public class GreedyCoinChange {
	/**
	 * 그리디 방식으로 주어진 동전들을 사용하여 거슬러 줄 수 있는 최소 동전 개수를 계산
	 * (이 방식은 동전 단위가 큰 순서대로 작은 단위의 배수일 때만 최적의 해를 보장합니다.)
	 * @param coins 사용 가능한 동전 단위들 (반드시 내림차순으로 정렬되어 있어야 함)
	 * @param amount 거슬러 줘야 할 총 금액
	 * @return 사용된 동전의 총 개수
	 */
	public static int coinChange(int[] coins, int amount) {
		// 거슬러 준 동전의 총 개수를 저장할 변수
		int count = 0;

		// 1. 동전 배열을 가장 큰 단위부터 순회 (그리디의 핵심)
		// coins.length - 1은 배열의 마지막 인덱스, 즉 가장 큰 동전 단위
		for(int i = coins.length - 1; i >= 0; i--) {

			// 2. 현재 남은 금액(amount)에 대해, 현재 동전(coins[i])을 최대한 많이 사용
			// 나눗셈을 통해 현재 동전으로 거슬러 줄 수 있는 최대 개수를 계산하여 count에 더함
			count += amount / coins[i];

			// 3. 현재 동전을 사용하고 남은 잔돈 금액을 계산
			// 나머지(%) 연산자를 사용하여, 다음 단계에서 계산해야 할 금액으로 amount를 업데이트
			amount %= coins[i];

			// 참고: 만약 amount가 0이 되면 루프를 일찍 종료해도 되지만,
			// 모든 동전 단위를 확인해도 결과에는 영향 없음
		}

		// 4. 모든 동전 단위를 확인한 후, 사용된 동전의 총 개수를 반환
		return count;
	}
}
```

---

## 14. 백트래킹 (Backtracking)

### 개념
백트래킹은 모든 경우의 수를 탐색하면서 해가 될 가능성이 없는 경로는 중간에 포기하고 되돌아가는 탐색 기법
DFS와 재귀를 사용하며, 불필요한 탐색을 줄이는 가지치기(pruning)를 통해 효율 증가됨

### 동작 원리
- 문제를 트리 형태로 표현
- DFS 방식으로 탐색하며 유망하지 않으면 이전 상태로 되돌아감 (Backtrack)
- 가지치기를 통해 불필요한 탐색을 줄임

```java
import java.util.Scanner;

public class BacktrackingExample {

	// 현재까지 선택된 숫자를 저장할 배열. 길이는 M (선택할 숫자의 개수)
	static int[] arr;
	// N개의 숫자 중 이미 사용된 숫자인지 기록하는 배열. 중복 방지 역할
	static boolean[] visited;

	/**
	 * 백트래킹을 이용한 깊이 우선 탐색(DFS)
	 * @param N 전체 숫자 개수 (1부터 N까지의 숫자)
	 * @param M 선택해야 하는 숫자의 개수
	 * @param depth 현재까지 선택한 숫자의 개수 (= arr 배열의 현재 채울 인덱스)
	 */
	public static void dfs(int N, int M, int depth) {

		// 1. 종료 조건: M개의 숫자를 모두 선택했다면
		if(depth == M) {
			// arr 배열에 저장된 M개의 숫자를 출력 (하나의 순열 완성)
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			// 더 이상 깊이 들어갈 필요가 없으므로 함수 종료
			return;
		}

		// 2. 현재 단계에서 선택 가능한 모든 경우의 수를 반복
		// i는 0부터 N-1까지의 인덱스로, 숫자 (i+1)을 나타냄
		for(int i = 0; i < N; i++) {

			// 3. 가지치기 조건: 현재 숫자(i+1)가 아직 사용되지 않았다면 (중복 방지)
			if(!visited[i]) {

				// 4. 전진 (Explore): 현재 숫자를 사용하기로 결정
				visited[i] = true;         // 이 숫자를 사용했다고 표시
				arr[depth] = i + 1;        // 현재 깊이(depth)의 위치에 숫자 저장

				// 5. 다음 단계를 탐색하기 위해 재귀 호출
				// depth를 1 증가시켜 다음 자릿수의 숫자를 선택하도록 함
				dfs(N, M, depth + 1);

				// 6. 백트래킹 (Backtrack): 재귀 호출이 끝난 후, 다음 반복을 위해 상태를 되돌림
				// 'i+1' 숫자를 사용하지 않은 상태로 되돌려놓아야, 
				// 다른 경로에서 이 숫자를 다시 사용할 수 있음
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N: 전체 숫자 범위, M: 선택할 숫자의 개수 (예: N=3, M=2)
		int N = sc.nextInt();
		int M = sc.nextInt();

		// M개의 숫자를 담을 배열 초기화
		arr = new int[M];
		// N개의 숫자의 방문 여부를 기록할 배열 초기화
		visited = new boolean[N];

		// 백트래킹 시작. 0은 현재까지 선택한 개수
		dfs(N, M, 0);
		sc.close();
	}
}
```

---

## 15. 동적 프로그래밍 (Dynamic Programming, DP)

### 개념
동적 프로그래밍은 복잡한 문제를 작은 하위 문제로 나누어 푸는 알고리즘 기법
중복 계산을 제거하고, 하위 문제의 해를 저장해 문제 해결 효율 향상
최적 부분 구조와 중복 부분 문제를 가진 문제에 효과적

### 동적 프로그래밍의 조건
1. 큰 문제를 작은 문제로 나눌 수 있음
2. 작은 문제의 답을 모아 큰 문제를 해결 가능

### 대표적인 예: 피보나치 수열 (상향식 DP)
재귀로 구현 시 중복 계산이 많아 비효율적
DP는 계산 결과를 테이블에 저장해 재사용함으로써 속도 개선

```java
public class FibonacciDP {

	/**
	 * 상향식(Bottom-up) 동적 계획법으로 n번째 피보나치 수를 계산
	 * @param n 찾으려는 피보나치 수열의 인덱스 (F(n))
	 * @return n번째 피보나치 값
	 */
	public static int fib(int n) {

		// n이 0 또는 1이라면, 피보나치 값은 n 자신과 같으므로 바로 반환
		if (n <= 1) return n;

		// 1. DP 테이블(배열)을 생성
		// n번째 값을 저장해야 하므로 크기는 n+1이 필요함 (인덱스 0부터 n까지 사용)
		int[] dp = new int[n + 1];

		// 2. 초기 값(Base Case) 설정
		// F(0) = 0
		dp[0] = 0;
		// F(1) = 1
		dp[1] = 1;

		// 3. 반복문을 통해 작은 문제(F(2))부터 큰 문제(F(n))까지 순서대로 계산
		// i는 2부터 n까지의 인덱스를 나타냄
		for (int i = 2; i <= n; i++) {

			// 4. 점화식 적용: 현재 피보나치 수(dp[i])는 
			// 바로 앞의 두 수(dp[i-1]과 dp[i-2])를 더한 값과 같음
			// 이미 계산되어 저장된 값을 재사용하여 중복 계산을 피함 (DP의 핵심)
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		// 5. 최종 결과인 n번째 피보나치 수를 반환
		return dp[n];
	}
}
```

---

## 16. 메모이제이션 (Memoization)

### 개념
메모이제이션은 이미 계산한 결과를 저장해 두었다가 같은 계산을 반복하지 않고 재사용하는 기법
주로 재귀 함수 (하향식 DP)에서 중복된 하위 문제를 효율적으로 해결하기 위해 사용

### 메모이제이션 효과
재귀 호출 수가 줄어 계산 속도가 지수 시간에서 선형 시간으로 크게 단축
불필요한 중복 계산이 사라져 성능 향상

### 예시: 피보나치 수열 메모이제이션 구현 (하향식 DP)

```java
public class FibonacciMemo {
	// 이미 계산된 피보나치 값을 저장해둘 배열 (메모이제이션 테이블)
	// 인스턴스가 아닌 정적 변수로 선언하여 모든 메서드가 공유하도록 함
	private static int[] memo;

	/**
	 * 하향식(Top-down) + 메모이제이션으로 n번째 피보나치 수를 계산
	 * @param n 찾으려는 피보나치 수열의 인덱스 (F(n))
	 * @return n번째 피보나치 값
	 */
	public static int fib(int n) {

		// 1. 종료 조건(Base Case): F(0)=0, F(1)=1 이므로 바로 반환
		if (n <= 1) return n;

		// 2. 메모이제이션 확인: 현재 n에 대한 값이 이미 계산되어 저장되어 있다면
		// 배열의 초기값은 0이므로, 0이 아닌 값은 이미 계산된 값으로 간주함
		if (memo[n] != 0) {
			// 저장된 값을 바로 반환하여 중복 계산을 건너뜀 (시간 절약)
			return memo[n];
		}

		// 3. 재귀 계산 및 저장: 값이 메모에 없으면 재귀 호출로 계산
		// F(n) = F(n-1) + F(n-2)
		// 계산 결과를 memo[n]에 저장 (다음 호출에서 재사용 가능하도록)
		memo[n] = fib(n - 1) + fib(n - 2);

		// 4. 계산된 결과를 반환
		return memo[n];
	}

	public static void main(String[] args) {
		int n = 10;

		// main 메서드에서 메모이제이션 배열 초기화
		// F(0)부터 F(n)까지 저장해야 하므로 크기는 n+1
		memo = new int[n + 1];

		// 피보나치 계산 및 결과 출력
		System.out.println("Fibonacci number F(" + n + ") = " + fib(n));
	}
}
```

---  
