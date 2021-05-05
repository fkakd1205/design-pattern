# Strategy Pattern
###### - 알고리즘을 동적으로 교체하기
<br />

### 내용 정리

알고리즘을 교체해서 동일한 문제를 다른 방법으로 해결하는 패턴

알고리즘의 부분을 다른 부분과 분리해서 알고리즘의 인터페이스(API) 부분만을 규정할 수 있다.

알고리즘을 개량해서 좀 더 빠르게 하고 싶으면 ConcreteStrategy의 역할만을 수정하면 된다.

'위임'이라는 느슨한 연결을 사용하고 있으므로 알고리즘을 용이하게 교환할 수 있다. (결합도 ↓)

-> 알고리즘을 교체해서 같은 문제를 다른 방법으로도 동작할 수 있도록 도와주는 패턴.

<br />

### 실습
* [예제](./Strategy_Sample) - '가위바위보'를 실행하는 프로그램.   
(전략 : WinningStrategy - 이기면 다음에도 같은 손을 내민다, ProbStrategy - 직전에 냈던 손에서 다음에 낼 손을 확률적으로 계산해 손을 내민다)
* [문제1](./Strategy_A1) - 예제와 동일하게 작동하며, 순서 없이 다음의 손을 내는 RandomStrategy 전략을 추가한 프로그램.
* [문제4](./Strategy_A4) - 정렬을 실행하는 프로그램    
(전략 : SelectionSorter, QuickSorter)
<br />

### Class UML Diagram
<img src="https://user-images.githubusercontent.com/35367660/117108567-5c5e2f80-adbe-11eb-925c-15ba323163ac.png" width="550">
<br />    

* Strategy(전략) - 전략을 이용하기 위한 인터페이스(API)를 결정.
* ConcreteStrategy(구체적인 전략) - Strategy의 인터페이스(API)를 실제로 구현. (구체적인 전략을 구현)
* Context(문맥) - Strategy을 이용하는 역할. ConcreteStrategy의 인스턴스를 가지고 잇으며 필요에 따라 그것을 이용한다.
<br>

### 참고 자료
* Java에서명시적으로 초기화되어 있지 않은 필드는 자동적으로 초기화된다. (로컬변수는 초기화되지 X, 명시적으로 초기화)   
-> 수는 0, Boolean형은 false, 참조형은 null로 초기화.
* 에제 프로그램의 Hand클래스에서 'this == h'가 가능한 이유?     
-> Hand클래스의 인스턴스는 오직 3개만 존재하기 때문에 handvalue값이 같은 인스턴스는 같은 메모리 주소를 가리켜 'this == h'의 값이 true면 같은 인스턴스이다. 
