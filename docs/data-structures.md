# Data Structures

## Overview
데이터를 효율적으로 저장, 관리하는 방법
데이터는 다양한 형태로 존재하며, 잘 다루기 위해 구조화 필요
데이터를 체계적으로 조직하여 효율적으로 접근, 수정, 삭제 가능

## What is a Data Structure?
자료구조란, 데이터를 저장하고 관리하는 방법과 규칙
마치 서랍장 안에 여러 칸으로 물건을 정리하는 것처럼, 데이터도 목적에 맞게 정리 필요

---  

## Common Data Structures

### 1. Array (배열)

#### 개념
데이터를 메모리 상에 연속적인 공간에 저장하는 구조

#### 특징
- 요소에 빠르게 접근 가능 (인덱스 번호로 직접 접근)
- 크기가 고정되어 미리 정해야 하며, 크기 변경이 어려움

#### 실생활 예시
학생들의 점수를 순서대로 적은 명부

#### 자바 예시 코드
배열 생성 및 접근 예시

```java
public class ArrayExample {
    public static void main(String[] args) {
        // 크기가 5인 정수형 배열 생성
        int[] scores = new int[5];
        
        // 인덱스를 이용한 접근 및 저장
        scores[0] = 90;
        scores[4] = 85;
        
        // 빠른 접근 (O(1) 시간 복잡도)
        int firstScore = scores[0]; 
        System.out.println("첫 번째 점수: " + firstScore); 
    }
}
```

### 2. Linked List (연결 리스트)

#### 개념
데이터 요소가 노드라는 단위로 저장되고, 각 노드는 다음 노드의 위치를 가리키는 포인터를 가짐

#### 특징
- 크기를 동적으로 늘리거나 줄일 수 있어 유연
- 삽입/삭제가 빠름 ($\text{O}(1)$ 시간 복잡도)
- 인덱스를 통한 직접 접근은 배열보다 느림 (순차 탐색 필요)

#### 실생활 예시
종이로 만든 열쇠고리처럼 한 칸씩 연결된 구조

#### 자바 예시 코드
단일 연결 리스트의 노드 구조

```java
class Node {
    int data;
    Node next; // 다음 노드를 가리키는 포인터
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        // 10 -> 20 연결
    }
}
```

### 3. Stack (스택)

#### 개념
마지막에 넣은 데이터가 가장 먼저 나오는 구조 (LIFO: Last In First Out)

#### 특징
- Push: 데이터 넣기
- Pop: 가장 위(최근) 데이터 빼기
- 함수 호출, 웹 브라우저 뒤로 가기, 실행 취소 (Undo) 기능 구현에 사용

#### 실생활 예시
책 쌓기, 접시 쌓기

#### 자바 예시 코드
스택 사용 (Java `Stack` 클래스 이용)

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("A"); // Push: A 삽입
        stack.push("B"); // Push: B 삽입
        
        System.out.println(stack.pop()); // Pop: B 출력 (가장 나중에 들어온 값)
        System.out.println(stack.pop()); // Pop: A 출력
    }
}
```

### 4. Queue (큐)

#### 개념
먼저 넣은 데이터가 먼저 나오는 구조 (FIFO: First In First Out)

#### 특징
- Enqueue: 데이터 넣기 (뒤쪽)
- Dequeue: 가장 앞쪽 데이터 빼기
- 은행 번호표, 프린터 대기열, BFS(너비 우선 탐색) 구현 등에 사용

#### 실생활 예시
줄 서기

#### 자바 예시 코드
큐 사용 (Java `Queue` 인터페이스와 `LinkedList` 구현체 이용)

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("A"); // Enqueue: A 삽입
        queue.offer("B"); // Enqueue: B 삽입
        
        System.out.println(queue.poll()); // Dequeue: A 출력 (가장 먼저 들어온 값)
        System.out.println(queue.poll()); // Dequeue: B 출력
    }
}
```

### 4.1 PriorityQueue (우선순위 큐)

#### 개념
일반적인 큐(Queue)와 달리, 데이터가 들어온 순서가 아닌 우선순위에 따라 나가는 자료구조  

