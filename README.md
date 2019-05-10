# java-racingcar
자동차 경주 게임 미션 저장소

## 기능 구현 목록
___

### 자동차의 목록을 입력 받기

- 자동차의 목록을 입력 받는다.
- 자동차 내부에서 0에서 9사이의 랜덤값을 생성한다.
- 4이상의 값이 생성되면 차를 이동한다.
- 입력받은 문자열을 쉼표를 기준으로 분리한다.

- 예외 처리

```markdown
- 자동차가 2개 미만인 경우 : 최소 경기 실행 조건
- 중복된 자동차 이름이 있을 경우
- 자동차의 이름이 5자를 넘는 경우
- 입력이 빈 칸 등의 올바르지 않는 입력일 경우
```

### 게임의 진행 횟수를 입력 받기

- 시도할 게임 횟수를 입력 받는다.

- 예외 처리
```markdown
- 숫자 입력이 아닌 경우 
- 게임 횟수가 1 미만인 경우
```

### 자동차 경주 게임 진행

- 시도 횟수만큼 게임 라운드를 진행한다.
- 가장 긴 이름에 맞게 이름 칸 크기를 맞춘다.
- 자동차의 이동횟수만큼 거리를 출력한다. ([예시] green : ---)
- 한꺼번에 출력하지 않고 1초마다 게임 라운드 진행 상황을 출력한다.

### 게임 우승자 출력 

- 게임을 완료하면 우승자를 출력한다.
- 중복 우승자를 고려하여 출력한다.