package MilkSystem;

import java.util.List;

public class StoreSales {
    private List<Order> orders;
    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Order getOrder(int index) {
        return orders.get(index);
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

}
