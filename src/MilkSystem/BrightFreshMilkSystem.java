package MilkSystem;

public class BrightFreshMilkSystem {
    private StoreSales storeSales;
    private ProductCatalog productCatalog;
    private Order currentOrder;

    // 构造函数
    public BrightFreshMilkSystem() {}
    public void displayCatalog() {}
    public void displayProduct(String productCode) {}
    public void displayOrder() {}
    public void displaySales() {}

    public void addProduct(Product product) {
        productCatalog.addProduct(product);
    }

    public void removeProduct(String productCode) {
        Product product = productCatalog.getProduct(productCode);
        if (product != null) {
            productCatalog.removeProdoct(product);
        } else {
            // 产品不存在
        }
    }

    public void addOrder(Order order) {
        storeSales.addOrder(order);
    }


}
