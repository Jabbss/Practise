package org.college.practice2.task9.task9_1;

import java.util.List;

public class PortfolioAccess {
    private String database;

    public PortfolioAccess(String database) {
        this.database = database;
    }

    public List<String> getPortfolioData(String userId) {
        System.out.println("Fetching portfolio data for user: " + userId);
        return List.of("Project", "Certificate");
    }

    public boolean updatePortfolio(String userId, String data) {
        System.out.println("Updating portfolio for user: " + userId + " with data: " + data);
        return true;
    }
}