package org.college.practice2.task10.task10_1;

public  class Main {
    public static void main(String[] args) {
        PortfolioManager portfolioManager1 = new PortfolioManager(new CodeAdapter());
        portfolioManager1.save("user1", "Code");
        portfolioManager1.load("user1");

        PortfolioManager nosqlManager = new PortfolioManager(new PictureAdapter());
        nosqlManager.save("user2", "Picture");
        nosqlManager.load("user2");

        PortfolioManager fileManager = new PortfolioManager(new FileStorageAdapter());
        fileManager.save("user3", "File Portfolio Data");
        fileManager.load("user3");
    }
}
