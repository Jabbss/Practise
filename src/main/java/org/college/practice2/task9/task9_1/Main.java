package org.college.practice2.task9.task9_1;

public class Main {
    public static void main(String[] args) {
        PortfolioController controller = new PortfolioController("PortfolioDatabase");
        controller.getPortfolio("User123");
        controller.updatePortfolio("User123", "New Project Added");
    }
}
