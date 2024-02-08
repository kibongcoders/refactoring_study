# 반복되는 Switch 문(Repeated Switches)

- 예전에는 switch 문이 한번만 등장해도 냄새라고 생각해 다형성 적용을 권장
- 하지만 최근에는 다형성이 꽤 널리 사용되고 있고 여러 언어에서 세련된 switch 문을 지원하고 있다.
- 따라서 오늘날에는 반복되는 switch 문에서만 리팩토링을 진행하고 있다.
- 리팩토링 자체는 기본형 집착(Primitive Obsession)의 ReplaceConditionalWithPolymorphism 리팩토링을 사용하게 된다.