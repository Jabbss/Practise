package org.college.practice2.task9;

import java.util.List;

public class DataBAccessProxy implements DBAccessProxy {
    private DBAccess dbAccess;

    public DataBAccessProxy(String database) {
        this.dbAccess = new DBAccess(database);
    }

    @Override
    public List<String> executeQueryWithMetrics(String query) {
        long startTime = System.nanoTime();
        List<String> result = dbAccess.executeQuery(query);
        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
        return result;
    }

    @Override
    public boolean executeUpdateWithMetrics(String query) {
        long startTime = System.nanoTime();
        boolean result = dbAccess.executeUpdate(query);
        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
        return result;
    }
}
