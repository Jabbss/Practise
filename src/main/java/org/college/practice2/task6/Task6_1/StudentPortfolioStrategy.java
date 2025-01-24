package org.college.practice2.task6.Task6_1;

public class StudentPortfolioStrategy implements PortfolioStrategy {
    @Override
    public void displayPortfolio(User user) {
        System.out.println("Displaying Student Portfolio for: " + user.getFullName());
        System.out.println("Courses Enrolled: Java, Mathematics, Physics");
        System.out.println("GPA: 3.9");
    }
}
