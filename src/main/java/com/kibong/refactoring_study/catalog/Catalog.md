# 카탈로그(Catalog)
리팩토링 기본 기술을 정리해보고자 한다.

## 기본 기술 목록
- 함수 추출하기 (Extract Function)
- 함수 인라인하기 (Inline Function)
- 변수 추출하기 (Extract Variable)
- 변수 인라인하기 (Inline Variable)
- 함수 선언 변경하기 (Change Function Declaration)
- 변수 캡슐화하기 (Encapsulate Vraiable)
- 변수 이름 바꾸기 (Rename Variable)
- 매개변수 객체 만들기 (Introduce Parameter Object)
- 여러 함수를 클래스로 묶기 (Combine Functions into Class)
- 여러 함수를 변환 함수로 묶기 (Combine Functions into Trasnform)
- 단계 쪼개기 (Split Phase)

## 캡슐화
캡슐화 자체는 언어마다 조금씩 다를 수 있기에 그 범위가 클래스다!라고 이야기 할 수는 없지만,  
기본적으로 캡슐화는 어떤 모듈을 다른 모듈로 공개하지 않아도 되는 데이터를 숨기는 것을 캡슐화라고 한다.

- 자주 사용하는 것은 Public한 필드를 Private하게 바꿔 Getter와 Setter로 필드에 접근하게 하는 것
- 위임 숨기기(Hide Delegate) 리팩토링을 통해 메서드 체인을 캡슐화 하기도 함
- 물론 너무 많이 숨겨서 Remove Middleman이라는 리팩토링을 사용하기도 함
- Substitute Algorithm : 알고리즘 로직 자체를 바꾸는 리팩토링

## 기능 옮기기
함수나 필드 또는 문장을 적절한 위치로 옮기는 기술
- 함수 옮기기 (Move Function) - 가장 근본
- 필드 옮기기 (Move Field) - 가장 근본
- 문장을 함수로 옮기기 (Move Statements into Function) - 스테이트먼트를 함수로 넣어주기
- 문장을 호출한 곳으로 옮기기 (Move Statements to Callers) - 위에 것에 반대
- 인라인 코드를 함수 호출로 바꾸기 (Replace Inline Code with Function Call) - 인라인 코드가 중복되어 사용된다면 함수로 바꾸기
- 문장 슬라이드하기 (Slide Statements) - Extract Function 하기 전에 사용 되는 리팩토링
- 반복문 쪼개기 (Split Loop) - 반복문 안에 여러가지 일을 하니 쪼개서 반복문을 사용
- 반복문을 파이프라인으로 바꾸기 (Replace Loop with Pipeline) - 기능을 없앰
- 죽은 코드 제거하기 (Remove Dead Code)

## 데이터 조직화
데이터(변수, 필드)를 다루는 기술
- 변수 쪼개기 (Split Variable) - 변수 하나도 하나의 용도로 사용하자.
- 필드 이름 바꾸기 (Rename Field) 
- 파생 변수를 질의 함수로 바꾸기 (Replace Derived Variable with Query) - 계산할 수 있는 필드는 선언하지 않기 예) 합계
- 참조를 값으로 바꾸기 (Change References to Value) - 인플로이 대신에 인플로이 이름을 전달하자.

## 조건부 로직 간소화
복잡한 조건문을 가루는 기술

- 조건문 분해하기 (Decompose Conditional) 
- 조건식 통합하기 (Consolidate Conditional Expression) - if 문이 있는 경우에 하나의 메서드로 통합하기****
- 중첩 조건문을 보호 구문으로 바꾸기 (Replace Nested Conditional with Guard
Clauses)
- 조건부 로직을 다형성으로 바꾸기 (Replace Conditional with Polymorphism) - 동일한 스위치가 여러번? -> 다형성 적용해서 여러개 클래스로
- 특이 케이스 추가하기 (Introduce Special Case)- 상속 관계로 만들기
- 어서션 추가하기 (Introduce Assertion)

## API 리팩토링
우리가 사용하고 있는 프로그래밍 인터페이스, 클래스, 메소드 인터페이스 전부 API이다.
함수의 선언부를 변경하는 것이 API 리팩토링이다.

- 질의 함수와 변경 함수 분리하기 (Separate Query from Modifier) - 조회와 변경 분리하기
- 함수 매개변수화하기 (Parameterize Function) - 여러개 함수가 하나의 매개변수마다 다르다면 매개변수를 추가하자
- 플래그 인수 제거하기 (Remove Flag Argument) - 플래그 성격의 메소드 Argument를 제거
- 객체 통째로 넘기기 (Preserve Whole Object) 
- 매개변수를 질의 함수로 바꾸기 (Replace Parameter with Query) - 다른 파라미터를 통해 알 수 있다면 전달하지 않기
- 질의 함수를 매개변수로 바꾸기 (Replace Query with Parameter) - 함수의 의존성 정도를 컨트롤하는 리팩토링
- 세터 제거하기 (Remove Setting Method)
- 생성자를 팩토리 함수로 바꾸기 (Replace Constructor with Factory Function)
- 함수를 명령으로 바꾸기 (Replace Function with Command) - 일반적임 함수를 쓸거냐 커맨드 패턴으로 바꿀거냐
- 명령을 함수로 바꾸기 (Replace Command with Function) - 

