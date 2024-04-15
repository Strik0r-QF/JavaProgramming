package Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bicycle();

        vehicle1.setBrand("Toyota");
        vehicle1.setSpeed(100);

        vehicle2.setBrand("Giant");

        vehicle1.printDetails(); // 这里将调用Car类的printDetails方法
        vehicle2.printDetails(); // 这里将调用Bicycle类的printDetails方法
    }
}
