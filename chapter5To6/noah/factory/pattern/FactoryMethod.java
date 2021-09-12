
/**
 * 팩토리 메서드는 일반적으로 클래스에 일반적인 처리가 있지만 실제로 사용하는 과일의 종류를 변경하려는 경우에 사용된다.
 */
abstract class FactoryMethod {
    protected abstract Fruit makeFruit(); // 보통의 과일

    public void pickFruit() {
        private final Fruit f = makeFruit(); // 어떤 열매를 딸지 선택
    }
}

class OrangePicker extends FactoryMethod {

    @Override
    protected Fruit makeFruit() {
        return new Orange();
    }
}