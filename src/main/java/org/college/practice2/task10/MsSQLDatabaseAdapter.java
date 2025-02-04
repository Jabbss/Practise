package org.college.practice2.task10;

public class MsSQLDatabaseAdapter implements DatabaseAdapter {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MS SQL query: " + query);
    }

    @Override
    public String fetchResults() {
        return "MS SQL Results";
    }
}
