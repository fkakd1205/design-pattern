# Iterator Pattern
###### - 순서대로 지정해서 처리하기
<br />

### 내용 정리
<pre><code>
  for(int i = 0; i < array.length; i++){ 
       System.out.println(array[i]);
  }
</code></pre>
보통 순서대로 처리하는 일을 처리할 때 위와 같이 for문을 사용한다.

여기서 사용되고 있는 변수 i의 기능을 추상화해서 일반화한 것이다.

-> 무엇인가 많이 모여있는 것 중에서 하나씩 끄집어내어 순서대로 처리하는 일을 할 때 이 패턴을 적용.

<br />

### 실습
* [예제](./Iterator_Sample) - 서가(BookShelf) 안에 책(Book)을 넣고, 그 책의 이름을 차례대로 표시하는 프로그램.
* [문제](./Iterator_A1) - 예제와 동일한 동작을 하지만, 최초의 서가 크기를 초과하여 책을 넣을 수 있는 프로그램.

<br />

### Class UML Diagram
![Iterator Pattern](https://user-images.githubusercontent.com/35367660/117099272-b43f6b00-adab-11eb-9d85-cffd9a4a7641.png)

* Iterator(반복자) 인터페이스 - 원소를 하나씩 끄집어낼 때 사용할 공통된 메소드를 선언.
* ConcreteIterator(구체적인 반복자) 클래스 - Iterator 인터페이스를 구현.
* Aggregate(집합체) 인터페이스 - Iterator를 만들어냄.
* ConcreteAggregate(구체적인 집합체) 클래스 - Aggregate 인터페이스를 구현, ConcreteIterator(구체적인 반복자) 객체를 생성.
<br />

### 참고 자료
