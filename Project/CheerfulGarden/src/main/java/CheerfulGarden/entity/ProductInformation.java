package CheerfulGarden.entity;

public class ProductInformation {
    private int productInfoId;
    private int year;
    private int quantity;
    private String description;

    public ProductInformation() {

    }

    public ProductInformation(int year, int quantity, String description) {
        this.year = year;
        this.quantity = quantity;
        this.description = description;
    }

    public int getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(int productInfoId) {
        this.productInfoId = productInfoId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
