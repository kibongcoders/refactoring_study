# 기본형 집착 (Primitive Obsession)
• 애플리케이션이 다루고 있는 도메인에 필요한 기본 타입을 만들지 않고 프로그래밍 언어가 제공하는 기본 타입을 사용하는 경우가 많
다.
• 예) 전화번호, 좌표, 돈, 범위, 수량 등
• 기본형으로는 단위 (인치 vs 미터) 또는 표기법을 표현하기 어렵다.
• 관련 리팩토링 기술
• “기본형을 객체로 바꾸기 (Replace Primitive with Object)”
• “타입 코드를 서브클래스로 바꾸기 (Replace Type Code with Subclasses)”
• “조건부 로직을 다형성으로 바꾸기 (Replace Conditional with Polymorphism)”
•
“클래스 추출하기 (Extract Class)”
•
“매개변수 객체 만들기 (Introduce Parameter Object)”

## 기본형을 객체로 바꾸기(Replace Primitive with Object)
• 개발 초기에는 기본형 (숫자 또는 문자열)으로 표현한 데이터가 나중에는 해당 데이터와 관
련있는 다양한 기능을 필요로 하는 경우가 발생한다.
• 예) 문자열로 표현하던 전화번호의 지역 코드가 필요하거나 다양한 포맷을 지원하는 경
우.
• 예) 숫자로 표현하던 온도의 단위 (화씨, 섭씨)를 변환하는 경우.
• 기본형을 사용한 데이터를 감싸 줄 클래스를 만들면, 필요한 기능을 추가할 수 있다.


