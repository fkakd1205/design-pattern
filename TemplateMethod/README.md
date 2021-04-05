# TemplateMethod Pattern
###### - 하위 클래스에서 구체적으로 처리하기
<br />

### 내용 정리

상위 클래스(추상 클래스)에서, 템플릿 역할을 하는 메소드가 정의됨.

그 메소드의 정의 안에서 추상 메소드들을 사용.

하위 클래스가 추상 메소드를 실제로 구현.

-> 상위 클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 구체적인 내용을 결정하는 패턴.

<br />

### 실습
* [예제](./Template_Sample) - 상위 클래스(추상 클래스) AbstractDisplay에서 추상 메소드인 open, print, close를 사용하여 TemplateMethod인 display를 정의.
하위 클래스는 open, print, close를 구현. 동일한 동작으로 문자열을 표시하는 프로그램.

<br />

### Class UML Diagram
![TemplateMethod_UML](https://user-images.githubusercontent.com/35367660/113528224-f170db80-95fa-11eb-9af5-6338ecc400bc.PNG)

![TemplateMethod_Sample_UML](https://user-images.githubusercontent.com/35367660/113528312-2b41e200-95fb-11eb-9d1d-6b0ff9bf1b2f.PNG)

* AbstractClass(추상 클래스) - 템플릿 메소드를 구현하는 역할. 또한 그 템플릿 메소드에서 사용하고 있는 추상 메소드를 선언.
* ConcreteClass(구현 클래스) - AbstractClass에서 정의되어 있는 추상 메소드르 구체적으로 구현.

<br />

### 참고 자료
