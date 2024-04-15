package FileManagementSystem;

/**
 * 文件或文件夹的所有者
 */
public class Owner {
    private String id;
    private String name;

    /**
     * 构造一个Owner对象。
     *
     * @param id   所有者的ID
     * @param name 所有者的名称
     */
    public Owner(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 获取所有者的ID。
     *
     * @return 所有者的ID
     */
    public String getId() {
        return id;
    }

    /**
     * 获取所有者的名称。
     *
     * @return 所有者的名称
     */
    public String getName() {
        return name;
    }
}
