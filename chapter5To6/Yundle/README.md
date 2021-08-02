## 05 소프트웨어에서 표현되는 모델

---

#### - 연관관계
#### - Entity( 엔티티 , 참조객체 ) , Value Object ( 값 객체 )

> 어떤 객체가 연속성과 식별성을을 지닌것을 의미하는가? 아니면 다른 상태를 기술하는 속성에 불과한가. 
> 
> 이 내용은 Entity와 Value Object를 구분하는 가장 기본적인 방법이다.

```java
// Entity
@Entity
class User {
    @Id
    @Generatedvalue(strategy = generationtype.identity)
    private Long 
    
    ...
}

// Value Object 
class Money {
    private BigDecimal value;
    
    ...
}


```

#### - Service ( 서비스 )

> 어떠한 연산을 Entity나 Value Object에게 억지로 맡기는것 보다 Service로 표현하는 편이 나을 때가 있다.
> 
> Service는 Client의 요청에 대해 수행되는 무언가를 의미하기도 한다.
> 
> 소포트웨어에서 수행해야 하는 것에는 해당하지만 상태를 주고받지는 않는 활동을 모델링 하는 경우가 여기에 해당한다.

#### - Module ( 모듈, 패키지라고도 함 )

> 모든 설계 관련 의사결정은 도메인에 부여된 통찰력을 바탕으로 내려야 한다는 사실을 알게 될 것이다.
> 
> 높은 응집도와 낮은 결홉도 라는 개념은 도메인 개념에도 적용할 수 있다 .
> 

#### - 모델링 패러다임

<br><br>



### 💻 연관 관계

---

연관 관계는 흔히 개발하면서 들어볼수 있는 1:N, N:1, N:N 과 같은 객체와 객체 or 테이블과 테이블간의 관계를 표현할때 
자주 사용하는 용어입니다. 

기존에 RDBMS나 JPA ORM 을 사용해보셨다면 모다 알는 1:N, N:1, N:N 과 같은 다양한 연관관계가 있으며,
그중 상당수는 양방향으로 나타난다.

#### 연관관계를 좀더 쉽게 다루는 방법 3가지.
> 1. 탐색 방향을 부여한다( 단방향, 양방향 )
> 2. 한정자(qualifier)를 추가해서 사실상 다중성(multiplicity)을 줄인다.
> 3. 중요하지 않은 연관관계는 제거한다.


