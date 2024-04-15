package cn.itbaima.JavaSE.strik0r.oop;

public class PersonTest {
    public static void main(String[] args) {
        // 创建一个 Person 对象
        Person p = new Person(); // 使用 new 关键字创建一个对象
        p.name = "Strik0r";
        p.gender = "武装直升机";
        p.age = 21;
        System.out.println(p.age); // 21

        // 对于引用类型来说, 在赋值时传递的是对对象的引用
        Person q = p; // q 与 p 实际上是同一个 Person 类对象的引用
        q.age = 22;
        System.out.println(p.age); // 22

        Person r = new Person(); // r 引用的是另一个 Person 类对象
        r.name = "Strik1r";
        r.age = 21;
        r.gender = "沃尔玛购物袋";
        System.out.println(r.age); // 21

        // 对 r 的修改对 p 和 q 没有影响
        System.out.println(p.age); // 22
    }
}
