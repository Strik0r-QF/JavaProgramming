package FileManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder extends FolderItem implements Iterable<FolderItem> {
    private List<FolderItem> folderItemList;

    public Folder(String name, Owner owner) {
        super(name, owner);
        this.folderItemList = new ArrayList<>();
    }

    public void addFolderItem(FolderItem folderItem) {
        if (folderItemList.contains(folderItem)) {
            return;
        }

        folderItemList.add(folderItem);

        if (folderItem instanceof Folder) {
            Folder subFolder = (Folder) folderItem;
            for (FolderItem subItem : subFolder) {
                addFolderItem(subItem);
            }
        }
    }

    public FolderItem getFolderItem(String name) {
        for (FolderItem item : folderItemList) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public int getNumberOfFolderItems() {
        int count = folderItemList.size();
        for (FolderItem item : folderItemList) {
            if (item instanceof Folder) {
                count += ((Folder) item).getNumberOfFolderItems();
            }
        }
        return count;
    }

    @Override
    public Iterator<FolderItem> iterator() {
        return folderItemList.iterator();
    }
}
