# Decorator Pattern
###### - 장식과 내용물 동일시하기
<br />

### 내용 정리

스펀지 케이크 1개 있다고 가정. 크림을 바르면 크림 케이크, 여기에 딸기를 얹으면 딸기 케이크, 여기에 초를 꽂으면 생일 케이크.

오브젝트(객체)도 비슷한 경우가 있다.

중심이 되는 오브젝트에 기능을 하나씩 추가해서 좀더 목적에 맞는 오브젝트로 완성시킬 수 있다.

Composite 패턴과 닮은 재귀적인 구조가 등장. 하지만 목적은 다르다.

Composite 패턴은, container가 다시 내용물이 될 수 있다. Decorator 패턴은, 장식하는 클래스가 다시 장식 대상이 될 수 있다.

Decorator 패턴에서 사용되는 위임은 클래스 사이를 느슨하게 결합한다.

따라서 framework의 소스를 변경하지 않고 오브젝트(객체)의 관계를 변경한 새로운 오브젝트(객체)를 만들 수 있다.

-> 장식과 내용물을 동일시하여 오브젝트에 장식을 해 나가는 패턴.

<br />

### 실습
* [예제](./Decorator_Sample) - 1행으로 구성된 문자열 주위에 장식문자(-, +, |)를 입혀 표시하는 프로그램.    
* [문제1](./Decorator_A1) - 예제와 동일하게 작동하며, 상하에 장식문자를 붙이는 기능을 추가한 프로그램. (UpDownBorder.java)
* [문제2](./Decorator_A2) - 예제와 동일하게 작동하며, 복수의 문자열을 표시하는 기능을 추가한 프로그램. (MultiStringDisplay.java)
<br />

### Class UML Diagram
<img src="https://user-images.githubusercontent.com/35367660/118424100-77576a80-b701-11eb-810c-ea15b1c6ee5d.png" width="450">
<br />    

* Component - 기능을 추가할 때 핵심이 되는 역할.
* ConcreteComponent - Component 역할과 동일한 인터페이스(API)를 구현하고 있는 구체적인 클래스.
* Decorator(장식자) - 장식자이면서, 장식할 대상이 되기도 하는 역할. (이 Decorator 역할이 장식할 대상이 되는 Component 역할도 가지고 있다)
* ConcreteDecorator(구체적인 장식자) - 구체적인 Decorator의 역할.
<br>

### 참고 자료     
