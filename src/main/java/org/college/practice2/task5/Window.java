package org.college.practice2.task5;

public class Window extends WindowComponent {
    private String title;
    private int width;
    private int height;

    public Window(String name, String title, int width, int height) {
        this.name = name;
        this.title = title;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Window: " + title + " [" + width + "x" + height + "]");
        for (WindowComponent component : nestedComponents.values()) {
            component.draw();
        }
    }
}