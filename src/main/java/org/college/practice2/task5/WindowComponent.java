package org.college.practice2.task5;

import java.util.HashMap;

public abstract class WindowComponent {
    protected String name;
    protected HashMap<String, WindowComponent> nestedComponents = new HashMap<>();

    public void draw() {
    }

    public void addComponent(WindowComponent component) {
        nestedComponents.put(component.name, component);
    }

    public void removeComponent(String name) {
        nestedComponents.remove(name);
    }
}