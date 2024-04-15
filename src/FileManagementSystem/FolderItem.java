package FileManagementSystem;

import java.util.Date;

/**
 * 文件夹中的项，可以是文件（File）或文件夹（Folder）。
 */
public class FolderItem {
    private String name;
    private Owner owner;

    /**
     * 构造一个FolderItem对象。
     *
     * @param name  文件夹项的名称
     * @param owner 文件夹项的所有者
     */
    public FolderItem(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }


    /**
     * 获取文件夹项的名称。
     *
     * @return 文件夹项的名称
     */
    public String getName() {
        return name;
    }

    /**
     * 获取文件夹项的所有者。
     *
     * @return 文件夹项的所有者
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * 根据名称检查两个文件夹项是否相等。
     *
     * @param o 要比较的对象
     * @return 如果对象相等，则返回true，否则返回false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof FolderItem) {
            return this.getName().equals(((FolderItem) o).getName());
        }
        return false;
    }
}