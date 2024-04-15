package npuInfo;

public class NpuInfo {
    private String name;
    private String address;
    private String telephone;

    // 私有构造方法，防止外部创建实例
    private NpuInfo() {
        name = "西北工业大学";
        address = "西安市友谊西路127号";
        telephone = "029-88494433";
    }

    // 内部类实现延迟加载单例
    private static class SingletonHolder {
        private static final NpuInfo INSTANCE = new NpuInfo();
    }

    // 公有静态方法获取唯一实例
    public static NpuInfo getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 提供访问成员变量的方法
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }
}
