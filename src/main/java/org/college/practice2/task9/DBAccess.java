package org.college.practice2.task9;

import java.util.List;

public class DBAccess {
    private String database;

    public DBAccess(String database) {
        this.database = database;
    }

    public List<String> executeQuery(String query) {
        System.out.println("Executing query: " + query);
        return List.of("Result");
    }

    public boolean executeUpdate(String query) {
        System.out.println("Executing update: " + query);
        return true;
    }
}
