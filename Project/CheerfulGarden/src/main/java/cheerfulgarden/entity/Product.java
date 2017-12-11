package cheerfulgarden.entity;

import java.util.HashSet;
import java.util.Set;

public class Product {
    private int productId;
    private String name;
    private String sectionName;
    private Set product_information = new HashSet();

    public Product() {

    }

    public Product(String name, String sectionName, Set product_information) {
        this.name = name;
        this.sectionName = sectionName;
        this.product_information = product_information;
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

    public Set getProduct_information() {
        return product_information;
    }

    public void setProduct_information(Set product_information) {
        this.product_information = product_information;
    }
}
