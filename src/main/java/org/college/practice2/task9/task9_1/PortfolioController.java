package org.college.practice2.task9.task9_1;

import java.util.List;

public class PortfolioController {
    private PortfolioAccessProxy portfolioProxy;

    public PortfolioController(String database) {
        this.portfolioProxy = new PortfolioAccessProxyImpl(database);
    }

    public void getPortfolio(String userId) {
        List<String> result = portfolioProxy.getPortfolioDataWithMetrics(userId);
        System.out.println("Portfolio Data: " + result);
    }

    public void updatePortfolio(String userId, String data) {
        boolean success = portfolioProxy.updatePortfolioWithMetrics(userId, data);
        System.out.println("Update success: " + success);
    }
}
