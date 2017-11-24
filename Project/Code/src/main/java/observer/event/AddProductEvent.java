package observer.event;

import entity.product.Product;

import java.util.EventObject;

public class AddProductEvent extends EventObject {
    public AddProductEvent(Product product) {
        super(product);
    }

    @Override
    public Product getSource() {
        return (Product)super.getSource();
    }
}
