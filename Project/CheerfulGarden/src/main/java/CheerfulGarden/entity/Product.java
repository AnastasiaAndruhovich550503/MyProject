package CheerfulGarden.entity;

public class Product {
    private int productId;
    private String name;
    private String sectionName;

    public Product() {

    }

    public Product(String name, String sectionName) {
        this.name = name;
        this.sectionName = sectionName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