#### 특징
- 내부적으로 힙(Heap) 자료구조를 사용하여 구현됨  
- 가장 우선순위가 높은(최대 힙의 경우 최댓값, 최소 힙의 경우 최솟값) 요소가 항상 가장 먼저 추출됨  
- 요소 삽입 및 삭제 시간 복잡도: $\text{O}(\log n)$  

#### 실생활 예시
응급실 환자 처리 (위급도에 따라 우선순위 결정), 운영체제의 작업 스케줄링  

#### 자바 예시 코드
우선순위 큐 사용 (Java PriorityQueue 클래스 이용)  

```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		// 기본적으로 낮은 숫자가 높은 우선순위를 갖는 최소 힙으로 동작
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(30);
		pq.add(10); // 가장 낮은 숫자이므로 우선순위가 가장 높음
		pq.add(20);

		System.out.println(pq.poll()); // Dequeue: 10 출력 (최소값 먼저)
		System.out.println(pq.poll()); // Dequeue: 20 출력
	}
}
```

### 5. Heap (힙)

#### 개념
완전 이진 트리 형태의 자료구조로, 부모 노드가 자식 노드보다 크거나 작은 관계를 유지하는 구조

#### 종류
- 최대힙 (Max Heap): 부모 노드의 값이 자식 노드보다 크거나 같음 (최댓값 빠르게 찾기)
- 최소힙 (Min Heap): 부모 노드의 값이 자식 노드보다 작거나 같음 (최솟값 빠르게 찾기)

#### 특징
- 항상 루트 노드에서 최댓값 또는 최솟값을 즉시 찾을 수 있음
- 우선순위 큐 구현에 활용 (가장 중요한/급한 데이터 먼저 처리)
- 삽입/삭제 시간 복잡도: $\text{O}(\log n)$

#### 자바 예시 코드
최소 힙 (PriorityQueue는 기본적으로 최소 힙으로 동작)

```java
import java.util.PriorityQueue;

public class HeapExample {
    public static void main(String[] args) {
        // 기본적으로 최소 힙 (Min Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(15);
        
        System.out.println(minHeap.poll()); // 5 출력 (최소값)
    }
}
```

### 6. Tree (트리)

#### 개념
계층적 데이터 표현에 적합한 구조
부모-자식 관계를 가진 노드들의 집합으로, 최상위 노드를 루트라 함

#### 종류
- 이진 트리 (Binary Tree): 각 노드가 최대 두 개의 자식을 가질 수 있는 트리
- 이진 탐색 트리 (BST): 왼쪽 자식은 부모보다 작고, 오른쪽 자식은 부모보다 큰 규칙을 따르는 트리 (탐색 효율적)
- 균형 트리 (Balanced Tree): 높이가 균형을 유지하도록 조정되어 탐색 성능을 보장 (AVL, Red-Black 등)

#### 특징
- 데이터베이스 인덱스, 파일 시스템 구조 등에 활용됨

### 7. Graph (그래프)

#### 개념
복잡한 관계를 표현하기 위해 노드 (정점, Vertex)와 이들 간의 연결 (간선, Edge)로 구성된 구조

#### 특징
- 방향성 (유향 그래프)과 무방향성 (무향 그래프)이 있음
- 가중치 (Cost)를 가질 수 있음 (ex. 도로의 길이)
- 소셜 네트워크, 지도 경로 탐색, 회로 분석 등에 활용됨
- DFS, BFS 등의 알고리즘을 사용해 탐색

### 8. Hash Table (해시 테이블/맵)

#### 개념
키(Key)와 값(Value)을 연결하여 저장하며,   
키를 해시 함수(Hash Function)를 통해 특정 배열 인덱스로 변환하여   
데이터를 저장하고 즉시 접근할 수 있게 하는 구조  

#### 특징
- 데이터 삽입, 삭제, 검색이 평균 $\text{O}(1)$ 시간 복잡도로 매우 빠름  
- 키-값 쌍을 저장하는 연관 배열(Associative Array)을 구현하는 데 사용됨  
- 해시 충돌(Collision) 문제가 발생할 수 있으며, 이를 해결하기 위해 체이닝(Chaining)이나 개방 주소법(Open Addressing) 등의 기법이 사용됨  

#### 실생활 예시
전화번호부 (이름(키)으로 전화번호(값)를 찾음), 데이터베이스 인덱싱  

