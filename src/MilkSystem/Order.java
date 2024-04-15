package MilkSystem;

import java.util.List;

public class Order {
    private List<SaleItem> saleItems;

    public void addSaleItem(SaleItem saleItem) {
        saleItems.add(saleItem);
    }

    public void removeSaleItem(SaleItem saleItem) {
        saleItems.remove(saleItem);
    }

    public SaleItem getSaleItem(Product product) {
        for (SaleItem saleItem : saleItems) {
            if (saleItem.getProduct().equals(product)) {
                return saleItem;
            }
        }
        return null;
    }

    public SaleItem getSaleItem(int index) {
        return saleItems.get(index);
    }

    public double getTotalCost() {
        double sum = 0;
        for (SaleItem saleItem : saleItems) {
            sum = sum + saleItem.getValue()*saleItem.getQuantity();
        }
        return sum;
    }
}
