package org.college.practice2.task6.Task6_1;

public class TeacherPortfolioStrategy implements PortfolioStrategy {
    @Override
    public void displayPortfolio(User user) {
        System.out.println("Displaying Teacher Portfolio for: " + user.getFullName());
        System.out.println("Courses Taught: Software Engineering, Data Structures");
        System.out.println("Publications: 15");
    }
}