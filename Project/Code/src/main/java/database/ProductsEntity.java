package database;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "products", schema = "cheerful_garden", catalog = "")
public class ProductsEntity {
    private int productId;
    private String name;
    private String sectionName;
    private Collection<ProductInformationEntity> productInformationsByProductId;

    @Id
    @Column(name = "product_id", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
    @Column(name = "section_name", nullable = false, length = 45)
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity that = (ProductsEntity) o;

        if (productId != that.productId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sectionName != null ? !sectionName.equals(that.sectionName) : that.sectionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sectionName != null ? sectionName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "productsByProductId")
    public Collection<ProductInformationEntity> getProductInformationsByProductId() {
        return productInformationsByProductId;
    }

    public void setProductInformationsByProductId(Collection<ProductInformationEntity> productInformationsByProductId) {
        this.productInformationsByProductId = productInformationsByProductId;
    }
}
