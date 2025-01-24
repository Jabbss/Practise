package org.college.practice2.task6.Task6_1;

public class Main {
    public static void main(String[] args) {
        User student = new User("Alice", "Johnson", "Student");
        User teacher = new User("Bob", "Smith", "Teacher");
        User admin = new User("Charlie", "Brown", "Admin");

        PortfolioControll portfolioController = new PortfolioControll();
        if ("Student".equalsIgnoreCase(student.getRole())) {
            portfolioController.setPortfolioStrategy(new StudentPortfolioStrategy());
        }
        portfolioController.displayPortfolio(student);

        if ("Teacher".equalsIgnoreCase(teacher.getRole())) {
            portfolioController.setPortfolioStrategy(new TeacherPortfolioStrategy());
        }
        portfolioController.displayPortfolio(teacher);

        if ("Admin".equalsIgnoreCase(admin.getRole())) {
            portfolioController.setPortfolioStrategy(new AdminPortfolioStrategy());
        }
        portfolioController.displayPortfolio(admin);
    }
}
