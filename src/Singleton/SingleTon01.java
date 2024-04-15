package Singleton;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.getInstance();
        System.out.println(gf.toString());
    }
}

// 有一个类, GirlFriend
// 只能有一个女朋友

class GirlFriend {
    private String name;

    // 为了能够在静态方法中返回 gf 对象, 需要将其设置为 static
    private static GirlFriend gf = new GirlFriend("小红");

    // 保证只能创建一个对象
    // 1. 将构造器私有化;
    // 2. 在类的内部直接创建
    // 3. 提供一个公共的 static 方法返回 gf 对象
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}