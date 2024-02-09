# 추측성 일반화(SpeculativeGenerality)
당장 필요하지 않음에도 이런거까지 필요할 것 같다는 추축 때문에 코드가 늘어나거나 쓰이지 않는 경우

그래서 익스트림 프로그래밍에서 주장하는 원칙은 당장 필요한게 아니면 만들지 말라는 원칙이 있다.

## 관련 리팩토링
- 계층 합치기(Collapse Hierarchy) : 추상 클래스는 만들었는게 유효하지 않은 경우
- 함수 인라인(Inline Function), 클래스 인라인(Class Inline) : 불필요한 위임의 경우
- 함수 선언 변경하기(Change Function Declaration) : 사용하지 않는 파라미터를 가진 함수의 경우
- 죽은 코드 제거하기(Remove Dead Code) : 오로지 테스트 코드에서만 사용하고 있는 경우

## 죽은 코드 제거하기(Remove Dead Code)
현재 어플리케이션에 필요 없는 코드를 삭제하는 단순한 리팩토링
