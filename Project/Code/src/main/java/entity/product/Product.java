package entity.product;

import java.util.ArrayList;

public class Product {
    private String name;
    private ArrayList<Characteristic> characteristicList;

    public Product(String name) {
        this.name = name;
        characteristicList = new ArrayList<Characteristic>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Characteristic getCharacteristic(int index) {
        return characteristicList.get(index);
    }

    public void addCharacteristic(Characteristic characteristic) {
        int characteristicPosition = characteristicList.indexOf(characteristic);
        if (characteristicPosition == -1) {
            characteristicList.add(characteristic);
        }
        else {
            int newQuantity = characteristicList.get(characteristicPosition).getQuantity() + characteristic.getQuantity();
            characteristicList.get(characteristicPosition).setQuantity(newQuantity);
        }
    }
}
