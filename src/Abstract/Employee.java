package Abstract;
public abstract class Employee {
    private String name;
    private String id;
    private int salary;
    public static void main(String[] args) {
        CommonEmployee commonEmployee = new CommonEmployee(
                "张三",
                "2023000001",
                1000);

        Manager manager = new Manager(
                "李四",
                "2023000002",
                2000,
                1000);

        commonEmployee.work();
        manager.work();
    }
    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Employee() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public abstract void work();
}
class Manager extends Employee {
    private int bonus;
    public Manager(String name, String id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    public Manager() {}
    public void work() {
        System.out.println("经理"+this.getName()+"正在工作中");
    }
}
class CommonEmployee extends Employee {
    public CommonEmployee(String name, String id, int salary) {
        super(name, id, salary);
    }
    public CommonEmployee() {
    }
    public void work() {
        System.out.println("普通员工"+this.getName()+"正在工作中");
    }
}