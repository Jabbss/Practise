package org.college.practice2.task6.Task6_1;

public class PortfolioControll {
    private PortfolioStrategy portfolioStrategy;

    public void setPortfolioStrategy(PortfolioStrategy portfolioStrategy) {
        this.portfolioStrategy = portfolioStrategy;
    }

    public void displayPortfolio(User user) {
        if (portfolioStrategy != null) {
            portfolioStrategy.displayPortfolio(user);
        } else {
            System.out.println("No strategy set for displaying portfolio.");
        }
    }
}

