package FileManagementSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 管理文件夹和文件的文件系统。
 */
public class FileSystem {
    private List<FolderItem> folderItemList;

    /**
     * 构造一个FileSystem对象。
     */
    public FileSystem() {
        this.folderItemList = new ArrayList<>();
    }

    /**
     * 从文件中加载文件夹项并将其添加到文件系统中。
     *
     * @param fileName 包含文件夹项数据的文件的名称
     */
    public void loadFolderItemFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("_");
                if (parts.length > 1) {
                    String itemType = parts[0];
                    String folderPath = parts[1];
                    String itemName = parts[2];
                    String ownerId = parts[3];
                    String ownerName = parts[4];

                    Owner owner = new Owner(ownerId, ownerName);

                    if (itemType.equals("Folder")) {
                        // 构造Folder对象
                        Folder folder = new Folder(itemName, owner);
                        folder.addFolderItem(new FolderItem(itemName, owner));

                        if (!folderPath.equals("/")) {
                            // 处理非根目录的文件夹
                            String[] pathParts = folderPath.split("/");
                            Folder currentFolder = folder;

                            for (String folderNamePart : pathParts) {
                                if (!folderNamePart.isEmpty()) {
                                    FolderItem subFolder = currentFolder.getFolderItem(folderNamePart);

                                    if (subFolder == null) {
                                        // 如果文件夹不存在，则创建新的文件夹
                                        Folder newFolder = new Folder(folderNamePart, owner);
                                        currentFolder.addFolderItem(newFolder);
                                        currentFolder = newFolder;
                                    } else if (subFolder instanceof Folder) {
                                        // 如果文件夹已存在，则继续使用已有的文件夹
                                        currentFolder = (Folder) subFolder;
                                    } else {
                                        // 处理路径冲突的情况
                                        System.err.println("Error: Conflict in folder hierarchy.");
                                    }
                                }
                            }

                            currentFolder.addFolderItem(folder);
                        } else {
                            // 处理根目录的文件夹
                            folderItemList.add(folder);
                        }
                    } else if (itemType.equals("File") && parts.length == 6) {
                        // 处理文件数据
                        String extension = parts[5];
                        File file = new File(itemName, owner, extension);

                        if (!folderPath.equals("/")) {
                            // 处理非根目录的文件
                            String[] pathParts = folderPath.split("/");
                            Folder currentFolder = null;

                            for (String folderNamePart : pathParts) {
                                if (!folderNamePart.isEmpty()) {
                                    FolderItem subFolder = null;
                                }
                            }

                        } else {
                            // 处理根目录的文件
                            folderItemList.add(file);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayFolderItemInfo() {
        for (FolderItem item : folderItemList) {
            if (item instanceof File) {
                System.out.println(item.getName() + " File " + item.getOwner().getName());
            } else if (item instanceof Folder) {
                System.out.println(item.getName() + " Folder " + item.getOwner().getName());
                displayFolder((Folder) item);
            }
        }
    }

    private void displayFolder(Folder folder) {
        for (FolderItem item : folder) {
            if (item instanceof File) {
                System.out.println(item.getName() + " File " + item.getOwner().getName());
            } else if (item instanceof Folder) {
                System.out.println(item.getName() + " Folder " + item.getOwner().getName());
                displayFolder((Folder) item);
            }
        }
    }


    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        fileSystem.loadFolderItemFromFile("folderItem.dat");
        fileSystem.displayFolderItemInfo();
    }
}
