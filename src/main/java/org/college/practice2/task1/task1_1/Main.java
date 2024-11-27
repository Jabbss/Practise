package org.college.practice2.task1.task1_1;

public class Main {
        public static void main(String[] args) {
            Platform platform = Platform.getInstance("Electronic Portfolio Platform");

            Portfolio portfolio1 = new Portfolio("Student Projects", "Portfolio of academic projects", "John Doe");
            Portfolio portfolio2 = new Portfolio("Professional Work", "Portfolio of work experience", "Jane Doe");

            platform.addPortfolio(portfolio1);
            platform.addPortfolio(portfolio2);

            System.out.println("Platform Name: " + platform.getName());
            System.out.println("Number of Portfolios: " + platform.getPortfolioCount());
            System.out.println("First Portfolio: " + platform.describePortfolio(portfolio1));

            platform.setAnnouncement("Welcome to the Electronic Portfolio Platform!");
            System.out.println("Announcement: " + platform.getAnnouncement());
        }
    }

