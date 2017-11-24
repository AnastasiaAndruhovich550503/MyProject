package database;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "volume", schema = "cheerful_garden", catalog = "")
public class VolumeEntity {
    private int volumeId;
    private int volume;
    private String measure;
    private Collection<ProductInformationEntity> productInformationsByVolumeId;

    @Id
    @Column(name = "volume_id", nullable = false)
    public int getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(int volumeId) {
        this.volumeId = volumeId;
    }

    @Basic
    @Column(name = "volume", nullable = false)
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "measure", nullable = false, length = 45)
    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeEntity that = (VolumeEntity) o;

        if (volumeId != that.volumeId) return false;
        if (volume != that.volume) return false;
        if (measure != null ? !measure.equals(that.measure) : that.measure != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = volumeId;
        result = 31 * result + volume;
        result = 31 * result + (measure != null ? measure.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "volumeByVolumeId")
    public Collection<ProductInformationEntity> getProductInformationsByVolumeId() {
        return productInformationsByVolumeId;
    }

    public void setProductInformationsByVolumeId(Collection<ProductInformationEntity> productInformationsByVolumeId) {
        this.productInformationsByVolumeId = productInformationsByVolumeId;
    }
}
