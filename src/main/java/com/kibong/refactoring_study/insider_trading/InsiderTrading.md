# 내부자 거래(Insider Trading)
특정한 모듈이 다른 모듈의 내부 정보를 지나치게 많이 알고 있는 경우의 냄새를 내부자 거래라고 한다.  
(모듈간 결합도로 이해해도 좋다.)

어떤 모듈의 내부 정보가 지나치게 밖으로 공개되어 있거나 붎필요하게 다른 모듈에 있는 정보를 너무 많이 가져오는 코드가 있다면, 내부자 거래의 냄새라고 볼 수 있다.

## 리팩토링 방법
- 함수나 필드를 적절한 위치로 옮겨주기 -> Move Function, Move Field
- 여러 모듈에서 사용하는 기능 이라면 별도의 모듈로 만들기 -> Hide Delegate
- 이 결합도가 상속 관계라면 슈퍼클래스 또는 서브클래스로 위임하기

와 같은 3가지 방법을 사용할 수 있다.