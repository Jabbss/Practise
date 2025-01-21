package org.college.practice2.task5;

public class Main {
    public static void main(String[] args) {
        WindowManager windowManager = WindowManager.getInstance();
        WindowManager mainWindow = windowManager;

        VerticalLayout layout = new VerticalLayout("mainLayout", 800, 600);
        mainWindow.addComponent(layout);

        Button button1 = new Button("button1", "Click Me", "image1.png");
        Button button2 = new Button("button2", "Submit", "image2.png");
        layout.addComponent(button1);
        layout.addComponent(button2);

        windowManager.draw();
    }
}
