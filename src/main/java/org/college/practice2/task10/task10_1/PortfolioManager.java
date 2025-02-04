package org.college.practice2.task10.task10_1;

public class PortfolioManager {
    private PortfolioStorage storage;

    public PortfolioManager(PortfolioStorage storage) {
        this.storage = storage;
    }

    public void save(String userId, String data) {
        storage.savePortfolio(userId, data);
    }

    public void load(String userId) {
        System.out.println(storage.loadPortfolio(userId));
    }
}
