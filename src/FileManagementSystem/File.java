package FileManagementSystem;

import java.util.Date;

/**
 * 文件管理系统中的文件。
 */
public class File extends FolderItem {
    private String extension;

    /**
     * 构造一个File对象。
     *
     * @param name      文件的名称
     * @param owner     文件的所有者
     * @param extension 文件的扩展名
     */
    public File(String name, Owner owner, String extension) {
        super(name,owner);
        this.extension = extension;
    }

    /**
     * 获取文件的扩展名。
     *
     * @return 文件的扩展名
     */
    public String getExtension() {
        return this.extension;
    }
}