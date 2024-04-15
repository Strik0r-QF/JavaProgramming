package cn.edu.nwpu.software.strik0r.root;

/**
 * 使用懒汉式单例模式的 {@code Strik0r} 类.
 * */
public class Strik0r {
    private static Strik0r INSTANCE; // 唯一实例
    private Strik0r() {}             // 唯一实例的构造函数
    /**
     * 获取唯一实例 {@code Strik0r} 的方法.
     * @return {@code Strik0r} 实例
     * */
    public static Strik0r getInstance() {
        // 仅当唯一实例被访问时才创建唯一实例
        if (INSTANCE == null) {
            INSTANCE = new Strik0r();
        }
        return INSTANCE;
    }
}
