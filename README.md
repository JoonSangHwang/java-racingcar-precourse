# 자동차 경주 게임
## 기능 목록
1. [입력]
- 사용자로부터 자동차 이름을 입력 받는다. (=한 줄)
  - 각 자동차는 쉼표(,)로 이름을 구분한다.
- 사용자로부터 몇 번의 라운드를 진행할지 입력 받는다.
- 입력이 이상하다면 [Error] 메시지를 반환한다.
2. 기능
- 각 라운드마다 자동차들은 0 ~ 9 사이의 Random 값을 받는다.
  - 0 ~ 3 : STOP
  - 4 ~ 9 : GO
- 자동차 이름 Valid 검증 구현
  - 이름의 길이는 1 ~ 5 이다.
- 우승자 뽑기 구현
  - 우승자가 한 명 이상이라면? 쉼표로 이름을 구분하는 로직
3. 출력
- 각 라운드마다 레이싱 내용을 출력한다.
  - 경주에 참가하는 자동차의 모든 이름을 출력한다.
  - 경주에서의 자동차 거리는 하이픈으로 출력한다.
- 우승자 출력
  - 우승자가 한 명 이상이라면? 쉼표로 이름을 구분하여 출력
    
---
---
## 참고 URl
- 자바 코드 컨벤션
  - https://naver.github.io/hackday-conventions-java/
- 깃 메시지 컨벤션
  - https://gist.github.com/stephenparish/9941e89d80e2bc58a153
- 일급콜렉션
  - https://developerfarm.wordpress.com/2012/02/01/object_calisthenics_/
- 모든 원시값과 문자열을 포장
  - https://developerfarm.wordpress.com/2012/01/27/object_calisthenics_4
- 과제 진행 및 제출 방법
  - https://github.com/next-step/nextstep-docs/tree/master/precourse