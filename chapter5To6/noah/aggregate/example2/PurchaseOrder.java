public class PurchaseOrder {
    private final List<PurchaseOrderLineItem> orderLines;
    private Money totalCost;

    public Order(List<PurchaseOrderLineItem> orderLines) {
        checkNotNull(orderLines);
        if (orderLines.isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one order line item");
        }
        this.orderLines = new ArrayList<>(orderLines);
        totalCost = calculateTotalCost();
    }

    public void addLineItem(PurchaseOrderLineItem orderLine) {
        checkNotNull(orderLine);
        orderLines.add(orderLine);
        totalCost = totalCost.plus(orderLine.cost());
    }

    public List<PurchaseOrderLineItem> getOrderLines() {
        return new ArrayList<>(orderLines);
    }

    public void removeLineItem(int line) {
        PurchaseOrderLineItem removedLine = orderLines.remove(line);
        totalCost = totalCost.minus(removedLine.cost());
    }

    public Money totalCost() {
        return totalCost;
    }

    private Money calculateTotalCost() {
        return orderLines.stream()
                .map(PurchaseOrderLineItem::cost)
                .reduce(Money::plus)
                .get();
    }

    private static void checkNotNull(Object par) {
        if (par == null) {
            throw new NullPointerException("Parameter cannot be null");
        }
    }
}