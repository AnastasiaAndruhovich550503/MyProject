package entity.product;

public class Characteristic {
    private int id;
    private int year;
    private int volume;
    private int storageId;
    private String description;

    public Characteristic(int id, int year, int volume, String measure, int quantity, int storageId) {
        this.id = id;
        this.year = year;
        this.volume = volume;
        this.measure = measure;
        this.quantity = quantity;
        this.storageId = storageId;
    }

    public Characteristic(int id, int year, int volume, String measure, int quantity, int storageId, String description) {
        this.id = id;
        this.year = year;
        this.volume = volume;
        this.measure = measure;
        this.quantity = quantity;
        this.storageId = storageId;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Characteristic)) return false;

        Characteristic that = (Characteristic) o;

        if (getId() != that.getId()) return false;
        if (getYear() != that.getYear()) return false;
        if (getVolume() != that.getVolume()) return false;
        if (getQuantity() != that.getQuantity()) return false;
        if (getStorageId() != that.getStorageId()) return false;
        if (!getMeasure().equals(that.getMeasure())) return false;
        return getDescription().equals(that.getDescription());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getYear();
        result = 31 * result + getVolume();
        result = 31 * result + getMeasure().hashCode();
        result = 31 * result + getQuantity();
        result = 31 * result + getStorageId();
        result = 31 * result + getDescription().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Characteristic{" +
                "id=" + id +
                ", year=" + year +
                ", volume=" + volume +
                ", measure='" + measure + '\'' +
                ", quantity=" + quantity +
                ", storageId=" + storageId +
                ", description='" + description + '\'' +
                '}';
    }
}
