package Vehicle;

public class Vehicle {
    protected String brand;

    protected int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printDetails() {
        System.out.println("品牌: "+this.brand+", 速度: "+this.speed+".");
    }
}
