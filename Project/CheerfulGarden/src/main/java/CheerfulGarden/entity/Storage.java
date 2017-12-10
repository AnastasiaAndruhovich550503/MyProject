package CheerfulGarden.entity;

public class Storage {
    private int storageId;
    private String name;
    private int parentId;

    public Storage() {

    }

    public Storage(String name, int parentId) {
        this.name = name;
        this.parentId = parentId;
    }

    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
