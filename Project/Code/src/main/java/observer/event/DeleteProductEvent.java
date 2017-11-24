package observer.event;

import entity.product.Product;

import java.util.EventObject;

public class DeleteProductEvent extends EventObject{
    public DeleteProductEvent(Product product) {
        super(product);
    }

    @Override
    public Product getSource() {
        return (Product)super.getSource();
    }
}
