package org.college.practice2.task9.task9_1;

import java.util.List;

public class PortfolioAccessProxyImpl implements PortfolioAccessProxy {
    private PortfolioAccess portfolioAccess;

    public PortfolioAccessProxyImpl(String database) {
        this.portfolioAccess = new PortfolioAccess(database);
    }

    @Override
    public List<String> getPortfolioDataWithMetrics(String userId) {
        long startTime = System.nanoTime();
        List<String> result = portfolioAccess.getPortfolioData(userId);
        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
        return result;
    }

    @Override
    public boolean updatePortfolioWithMetrics(String userId, String data) {
        long startTime = System.nanoTime();
        boolean result = portfolioAccess.updatePortfolio(userId, data);
        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
        return result;
    }
}
