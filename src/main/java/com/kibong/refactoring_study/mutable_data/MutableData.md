# 가변 데이터(Mutable Data)

자바에서는 데이터의 변경이 많이 일어난다.
함수형 프로그래밍 언어는 복사본을 전하기에 사이드 이팩트가 발생하지 않는다.
하지만 그 밖에 프로그래밍 언어는 데이터 변경을 허용하고 있기에 데이터 발생 시 리스크를 관리할 수 있는 방법을 적용해야한다.

## 관련 리팩토링
- 변수 캡슐화하기(Encapsulate Variable) -> 데이터를 변경할 수 있는 메소드를 제한하고 관리할 수 있다.
- 변수 쪼개기(Split Variable) -> 여러 데이터를 저장하는 변수를 나눌 수 있다.(의미를 담을 수 있다.)
- 코드 정리하기(Slide Statements),함수 추출하기(Extract Function),질의 함수와 변경 함수 분리하기(Separate Query from Modifier) -> 질의 함수와 변경함수를 분리하기 위한 리팩토링
- 세터 제거하기(Remove Setting Method) -> 데이터를 변경하는 방법을 제한한다.
- 파생 변수를 질의 함수로 바꾸기(Replace Derived Variable with Query) -> 계산이 가능한 경우 팩토링 가능
- 여러 함수를 클래스로 묶기 (Combine Functions into Class),여러 함수를 변환 함수로 묶기 (Combine Functions into
Transform) -> 변수가 사용되는 범위를 제한하는 리팩토링
- 참조를 값으로 바꾸기(Change Reference to Value) -> 데이터 전체 교체 가능