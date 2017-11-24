package entity.storage;

import entity.product.Product;
import type.ComponentType;

import java.util.ArrayList;

public class ProductComponent implements Component {
    private ComponentType componentType;
    private ArrayList<Product> products;

    public ProductComponent(ComponentType componentType) {
        this.componentType = componentType;
        products = new ArrayList<Product>();
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public int countItem() {
        return 1;
    }
}
