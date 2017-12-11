package CheerfulGarden.entity;

import java.util.HashSet;
import java.util.Set;

public class Storage {
    private int storageId;
    private String name;
    private int parentId;
    private Set product_information = new HashSet();

    public Storage() {

    }

    public Storage(String name, int parentId, Set product_information) {
        this.name = name;
        this.parentId = parentId;
        this.product_information = product_information;
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

    public Set getProduct_information() {
        return product_information;
    }

    public void setProduct_information(Set product_information) {
        this.product_information = product_information;
    }
}