#### 자바 예시 코드
해시 맵 사용 (Java HashMap 클래스 이용)  

```java
import java.util.HashMap;
import java.util.Map;

public class HashTableExample {
	public static void main(String[] args) {
		// 키(String)와 값(Integer)을 저장하는 해시 맵 생성
		Map<String, Integer> map = new HashMap<>();

		// 데이터 삽입
		map.put("Apple", 1000);
		map.put("Banana", 2000);

		// 키를 이용한 빠른 검색
		int price = map.get("Apple");
		System.out.println("Apple 가격: " + price); // 1000 출력

		// 키 존재 여부 확인
		if (map.containsKey("Banana")) {
			System.out.println("Banana는 맵에 존재합니다.");
		}
	}
}
```

### 9. Trie (트라이/접두사 트리)

#### 개념
문자열을 저장하고 검색하는 데 사용되는 트리 형태의 자료구조  
노드가 문자를 나타내며, 루트부터 특정 노드까지의 경로가 하나의 단어(접두사)를 나타냄  

#### 특징
- 주로 자동 완성(Autocomplete), 맞춤법 검사, 사전 등의 기능 구현에 사용됨  
- 문자열 탐색 시간이 문자열의 길이($L$)에 비례하여 **$\text{O}(L)$**로 빠름 (일반적으로 해시 테이블보다 빠름)  
- 메모리 사용량이 많을 수 있음  

#### 실생활 예시
구글 검색창의 검색어 자동 완성 기능, 휴대폰 키패드 입력 예측  

#### 자바 예시 코드
트라이 노드 구조의 단순화된 예시  

```java
import java.util.HashMap;
import java.util.Map;

// 트라이의 각 노드를 나타내는 클래스
class TrieNode {
	// 다음 문자를 저장하는 맵 (자식 노드)
	Map<Character, TrieNode> children = new HashMap<>();
	// 이 노드에서 단어가 끝나는지 표시
	boolean isEndOfWord = false;
}

public class TrieExample {
	// 트라이의 시작점(루트 노드)
	private TrieNode root = new TrieNode();

	// 단어를 트라이에 삽입하는 메서드
	public void insert(String word) {
		TrieNode current = root;
		for (char ch : word.toCharArray()) {
			// 현재 문자에 해당하는 자식 노드가 없으면 새로 생성
			current = current.children.computeIfAbsent(ch, c -> new TrieNode());
		}
		// 마지막 노드에 단어 끝 표시
		current.isEndOfWord = true;
	}
}
```

---  

## Why Study Data Structures?
- 데이터 처리 속도 증가
- 메모리 사용을 최적화
- 알고리즘 구현의 기초. 문제 해결 능력 증대

## Summary Table

| 자료구조 | 특징 | 예시 응용 |
| :---: | :--- | :--- |
| 배열 (Array) | 고정 크기, 빠른 인덱스 접근 | 학생 성적, 이미지 픽셀 |
| 연결 리스트 (Linked List) | 동적 크기, 느린 인덱스 접근, 빠른 삽입/삭제 | 음악 재생 목록, 웹 브라우저 방문 기록 |
| 스택 (Stack) | LIFO (Last In First Out) 구조 | 함수 호출, 실행 취소 (Undo) |
| 큐 (Queue) | FIFO (First In First Out) 구조 | 프린터 작업 대기열, 은행 번호표 |
| 우선순위 큐 (Priority Queue) | 힙 기반, 데이터가 우선순위에 따라 추출 | 응급실 환자 처리, 작업 스케줄링 |
| 힙 (Heap) | 완전 이진 트리, 우선순위 큐 구현 | 작업 스케줄링, 다익스트라 최단 경로 |
| 트리 (Tree) | 계층적 구조, 노드 간 부모-자식 관계 | 파일 시스템, 데이터베이스 인덱스 |
| 해시 테이블 (Hash Table) | 키-값 저장, 평균 $\text{O}(1)$ 탐색 | 전화번호부, 데이터베이스 인덱싱 |
| 트라이 (Trie) | 문자열 기반의 트리 구조, 노드가 문자를 나타냄 | 검색어 자동 완성, 맞춤법 검사 |
| 그래프 (Graph) | 복잡한 연결 관계, 노드와 간선으로 구성 | 소셜 네트워크, 지도 경로 탐색 |