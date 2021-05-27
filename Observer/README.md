# Observer Pattern
###### - 상태의 변화를 알려주기
<br />

### 내용 정리

observer는 관찰하는 사람. 즉, '관찰자'라는 의미.

관찰 대상의 상태가 변하면, 관찰자에게 통지된다.

객체의 상태 변화에 따른 처리를 기술할 때 유용하게 사용된다.

관찰자와 관찰 대상을 논리적으로 분리함으로써, 각각을 쉽게 교체할 수 있다.

따라서 확장성, 교환 가능성이 높아진다.

Observer의 역할이 Subject로부터 통지가 오기를 기다리는 수동적인 역할을 하고 있으므로

'관찰'하는 것이 아니고, 사실은 '통지'를 받기 때문에 Publish(발행)-Subscribe(구독) 패턴이라고도 한다.

-> 오브젝트의 상태변화를 다른 오브젝트에 알리는 패턴.

<br />

### 실습
* [예제](./Observer_Sample) - 숫자 여러 개를 생성하는 객체를 관찰자가 관찰해서, 그 값을 표시하는 프로그램.
* [문제1](./Observer_A1) - 예제와 동일하게 작동하며, 수가 점점 증가하는 것을 표시하는 프로그램. 생성자의 인수로 개시하는 수, 종료하는 수(포함x), 증가분을 전달. (IncrementalNumberGenerator)
* [문제2](./Observer_A2) - 아래 그림처럼 GUI를 사용해서 원 그래프 모양의 ConcreteObserver역할을 추가한 프로그램. (FrameObserver)
<img src="https://user-images.githubusercontent.com/35367660/119758229-27d32480-bee1-11eb-895d-e7ba68065668.PNG" width="300">
<br />

### Class UML Diagram
<img src="https://user-images.githubusercontent.com/35367660/119758345-5a7d1d00-bee1-11eb-9ace-c8b309d7d3e0.png" width="500">
<br />    

* Subject(관찰 대상자) - 관찰되는 대상. 현재 상태를 취득하는 메소드가 선언되어 있음.
* ConcreteSuject(구체적인 관찰 대상자) - 구체적으로 관찰되는 대상. 상태가 변화하면 그것이 등록되어 있는 Observer역할에게 알린다.
* Observer(관찰자) - 상태 변화를 전달받는 역할.
* ConcreteObserver(구체적인 관찰자) - 구체적인 Observer. 상태 변화를 전달받으면 Subject 역할의 현재 상태를 취득한다.
<br>

### 참고 자료     
* Java의 클래스 라이브러리의 Observer 패턴
  - java.util.Observer 인터페이스와 java.util.Observable 클래스
  - Observer인터페이스에는 public void update(Observable obj, Object arg) 메소드가 있다.
  - 하지만, Observer 인터페이스와 Observable 클래스의 사용이 쉽지 않다.
  - why? Observer 인터페이스에서 전달하는 Subject 역할에는 Observable 클래스를 사용할 필요가 있는데,
  - Subject 역할로 만들려는 클래스(관찰대상이 되는 클래스)가 이미 누군가의 하위 클래스로 되어 있을 경우 java.util.Observable 클래스의 하위 클래스로 만들 수 없기 때문. (다중 상속 지원 X)
