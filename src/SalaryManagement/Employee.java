package SalaryManagement;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private static int nextId = 1;
    // instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    // constructor
    public Employee(String n, double s, int year, int month, int day){
        name = Objects.requireNonNull(n, "The name cannot be null.");
        salary = s;
        hireDay = LocalDate.of(year,month,day);
        id = advanceId();
    }

    // methods
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary * (byPercent / 100);
        this.salary = this.salary + raise;
    }
    // 用 this 关键字指示隐式参数可以讲实例字段与局部变量区分开

    public int getId(){
        return id;
    }

    public static int advanceId(){
        int r = nextId;
        nextId++;
        return r;
    }

    public static void main(String[] args){
        var e = new Employee("Harry", 50000, 1989, 10, 1);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}
