package MilkSystem;

import java.util.List;

public class ProductCatalog {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProdoct(Product product) {
        products.remove(product);
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public Product getProduct(String code) {
        for (Product product : products) {
            if (product.getCode().equals(code)) {
                return product;
            }
        }
        return null;
    }

    public int getNumberOfProducts() {
        return products.size();
    }
}
