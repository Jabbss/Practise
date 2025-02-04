package org.college.practice2.task10.task10_1;

public class CodeAdapter implements PortfolioStorage {
    @Override
    public void savePortfolio(String userId, String data) {
        System.out.println("Saving code for user: " + userId);
    }

    @Override
    public String loadPortfolio(String userId) {
        return "Load code to Portfolio for user: " + userId;
    }
}
