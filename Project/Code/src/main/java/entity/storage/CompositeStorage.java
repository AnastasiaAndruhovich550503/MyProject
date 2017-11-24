package entity.storage;

import type.ComponentType;

import java.util.ArrayList;

public class CompositeStorage implements Component {
    private ComponentType componentType;
    private ArrayList<Component> components;

    public CompositeStorage(ComponentType componentType) {
        this.componentType = componentType;
        components = new ArrayList<Component>();
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public int countItem() {
        int quantity = 0;
        for (Component component : components) {
            quantity += component.countItem();
        }

        return quantity;
    }


}
