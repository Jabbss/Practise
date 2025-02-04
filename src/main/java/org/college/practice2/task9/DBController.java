package org.college.practice2.task9;

import java.util.List;

public class DBController {
    private DBAccessProxy dbProxy;

    public DBController(String database) {
        this.dbProxy = new DataBAccessProxy(database);
    }

    public void executeQuery(String query) {
        List<String> result = dbProxy.executeQueryWithMetrics(query);
        System.out.println("Query Result: " + result);
    }

    public void executeUpdate(String query) {
        boolean success = dbProxy.executeUpdateWithMetrics(query);
        System.out.println("Update success: " + success);
    }
}
