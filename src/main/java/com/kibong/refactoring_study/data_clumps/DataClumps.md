# 데이터 뭉치(Data Clumps)
어떤 클래스와 함수에 파라미터들이 비슷하게 넘겨지는 경우를 데이터 뭉치라고 불린다.
이런 경우 따로 빼서 별도의 클래스로 만들거나 파라미터를 하나로 줄이는 리팩토링을 할 수 있다.

뭉치는 파라미터들을 파라미터 객체 만들기, 매개변수 객체 만들기(Introduce Parameter Object),
객체 통째로 넘기기(Preserve Whole Object) 와 같은 리팩토링을 사용할 수 있다.