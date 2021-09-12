

/**
 * 추상 팩토리는 일반적으로 '동일한 종류'(같은 인터페이스)여야 하고
 * 몇 가지 공통 기본 클래스가 있어야 하는 전체 개체 패밀리를 만들 수 있기를 원할 때 종속성 주입/전략과 같은 작업에 사용됩니다.
 *
 * 사용 예 : 사과 공장에서 실수로 오렌지를 띠지 않도록 하려는 것이다.
 */

interface AbstractFactory {
    Plant makePlant();
    Picker makePicker();
}

public class AppleFactory implements AbstractFactory {
    Plant makePlant() {
        return new Apple();
    }

    Picker makePicker() {
        return new ApplePicker();
    }
}

public class OrangeFactory implements AbstractFactory {
    Plant makePlant() {
        return new Orange();
    }

    Picker makePicker() {
        return new OrangePicker();
    }
}