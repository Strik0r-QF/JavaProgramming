package MilkSystem;

import java.util.Date;

public class Jelly extends Product {
    private String flavor;

    public Jelly(String code, String description, double price, Date productionDate, String shelfLife, String flavor) {
        super(code, description, price, productionDate, shelfLife);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
