package entity.product;

import java.util.ArrayList;

public class Product {
    private String name;
    private ArrayList<Characteristic> characteristics;

    public Product(String name) {
        this.name = name;
        characteristics = new ArrayList<Characteristic>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Characteristic getCharacteristic(int index) {
        return characteristics.get(index);
    }

    public void addCharacteristic(Characteristic characteristic) {
        int characteristicPosition = characteristics.indexOf(characteristic);
        if (characteristicPosition == -1) {
            characteristics.add(characteristic);
        }
        else {
            int newQuantity = characteristics.get(characteristicPosition).getQuantity() + characteristic.getQuantity();
            characteristics.get(characteristicPosition).setQuantity(newQuantity);
        }
    }
}
