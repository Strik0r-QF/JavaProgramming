package MilkSystem;

public class SaleItem {
    private int quantity;
    private Product product;

    public SaleItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getValue() {
        return this.getProduct().getPrice() * this.getQuantity();
    }
}
