package database;

import javax.persistence.*;

@Entity
@Table(name = "product_location", schema = "cheerful_garden", catalog = "")
public class ProductLocationEntity {
    private int productInfoId;
    private Integer quantity;
    private int storageId;
    private String description;
    private ProductInformationEntity productInformationByProductInfoId;
    private StoragesEntity storagesByStorageId;

    @Basic
    @Column(name = "product_info_id", nullable = false)
    public int getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(int productInfoId) {
        this.productInfoId = productInfoId;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "storage_id", nullable = false)
    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductLocationEntity that = (ProductLocationEntity) o;

        if (productInfoId != that.productInfoId) return false;
        if (storageId != that.storageId) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productInfoId;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + storageId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "product_info_id", referencedColumnName = "product_info_id", nullable = false)
    public ProductInformationEntity getProductInformationByProductInfoId() {
        return productInformationByProductInfoId;
    }

    public void setProductInformationByProductInfoId(ProductInformationEntity productInformationByProductInfoId) {
        this.productInformationByProductInfoId = productInformationByProductInfoId;
    }

    @ManyToOne
    @JoinColumn(name = "storage_id", referencedColumnName = "storage_id", nullable = false)
    public StoragesEntity getStoragesByStorageId() {
        return storagesByStorageId;
    }

    public void setStoragesByStorageId(StoragesEntity storagesByStorageId) {
        this.storagesByStorageId = storagesByStorageId;
    }
}
