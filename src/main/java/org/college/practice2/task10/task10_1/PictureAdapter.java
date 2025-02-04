package org.college.practice2.task10.task10_1;

public class PictureAdapter implements PortfolioStorage {
    @Override
    public void savePortfolio(String userId, String data) {
        System.out.println("Saving picture to portfolio for user: " + userId);
    }

    @Override
    public String loadPortfolio(String userId) {
        return "Picture from portfolio for user: " + userId;
    }
}
