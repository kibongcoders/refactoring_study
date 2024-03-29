# 중재자(Middle Man)
메세지 체인에 반대에 해당하는 냄새라고 생각할 수 있음  
메세지 체인을 감추다 보면 미들 맨이라는 냄새가 발생 할 수 있다.  
캡슐화 자체는 좋은 것이지만 지나치게 많이 사용하다 보면 필요하지 않는 코드가 사용될 수 있다.  
왜냐하면 그냥 사용해도 될 코드를 그대로 쓰지 못하고 항상 누군가 중간에 있어야 한다면 그건 또 그거 나름대로 리팩토링이 필요한 코드가 될 것이다.

## 중재자 제거하기(Remove Middle Main)
위임 숨기기(Hide Delegate)에 반대되는 리팩토링 -> 메세지 체인을 만들게 되는 리팩토링  
중간에 있는 객체를 사용하는 것보다 직접적으로 접근하는 것이 더 편하게 접근 할 수 있을 때 해당 리팩토링을 사용한다.
캡슐화를 하냐 마냐의 문제는 상황에 따라 맞춰서 리팩토링을 진행하면 된다.

### 중재자가 많이 생기는 경우
로우 오브 디미터, 디미터 디자인 객체 원칙  
- 어떤 메서드 안에서 메서드가 포함되어 있는 클래스에 있는 다른 메서드를 호출하는 것은 OK!
- 그 호출을 거쳐서 다른 객체로 호출하는 것은 Nope!
- 본인이 가지고 있는 필드에 속한 메서드로 호출하는 것은 OK!
- 그 메서드 안에서 생성한 객체, 로컬 오브젝트에 메서드를 추가하는 것 OK!

이 원칙을 지나치게 사용하다 보면 중재자가 많이 생기게 된다.

## 슈퍼클래스를 위임으로 바꾸기(Replace Superclass With Delegate)
상속으로 만들어져 있는 계층 구조를 위임으로 변경하는 리팩토링
객체 지향에서 상속은 여러 가지 이유로 쓰인다. 하지만 상숙은 오로지 딱 하나만 상속 받을 수 있으므로 제한이 생긴다.  
서브 클래스는 슈퍼 클래스를 사용하던 코드의 자리를 서브 클래스가 들어가더라도 잘 작동해야 합니다.(리스코프 치안 원칙)
- 슈퍼클래스가 가지고 있는 오퍼레이션이 일종의 귀약이 되는 것
- 만약 서브 클래스로 들어갈 때 기능 자체가 바뀐다면 그것은 상속을 잘못 쓴다는 것
상속의 가장 큰 단점은 슈퍼 클래스가 변경된다면 서브 클래스가 전부 영향을 받는 것이 큰 단점

그렇다면 상속은 때려 치우고 항상 위임을 사용해야 하는 것인가?
항상은 굉장히 강력한 단어이기에 항상 상속을 사용하면 안되는 것은 아니지만,  
처음에는 상속을 사용하다가 해당 리팩토링으로 위임으로 변경해주면 된다.

## 서브클래스를 위임으로 바꾸기(Replace Subclass With Delegate)
보통 서브클래스를 만드는 이유응 슈퍼클래스의 특정 기능 때문에 여러가지 타입으로 나뉘어지기 때문이다.  
근데 이 상속이라는 것이 오직 한번만 사용할 수 있다는 문제가 있다.  
타입이 2개 이상으로 나뉘어 진다면?? 상속을 사용할 수 있을까? 이러면 머리 아파진다.
그렇다고 상속을 자체가 나쁜건 아니다. 사용하다가 리팩토링이 필요하다면 위임으로 변경하면 된다.



