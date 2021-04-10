# Prototype Pattern
###### - 복사해서 인스턴스 만들기
<br />

### 내용 정리

<pre><code> new Something(); </code></pre>
일반적인 인스턴스 생성은 클래스의 생성자를 호출하는데,

클래스로부터 인스턴스를 새로 만드는게 아니라, 현재 존재하는 인스턴스를 복사(복제)해서 새로운 인스턴스를 만들 필요가 있을 때

이 작업을 편하게 하기 위해 Prototype Pattern이 사용한다.

Prototype은 원형, 규범의 의미로, 여기서 '원형이 되는 인스턴스와 똑같은 새로운 인스턴스를 만든다'로 이해하면 된다.

클래스 안에 자신을 복사하는 메소드를 두어 인스턴스를 복사할 수 있음.

-> 인스턴스를 복사해서 새로운 인스턴스를 만들어 사용하는 패턴

#### new로 생성하지 않고 prototype 패턴을 이용하는 이유?

* 취급하는 오브젝트의 종류가 너무 많아서 클래스로 정리할 수 없는 경우
* 클래스로부터 인스턴스 생성이 어려운 경우 - ex. 사용자의 조작으로 만들어진 인스턴스를 복사하고 싶을 때
* framwork와 생성할 인스턴스를 분리하고 싶은 경우

<br />

### 실습
* [예제](./Prototype_Sample) - 문자열을 테두리 선으로 감싸거나 밑줄을 표시하는 프로그램. 인스턴스를 만들어서 Manager 클래스에 등록해 필요할 때 복제해서 사용.
<br />

### Class UML Diagram
* Prototype 예제기본 UML  
![Prototype_UML](https://user-images.githubusercontent.com/35367660/114257342-4dbc6c80-99fa-11eb-9038-da097338e9f5.PNG)

* 예제(Prototype_Sample) UML (Manager가 Product를 uses)  
![Prototype_Sample_UML](https://user-images.githubusercontent.com/35367660/114257236-69734300-99f9-11eb-817e-493922280ab4.PNG)

* Prototype(원형) - 인스턴스를 복사하여 새로운 인스턴스를 만들기 위한 메소드를 결정.
* ConcretePrototype(구체적인 원형) - 인스턴스를 복사해서 새로운 인스턴스를 만드는 메소드를 구현.
* Client(이용자) - 인스턴스를 복사하는 메소드를 이용해서 새로운 인스턴스를 만든다. 
<br />

### 참고 자료
* 소스내부에 이용할 클래스의 이름이 쓰여있으면 그 클래스와 분리해서 재이용할 수 없다. (우리는 .java파일이 없어도 재사용할 수 있는가가 포인트)
* 복사 대상이 되는 클래스는 java.lang.Cloneable 인터페이스를 구현해야 한다.
* Cloneable 인터페이스를 구현한 클래스의 인스턴스는 clone() 메소드를 호출하면 복사된다.

### Clone() 메소드?
* 원래의 인스턴스와 같은 메모리를 확보, 그 인스턴스의 필드 내용을 복사
* Java의 최상위 클래스인 java.lang.Object에 정의되어 있다. -> 모든 클래스에 clone() 메소드가 상속됨. (*Cloneable 인터페이스 내부에 clone()메소드 정의 X)
* 피상적인 복사(shallow copy)로 필드의 앞에 있는 인스턴스의 내용까지는 고려하지 않는다. -> ex.배열에 대한 참조만 복사될 뿐, 배열의 요소가 하나하나 복사되는 것은 아니다.
* 오버라이드해서 자신이 필요한 '복사'를 정의할 수 있다. 이때 super.clone()을 사용한 상위 클래스의 clone()메소드의 호출이 필요. 
* deep cody 예시 ([참고 https://javacan.tistory.com/entry/31](https://javacan.tistory.com/entry/31))
<pre><code> public MyNumbers() {
      numbers = new int[10];
}
   ...
   
public Object clone() throws CloneNotSupportedException {
      MyNumbers myNum = super.clone();
      myNum.numbers = (int[]) numbers.clone();  //deep copy
      return myNum;
   } </code></pre>
