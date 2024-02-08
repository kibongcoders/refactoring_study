# 성의없는 요소(Lazy Element)

어떤 Element를 정의 할 때 사용하다 보면 필요 없는 경우가 있다.
그럴 때에는 여러 리팩토링을 사용하여 제거해주면 된다.

## 사용 가능한 리팩토링
- 함수 인라인(Inline Function)
- 클래스 인라인(Inline Class)
- 계층 합치기 Collapse Hierarchy

## 계층 합치기(Collapse Hierarchy)
상속 구조를 리팩토링 하던 중에 기능을 올리고 내리다 보면 하위 클래스와 상위 클래스의 코드 차이가 없는 경우가 발생할 수 있다.
