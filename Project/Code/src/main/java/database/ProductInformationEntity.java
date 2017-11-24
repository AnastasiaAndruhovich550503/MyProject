package database;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "product_information", schema = "cheerful_garden", catalog = "")
public class ProductInformationEntity {
    private int productInfoId;
    private int productId;
    private Integer year;
    private Integer volumeId;
    private ProductsEntity productsByProductId;
    private VolumeEntity volumeByVolumeId;
    private Collection<ProductLocationEntity> productLocationsByProductInfoId;

    @Id
    @Column(name = "product_info_id", nullable = false)
    public int getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(int productInfoId) {
        this.productInfoId = productInfoId;
    }

    @Basic
    @Column(name = "product_id", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "year", nullable = true)
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "volume_id", nullable = true)
    public Integer getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductInformationEntity that = (ProductInformationEntity) o;

        if (productInfoId != that.productInfoId) return false;
        if (productId != that.productId) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (volumeId != null ? !volumeId.equals(that.volumeId) : that.volumeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productInfoId;
        result = 31 * result + productId;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (volumeId != null ? volumeId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", nullable = false)
    public ProductsEntity getProductsByProductId() {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId) {
        this.productsByProductId = productsByProductId;
    }

    @ManyToOne
    @JoinColumn(name = "volume_id", referencedColumnName = "volume_id")
    public VolumeEntity getVolumeByVolumeId() {
        return volumeByVolumeId;
    }

    public void setVolumeByVolumeId(VolumeEntity volumeByVolumeId) {
        this.volumeByVolumeId = volumeByVolumeId;
    }

    @OneToMany(mappedBy = "productInformationByProductInfoId")
    public Collection<ProductLocationEntity> getProductLocationsByProductInfoId() {
        return productLocationsByProductInfoId;
    }

    public void setProductLocationsByProductInfoId(Collection<ProductLocationEntity> productLocationsByProductInfoId) {
        this.productLocationsByProductInfoId = productLocationsByProductInfoId;
    }
}
