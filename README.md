# algorithm-notes

알고리즘 문제 풀이 기록용 저장소  

## 주요 내용  
- 백준, 프로그래머스 문제 풀이를 패키지별 자바 소스코드로 정리  
- 풀이과정, 공부한 개념도 함께 기록  

## 프로젝트 구조  
- `src/baekjoon/` : 백준 문제 풀이 소스코드(패키지 포함)  
- `src/programmers/` : 프로그래머스 문제 풀이 소스코드(패키지 포함)  
- **`src/main/` : 문제별 독립 실행용 메인 클래스 관리**  
    - `MainBaekjoon.java` : 백준 문제 실행용 메인 클래스  
    - `MainProgrammers.java` : 프로그래머스 문제 실행용 메인 클래스  
- docs/study-notes.md: 공부하며 정리한 자바 입출력, 알고리즘 개념 등을 정리한 자료  

## 프로젝트 초기 세팅(IntelliJ 기준)
### 1. `.gitignore`에 제외 리스트 추가
프로젝트 루트의 `.gitignore`에 다음 내용 추가
```gitignore
# IntelliJ IDEA
.idea/
*.iml
misc.xml
modules.xml
vcs.xml
```
### 2. git stage(인덱스)에서 해당 파일 제거
이미 git에 추적되고 있다면 `.gitignore`만 수정해도 적용되지 않으므로, 캐쉬를 강제 제거하고 다시 등록
터미널에서 다음 명령어 실행
```shell
git rm -r --cached .idea
git rm --cached *.iml
git rm --cached misc.xml modules.xml vcs.xml
git add .
```

### 3. github에 repository 공유
이제 git stage에 추적되고 있는 변경사항들을 로컬리포지토리에 커밋하고,  
해당 내용을 github의 원격리포지토리를 생성하고 공유  
(IntelliJ에 github가 로그인되어 있다는 가정)
1. IntelliJ 상단 메뉴에서 VCS 클릭
2. 메뉴 중에서 Share Project on GitHub 선택
3. Repository name 및 Description 입력(예: 🚀 자바로 푸는 알고리즘 문제 풀이 & 학습 기록 저장소 📚)  
4. Visibility(공개 여부) 설정 (Public 또는 Private) 선택
5. Share 버튼 클릭(github에 repository가 생성되고 현재 코드 push됨)

## 실행
기존 `src/`에 있던 `Main` 클래스는 삭제    
대신 `src/main/`의 `MainBaekjoon`, `MainProgrammers` 클래스를 통해 독립적으로 문제별 실행을 관리    
각각의 실행은 하나의 문제만 실행  

- `src/main/` 에서 `MainBaekjoon` 또는 `MainProgrammers`로 문제를 독립적으로 실행  
- 다수 문제를 한꺼번에 실행하여 `입출력 충돌 문제 발생` 방지

## 기타
- 중요 공통 개념은 docs/study-notes.md에 정리  
- 최대한 주석으로 코드의 의도나 로직 이유를 기록  

## 온라인 저지 플랫폼 제출 방법
- 온라인 저지 플랫폼(백준, 프로그래머스)에 제출 시, 반드시 준수해야 제출 가능!  
    - `package` 선언을 반드시 제거할 것  
    - 클래스명은 `Main`으로 변경할 것  
    - 실행 진입점은 `public static void main(String[] args)` 메서드로 작성할 것    

---
