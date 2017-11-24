package observer.event;

import entity.product.Characteristic;
import entity.product.Product;

import java.util.EventObject;

public class RefactorProductEvent extends EventObject {
    private Characteristic newCharacteristic;

    public RefactorProductEvent(Product product, Characteristic newCharacterisic) {
        super(product);
        this.newCharacteristic = newCharacterisic;
    }

    public Characteristic getNewCharacteristic() {
        return newCharacteristic;
    }

    @Override
    public Product getSource() {
        return (Product)super.getSource();
    }
}
