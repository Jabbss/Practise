package org.college.practice2.task10.task10_1;

public class FileStorageAdapter implements PortfolioStorage {
    @Override
    public void savePortfolio(String userId, String data) {
        System.out.println("Saving portfolio to File Storage for user: " + userId);
    }

    @Override
    public String loadPortfolio(String userId) {
        return "Portfolio from File Storage for user: " + userId;
    }
}