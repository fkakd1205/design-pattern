# FactoryMethod Pattern
###### - 하위 클래스에서 인스턴스 만들기
<br />

### 내용 정리

TemplateMethod를 변형한 패턴.

인스턴스를 만드는 방법은 상위 클래스 측에서 결정.

구체적인 내용은 모두 하위 클래스 측에서 수행. (인스턴스를 실제로 생성)

인스턴스 생성을 위한 패키지와 구체적인 내용을 구현하는 패키지로 구분.

-> 인스턴스 생성을 위한 골격(framwork)과 실제 인스턴스 생성의 클래스를 분리하는 패턴.

<br />

### 실습
* [예제](./FactoryMethod_Sample) - 신분증(ID 카드)을 만드는 공장. 인스턴스 생성을 위한 골격과 구현을 분리함.
* [문제](./FactoryMethod_A2) - 예제와 동일한 동작을 하지만, 신분증의 인증번호와 소지자의 대응표를 갖도록 수정한 프로그램.

<br />

### Class UML Diagram
* FactoryMethod 기본 UML


![FactoryMethod_UML](https://user-images.githubusercontent.com/35367660/113965817-0a7ec400-9869-11eb-80af-bdc9ce863c29.PNG)

* 예제(FactoryMethod_Sample) UML (Factory가 Product를, IDCardFactory가 IDCard를 Creates)


![FactoryMethod_Sample_UML](https://user-images.githubusercontent.com/35367660/113965833-0fdc0e80-9869-11eb-8479-c552fa30b9c4.PNG)

* Product(제품) 클래스 - 생성된 제품(인스턴스)이 가지고 있어야 할 인터페이스(API)를 결정하는 추상 클래스.
* Creator(= Factory)(생산자) 클래스 - Product 클래스를 생성하는 추상 클래스. Creator는 실제 제품을 생성하는 일을 하는 ConcreteCreator역할에 대해서는 아무것도 모름.
* ConcreteProduct(구체적 제품) 클래스 - 구체적인 제품을 나타내는 클래스.
* ConcreteCreator(= ConcreteFactory)(구체적 생산자) 클래스 - 구체적인 제품을 만드는 클래스.
<br />

### 참고 자료
