package org.college.practice2.task6.Task6_1;

public class AdminPortfolioStrategy implements PortfolioStrategy {
    @Override
    public void displayPortfolio(User user) {
        System.out.println("Displaying Admin Portfolio for: " + user.getFullName());
        System.out.println("Managed Users: 250");
        System.out.println("System Reports: 5 Pending");
    }
}