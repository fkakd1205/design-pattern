# Command Pattern
###### - 명령을 클래스로 표현하기
<br />

### 내용 정리

클래스가 일을 실행할 때에는 자신의 클래스나 다른 클래스의 메소드를 호출한다.

메소드를 호출한 결과는 오브젝트(객체)의 상태에 반영되지만, 일의 이력은 남지 않는다.

이력을 관리하고 싶을 때에는 그 인스턴스의 집합을 관리하면 된다.

명령의 집합을 저장해 두면 같은 명령을 재실행할 수도 있고, 복수의 명령을 모아서 새로운 명령으로 재이용할 수도 있다.

-> '명령'을 오브젝트(객체)로 표현하고, 이력을 저장하거나 재실행하는 일이 가능한 패턴.

<br />

### 실습
* [예제](./Command_Sample) - 간단한 그림그리기 소프트웨어. (사용자가 마우스 드래그할 때마다 해당 위치에 점을 그린다)
* [문제1](./Command_A1) - 예제 프로그램에서 그림그리기 색을 설정하는 기능을 추가한 프로그램. (ColorCommand 추가)
* [문제2](./Command_A2) - 예제 프로그램에서 마지막으로 그린 점을 삭제하는 기능을 추가. (undo 기능 추가)
* [문제3](./Command_A3) - MouseMotionListener 인터페이스와 WindowListener 인터페이스를 사용하는 대신에 MouseMotionAdapter 클래스와 WindowAdapter 클래스를 사용하도록 예제 프로그램의 Main을 수정.
<br />    

- 문제1 결과
<img src="https://user-images.githubusercontent.com/35367660/123208142-83e99280-d4f9-11eb-9191-2258345d6f69.PNG" width="300">

### Class UML Diagram
<img src="https://user-images.githubusercontent.com/35367660/123207347-391b4b00-d4f8-11eb-809e-1d5d7f8b31fe.png" width="600">
<br />    

* Command(명령) - 명령의 인터페이스(API)를 정의하는 역할.
* ConcreteCommand(구체적 명령) - Command 역할의 인터페이스(API)를 실제로 구현하고 있는 역할.
* Receiver(수신자) - Command 역할이 명령을 실행할 때 대상이 되는 역할.
* Client(의뢰자) - ConcreteCommand 역할을 생성하고, 그 사이에 Receiver 역할을 할당.
* Invoker(기동자) - 명령의 행동을 개시하는 역할.
<br>

### 참고 자료     
* Anonymous Inner Class(익명 내부 클래스)
  - 인터페이스를 implements하면 그 인터페이스의 모든 메소드를 구현해줘야 한다.
  - 예제 프로그램의 Main 클래스에서 세 개의 인터페이스를 구현하고 있는데, 인터페이스의 메소드 중에서 실제로 사용되고 있는 것을 일부분이다.
  - 프로그래밍을 간결하게 하기 위해 어댑터라는 클래스들이 java.awt.event 패키지에 준비되어 있다.
  - MouseMotionListener 인터페이스 -> MouseMotionAdapter 클래스, WindowListener 인터페이스 -> WindowAdapter 클래스
  - 하위 클래스를 만들어 필요한 메소드만을 구현해서 목적을 달성할 수 있다.
  - Java의 Anonymous Inner Class를 조합해서 어댑터를 사용하면 더욱 깔끔한 프로그램을 기술할 수 있다.
  - 아래 코드처럼 사용. 이때 mouseMoved는 작성하지 않아도 된다.
<pre><code>public Main(String title){
    ...
    canvas.addMouseMotionListener(new MouseMotionAdapter(){
      public void mouseDragged(MouseEvent e) {
          Command cmd = new DrawCommand(canvas, e.getPoint());
          history.append(cmd);
          cmd.execute();
      }
    });
    ...
}</code></pre>
