package cheerfulgarden.entity;

import java.util.HashSet;
import java.util.Set;

public class Volume {
    private int volumeId;
    private int volume;
    private int degreeTen;
    private Set product_information = new HashSet();

    public Volume() {

    }

    public Volume(int volume, int degreeTen, Set product_information) {
        this.volume = volume;
        this.degreeTen = degreeTen;
        this.product_information = product_information;
    }

    public int getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(int volumeId) {
        this.volumeId = volumeId;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDegreeTen() {
        return degreeTen;
    }

    public void setDegreeTen(int degreeTen) {
        this.degreeTen = degreeTen;
    }

    public Set getProduct_information() {
        return product_information;
    }

    public void setProduct_information(Set product_information) {
        this.product_information = product_information;
    }
}
