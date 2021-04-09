# Singleton Pattern
###### - 인스턴스 한 개만 만들기
<br />

### 내용 정리

클래스의 인스턴스가 단 하나만 필요한 경우가 있음.

시스템 안에서 1개밖에 존재하지 않는 것을 프로그램으로 표현하고 싶을 때.

예를 들어, 컴퓨터 자체를 표현한 클래스, 현재의 시스템 설정을 표현한 클래스, 윈도우 시스템을 표현한 클래스 등

singleton는 '요소를 1개밖에 가지고 있지 않은 집합'을 의미

-> 인스턴스가 1개밖에 존재하지 않는 것을 보증하는 패턴

<br />

### 실습
* [예제](./Singleton_Sample) - 인스턴스 1개만 존재하는 클래스를 구현하고 확인하는 프로그램.
* [문제1](./Singleton_A1) - 인스턴스를 1개만 생성하여 ticket의 번호나 일련 번호를 만드는 프로그램.
* [문제2](./Singleton_A2) - 인스턴스의 개수가 3개로 한정되어 있는 클래스 Triple을 만드는 프로그램.
* [문제3-1](./Singleton_A3_1) - [예제]처럼 Singleton패턴을 구현하고자 함. 하지만 Singleton.java의 if(Singleton == null)에서 멀티스레드로 인해 인스턴스 하나만 생성된다는 보장 X.
* [문제3-2](./Singleton_A3_2) - [문제3-1]과 동일하지만, synchonized를 사용해 Singleton패턴 보장.
<br />

(문제3-1결과) - 3개의 다른 인스턴스가 생성 -> Singleton X

<img src="https://user-images.githubusercontent.com/35367660/114137391-1640b800-9947-11eb-9f8f-f891ea3a6ec1.PNG" width="200">

(문제3-2결과) - 1개의 같은 인스턴스가 생성 -> Singleton O

<img src="https://user-images.githubusercontent.com/35367660/114137392-16d94e80-9947-11eb-8878-74d4c4ab0245.PNG" width="270">

### Class UML Diagram
![Singleton_UML](https://user-images.githubusercontent.com/35367660/114137397-1771e500-9947-11eb-9886-a600e3107909.PNG)

* Singleton 클래스 - 인스턴스가 하나만 존재하는 클래스. 유일한 인스턴스를 얻기 위한 static 메소드를 가지고 언제나 동일한 인스턴스를 반환한다. (private static 멤버, private 생성자, public static 메소드)

<br />

### 참고 자료
