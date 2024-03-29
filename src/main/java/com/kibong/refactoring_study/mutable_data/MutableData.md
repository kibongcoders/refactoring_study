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

## 변수 쪼개기(Split Variable)
어떤 변수가 여러번 재할당 되어도 적절한 경우

## 질의 함수와 변경 함수 분리하기(Separate Query from Modifier)
- “눈에 띌만한” 사이드 이팩트 없이 값을 조회할 수 있는 메소드는 테스트 하기도 쉽고, 메소
드를 이동하기도 편하다. 조회만 할 수 있는 함수는 사용하기다 편하다.
- 명령-조회 분리 (command-query separation) 규칙: 어떤 값을 리턴하는 함수는 사이드 이팩트가 없어야 한다.
- “눈에 띌만한 (observable) 사이드 이팩트” 가령, 캐시는 중요한 객체 상태 변화는 아니다. 따라서 어떤 메소드 호출로 인해, 캐시 데
이터를 변경하더라도 분리할 필요는 없다.

## 세터 제거하기(Remove Setting Method)
- 세터가 정말로 필요한지 생각해본 다음 세터를 제공하는 것이 좋다.
- 세터를 통해 값을 변경할 수 있기에 세터 보다는 생성자로 값을 생성하는 것이 좋다.

## 파생 변수를 질의 함수로 바꾸기(Replace Derived Variable with Query)
- 다른 데이터를 이용해서 만들어진 변수를 변경해주는 것을 줄여주는 리팩토링이다.
- 파생변수가 변하지 않는 final한 값이라면 리팩토링을 하지 않아도 된다.

## 여러 함수를 클래스로 묶기 (Combine Functions into Class)
변환 함수를 이용해서 새로운 데이터를 만들어 내는 리팩토링  
변경 될 만한 데이터를 필드로 놓고 변경 할 대마다 필드 데이터를 변경하면서 사용하는 것이 바람직하다.
- 관련있는 여러 파생 변수를 만들어내는 함수가 여러곳에서 만들어지고 사용된다면 그러한
파생 변수를 “변환 함수 (transform function)”를 통해 한 곳으로 모아둘 수 있다.
- 소스 데이터가 변경될 수 있는 경우에는 “여러 함수를 클래스로 묶기 (Combine
Functions into Class)”를 사용하는 것이 적절하다.
- 소스 데이터가 변경되지 않는 경우에는 두 가지 방법을 모두 사용할 수 있지만, 변환 함수
를 사용해서 불변 데이터의 필드로 생성해 두고 재사용할 수도 있다.

## 참조를 값으로 바꾸기(Change Reference to Value)
변하는 값을 변하지 않는 값으로 변경하는 리팩토링
- 레퍼런스 (Reference) 객체 vs 값 (Value) 객체
- 객체의 변경 내역을 다른 곳으로 전파시키고 싶다면 레퍼런스 한정된 곳이면 값 객체(변경사항 전파가 최소한)
- https://martinfowler.com/bliki/ValueObject.html
- “Objects that are equal due to the value of their properties, in this case their x
and y coordinates, are called value objects.”