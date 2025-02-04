package org.college.practice2.task10.task10_1;

public interface PortfolioStorage {
    void savePortfolio(String userId, String data);
    String loadPortfolio(String userId);
}