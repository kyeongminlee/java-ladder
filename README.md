## 사다리 요구사항 및 구현목록
### 기능 요구사항
* 사다리 실행 결과를 출력해야 한다.
* 개인별 이름을 입력하면 개인별 결과를 출력하고, "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.

### 구현 목록
* [X] 실행 결과 입력 기능
* [X] 사용자와 초기 인덱스 매핑 기능
* [X] 사용자의 마지막 사다리 위치 확인 기능
* [X] 실행 결과와 사용자 매핑 기능
* 실행 결과 출력 기능
    * [X] 결과 보고 싶은 사람 출력 기능
    * [X] 모든 사람 결과 출력 기능 

### 예외처리 목록
* [X] 참가자 수와 실행결과 개수와 맞지 않g을 경우 예외 처리
* [X] 결과 보고 싶은 사람이 참가자가 아닌 경우 예외 처리

### 리팩토링 목록
* LadderController에서 InputView의 책임 분리
    * [X] 참가자 입력 기능 이관
    * [X] 실행 결과 입력 기능 이관
    * [X] 사다리 높이 입력 기능 이관
* [ ] 실행 결과와 사용자 매핑 기능 리팩토링
