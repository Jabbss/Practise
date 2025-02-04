package org.college.practice2.task10;

public interface DatabaseAdapter {
    void executeQuery(String query);
    String fetchResults();
}
