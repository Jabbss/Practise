package org.college.practice2.task9;

public class Main {
    public static void main(String[] args) {
        DBController controller = new DBController("MyDatabase");
        controller.executeQuery("SELECT * FROM users");
        controller.executeUpdate("SET name = 'John' WHERE id = 1");
    }
}
