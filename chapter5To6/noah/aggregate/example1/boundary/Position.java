// 동일한 바퀴에 대해서 시간대가 겹치면 안된다. VO
public class Position {

    private int mileage;
    private LocalDateTime ldt;

    protected Position() {
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Position position = (Position) object;
        return mileage == position.mileage && java.util.Objects.equals(ldt, position.ldt);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), mileage, ldt);
    }
}