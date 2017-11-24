package entity.storage;

import entity.product.Product;
import type.ComponentType;

import java.util.ArrayList;

public class ProductComponent implements Component {
    private ComponentType componentType;
    private ArrayList<Product> productList;

    public ProductComponent(ComponentType componentType) {
        this.componentType = componentType;
        productList = new ArrayList<Product>();
    }

    public ComponentType getComponentType() {
        return componentType;
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

    public int countItem() {
        return 1;
    }
}
