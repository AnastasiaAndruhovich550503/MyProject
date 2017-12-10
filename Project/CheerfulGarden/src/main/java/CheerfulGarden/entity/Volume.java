package CheerfulGarden.entity;

public class Volume {
    private int volumeId;
    private int volume;
    private String measure;

    public Volume() {

    }

    public Volume(int volume, String measure) {
        this.volume = volume;
        this.measure = measure;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(int volumeId) {
        this.volumeId = volumeId;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }
}
