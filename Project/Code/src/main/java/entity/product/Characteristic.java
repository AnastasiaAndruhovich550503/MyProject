package entity.product;

public class Characteristic {
    private int year;
    private int volume;
    private String measure;
    private int quantity;
    private String address;
    private String description;

    public Characteristic(int year, int volume, String measure, int quantity, String address) {
        this.year = year;
        this.volume = volume;
        this.measure = measure;
        this.quantity = quantity;
        this.address = address;
    }

    public Characteristic(int year, int volume, String measure, int quantity, String address, String description) {
        this.year = year;
        this.volume = volume;
        this.measure = measure;
        this.quantity = quantity;
        this.address = address;
        this.description = description;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

        if (getYear() != that.getYear()) return false;
        if (getVolume() != that.getVolume()) return false;
        if (getQuantity() != that.getQuantity()) return false;
        if (!getMeasure().equals(that.getMeasure())) return false;
        if (!getAddress().equals(that.getAddress())) return false;
        return getDescription().equals(that.getDescription());
    }

    @Override
    public int hashCode() {
        int result = getYear();
        result = 31 * result + getVolume();
        result = 31 * result + getMeasure().hashCode();
        result = 31 * result + getQuantity();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getDescription().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Characteristic{" +
                "year=" + year +
                ", volume=" + volume +
                ", measure='" + measure + '\'' +
                ", quantity=" + quantity +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
