# Composite Pattern
###### - 그릇과 내용물 동일시하기
<br />

### 내용 정리

컴퓨터의 파일 시스템의 경우, 디렉터리안에 파일이나 다른 디렉토리가 존재한다.

이는 그릇(Composite)안에 내용물(Component)을 넣을 수도 있고, 작은 그릇(Composite)을 넣을 수도 있다는 의미와 같다.

디렉터리와 파일을 합해서 '디렉터리 엔트리'라고 함.

디렉터리 엔트리는 디렉터리와 파일을 같은 종류로 간주한다. (동일시 함)

어떤 디렉터리 안에 무엇이 있는지를 차례대로 조사한다고 가정할 때, 차례로 조사하는 것은 하위 디렉터리일지도 모르고 파일일지도 모른다.

디렉터리 엔트리처럼 그릇과 내용물을 같은 종류로 취급하면 편리한 경우가 있다.

-> 그릇과 내용물을 동일시하여 재귀적인 구조를 만들기 위한 패턴.

<br />

### 실습
* [예제](./Composite_Sample) - 파일과 디렉터리를 도식적으로 표현한  프로그램. Entry클래스는 디렉터리 엔트리를 나타냄.    
* [문제1](./Composite_A2) - 예제와 동일하게 작동하며, '풀 패스'를 얻는 기능을 추가한 프로그램.
<br />

### Class UML Diagram
<img src="https://user-images.githubusercontent.com/35367660/117236606-f5935180-ae63-11eb-8ccd-11e8ba14dbac.png" width="550">
<br />    

* Leaf(나뭇잎) - 내용물에 해당하는 역할. 이 안에는 다른 것을 넣을 수 없다.
* Composite(복합체) - 그릇을 나타내는 역할. Leaf와 Composite를 넣을 수 있다.
* Component - Leaf 역할과 Composite 역할을 동일시하는 역할.
* Client(의뢰자) - Composite패턴 사용자.
<br>

### 참고 자료
* 일반적으로 트리 구조는 Composite패턴에 속한다.
* Java GUI hierarchy 도 Composite패턴.
* add 메소드 구현 방법
  1. Entry클래스에서 구현, 에러로 처리. (예제 프로그램이 해당)
  2. Entry클래스에서 구현하는데 아무 처리 x. -> File클래스에서 add구현 해야함.
  3. Entry클래스에서 추상 메소드로 선언은 하지만, 구현은 x. -> File클래스에서 add구현 해야함.
  4. Directory클래스에만 넣는다. ->  Entry형의 변수에 add할 때, Directory형으로 일일이 형변환해야 하는 번거로움 발생.
