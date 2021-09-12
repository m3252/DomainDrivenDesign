
/**
 * 팩토리는 서브클래스 없이 구현이 하나만 있다는 점에서 고정적이다.
 * 사용 사례: 사과 또는 오렌지를 생성하는 것이 클라이언트에서 처리하기에는 너무 복잡할 때
 */
public class Factory {
    public Apple makeApple(args1, args2, args3, args4, args5, args6, args7) {
    }

    public Orange makeOrange(String ... args) {
    }
}