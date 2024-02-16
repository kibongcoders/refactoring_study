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
