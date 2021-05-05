# Adapter Pattern (=Wrapper Pattern)
###### - 바꿔서 재이용하기
<br />

### 내용 정리

어댑터(Adapter)는 'adapt(개조)시키는 것'이라는 의미.

예를들어, AC 어댑터는 가정용 전원으로 제공되고 있는 '교류 100볼트'를 지금 필요한 '직류 12볼트'로 교환해준다.

위의 예처럼 이미 제공되어 있는 그대로 사용할 수 없을 때, 필요한 형태로 교환하고 사용하는 경우가 있다.

이를 객체 지향 프로그래밍에서도 비슷하게 적용 할 수 있다.

직접적으로 메소드를 호출하지 않고 어댑터를 거쳐 메소드를 호출하는 방식.

-> '이미 제공되어 있는 것'과 '필요한 것'사이의 차이를 없애주기 위해 적용되는 패턴.

<br />

### 실습
* [예제1](./Adapter_Sample1) - 제공되어 있는 Banner 클래스를 상속하여, 필요로 하는 Print 인터페이스를 구현하는 프로그램. 클래스에 의한 Adapter 패턴(상속)
* [예제2](./Adapter_Sample2) - 예제1과 동일한 프로그램. 인스턴스에 의한 Adapter 패턴(위임)
* [문제](./Adapter_A2) - java.util.Properties 클래스에 property의 집합을 파일에 보존하는 FileProperties클래스 구현. 클래스에 의한 Adapter 패턴(상속)

<br />

### Class UML Diagram
* 클래스에 의한 Adapter 패턴 (상속 사용)
<img src="https://user-images.githubusercontent.com/35367660/117099872-47c56b80-adad-11eb-9bf9-245537eb0b76.png" width="500">

* 인스턴스에 의한 Adapter 패턴 (위임 사용)
<img src="https://user-images.githubusercontent.com/35367660/117099874-485e0200-adad-11eb-8b6d-df922732d644.png" width="500">

* Target(대상) 인터페이스 or 클래스 - 필요한 메소드를 제공(선언)하는 역할.
* Client(의뢰자) 클래스 - Target 역할의 메소도를 사용해서 일을 하는 역할. (= Main Class)
* Adaptee(개조되는 쪽) 클래스 - 이미 준비되어 있는 메소드를 제공하는 역할.
* Adapter 클래스 - Adaptee 역할의 메소드를 사용해 Target 역할을 충족시키는 역할.
<br />

### 참고 자료
