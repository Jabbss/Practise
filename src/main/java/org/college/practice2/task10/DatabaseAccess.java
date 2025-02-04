package org.college.practice2.task10;

public class DatabaseAccess {
    private DatabaseAdapter adapter;

    public DatabaseAccess(DatabaseAdapter adapter) {
        this.adapter = adapter;
    }

    public void execute(String query) {
        adapter.executeQuery(query);
    }

    public void printResults() {
        System.out.println(adapter.fetchResults());
    }
}