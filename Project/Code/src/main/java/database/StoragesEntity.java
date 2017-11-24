package database;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "storages", schema = "cheerful_garden", catalog = "")
public class StoragesEntity {
    private int storageId;
    private String name;
    private int parentId;
    private Collection<ProductLocationEntity> productLocationsByStorageId;

    @Id
    @Column(name = "storage_id", nullable = false)
    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "parent_id", nullable = false)
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoragesEntity that = (StoragesEntity) o;

        if (storageId != that.storageId) return false;
        if (parentId != that.parentId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = storageId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + parentId;
        return result;
    }

    @OneToMany(mappedBy = "storagesByStorageId")
    public Collection<ProductLocationEntity> getProductLocationsByStorageId() {
        return productLocationsByStorageId;
    }

    public void setProductLocationsByStorageId(Collection<ProductLocationEntity> productLocationsByStorageId) {
        this.productLocationsByStorageId = productLocationsByStorageId;
    }
}
