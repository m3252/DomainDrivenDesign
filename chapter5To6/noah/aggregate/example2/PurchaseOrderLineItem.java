public class PurchaseOrderLineItem {
    private final Part part;
    private final int quantity;

    public PurchaseOrderLineItem(Part part, int quantity) {
        super();
        this.part = part;
        this.quantity = quantity;
    }

    Money cost() {
        return product.getPrice()
                .multipliedBy(quantity);
    }

    Part getPart() {
        return part;
    }

    int getQuantity() {
        return quantity;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        PurchaseOrderLineItem that = (PurchaseOrderLineItem) object;
        return quantity == that.quantity && java.util.Objects.equals(part, that.part);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), part, quantity);
    }
}