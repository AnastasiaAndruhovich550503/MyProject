package entity;

import entity.product.Product;

import java.util.ArrayList;

public class Section {
    private String name;
    private ArrayList<Product> productList;

    public Section(String name) {
        this.name = name;
        productList = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product getProduct(int index) {
        return productList.get(index);
    }

    public void remove(Product product) {
        productList.remove(product);
    }
}
