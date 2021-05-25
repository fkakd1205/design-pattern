# Visitor Pattern
###### - 데이터구조를 돌아다니면서 처리하기
<br />

### 내용 정리

데이터 구조 안에 많은 요소가 저장되어 있고, 그 각 요소에 대해서 무언가 '처리'해 간다고 가정하면

'처리'의 대한 코드는 일반적으로 데이터 구조를 표시하고 있는 클래스 안에 기술한다.

만약, 그 '처리'가 여러 종류라면 새로운 처리가 필요할 때마다 데이터 구조의 클래스를 수정해야 한다.

Visitor패턴에서는 데이터 구조와 처리를 분리.

데이터 구조 안을 돌아다니는 주체인 '방문자'를 나타내는 클래스를 준비해서 그 클래스에게 처리를 위임.

새로운 처리를 추가하고 싶을 때에는 새로운 '방문자'를 만들면 된다.

-> 데이터구조를 돌아다니면서 처리를 실행하는 패턴.

<br />

### 실습
* [예제](./Visitor_Sample) - Composite패턴의 예제에서 사용된 파일과 디렉토리를 다시 사용. (파일과 디렉터리를 도식적으로 표현한 프로그램)
* [문제1](./Visitor_A1) - 예제와 동일하게 작동하며, 지정된 파일 확장자의 파일을 모으는 기능을 추가한 프로그램. (FileFindVisitor.java)
* [문제2](./Visitor_A2) - 예제와 동일하게 작동하며, 사이즈를 얻는 처리를 추가한 프로그램. (SizeVisitor.java)
* [문제3](./Visitor_A3) - 예제와 동일하게 작동하며, java.util.ArrayList에 Element 인터페이스의 기능을 가진 ElementArrayList 클래스를 작성. (ElementArrayList.java)
<br />

### Class UML Diagram
<img src="https://user-images.githubusercontent.com/35367660/119464330-96976d00-bd7d-11eb-81bc-72970baab00f.png" width="800">
<br />    

* Visitor(방문자) - 구체적인 요소에 visit(xxx)메소드를 선언하는 역할. (예제에서 xxx는 File과 Directory)
* ConcreteVisitor(구체적인 방문자) - VIsitor역할의 인터페이스(API)를 실제로 구현하는 역할.
* Element(요소) - Visitor 역할이 방문할 장소를 나타내는 역할.
* ConcreteElement(구체적인 요소) - Element역할의 인터페이스를 구현하는 역할.
* ObjectStructures(오브젝트의 구조) - Element역할의 집합을 취급하는 역할.
<br>

### 참고 자료     
* [String의 startsWith(), endsWith()](https://codechacha.com/ko/java-string-startswith-endswith/)
    1. startsWith() - 해당 String 객체가 인자로 전달된 String으로 시작한다면 true를 리턴하고 그렇지 않다면 false를 리턴한다.
    2. endsWith() - 해당 String 객체가 인자로 전달된 String으로 끝난다면 true를 리턴하고 그렇지 않다면 false를 리턴한다.
* [The Open-Closed Principle(OCP)](https://ko.wikipedia.org/wiki/%EA%B0%9C%EB%B0%A9-%ED%8F%90%EC%87%84_%EC%9B%90%EC%B9%99) - 확장에 대해서는 열고, 수정에 대해서는 닫는다. ('객체 지향 프로그래밍'의 핵심 원칙)
    1. 확장에 대해서는 열려있다. - 클래스를 설계할 때, 특별한 이유가 없는한 장래의 확장을 허락. 변경에 맞게 새로운 동작을 추가하여 모듈을 확장할 수 있다.
    2. 수정에 대해서는 닫혀있다. - 확장을 하더라도 기존의 클래스는 수정할 필요가 없어야 한다.
<pre><code>
  class MyString extends String{        // 컴파일 에러 남
        ...
  }
</code></pre>
* String클래스는 확장에 관한 The Open-Closed Principle을 위반하고 있지만, 사실은 위반할만한 정당한 이유가 있다. why? Java 언어처리계는 Stirng클래스가 확장되지 않는다는 전제아래 처리 속도에 관한 최적화 및 메모리 양에 관한 최적화를 실행하기 때문.
