package org.college.practice2.task9.task9_1;

import java.util.List;

public interface PortfolioAccessProxy {
    List<String> getPortfolioDataWithMetrics(String userId);
    boolean updatePortfolioWithMetrics(String userId, String data);
}