# 데이터 클래스(Data Class)
클래스안에 어떤 메서드들이 없이 필드만 있을 경우의 냄새이다.
예외적으로 불변 객체로 데이터를 전달하는 용도로 사용할 수 있다.

## 사용 가능한 리팩토링
- 레코드 캡슐화하기(Encapsulate Record) : Getter나 Setter를 통해 접근하도록 변경
- 세터 제거하기(Remove Setting Method) : 변경되지 않아야 할 필드
- 함수 옮기기(Move Function) : 데이터 클래스로 옮기기
- 함수 추출하기(Extract Function) : 코드 일부만 옮겨야 하는 경우

## 레코드 캡슐화하기(Encapsulate Record)
자바의 레코드랑 정확히 일치하지 않음 -> public 필드로 구성된 데이터 클래스
캡슐화를 통해서 허용된 public한 메서드들을 통해 접근하도록 변경