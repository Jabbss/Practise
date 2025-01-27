package org.college.practice2.task5;

public class WindowManager extends WindowComponent {
    private Window window;

    private static WindowManager instance;

    private WindowManager() {
        this.window = new Window("mainWindow", "Main Application Window", 800, 600);
    }

    public static WindowManager getInstance() {
        if (instance == null) {
            instance = new WindowManager();
        }
        return instance;
    }

    @Override
    public void draw() {
        System.out.println("Initializing window drawing...");
        window.draw();
    }
}
