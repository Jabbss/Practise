package org.college.practice2.task3.task3_1;

public class Main{
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        CommandInterface addExperience = new AddSectionCommand(portfolio, "Досвiд");
        CommandInterface addEducation = new AddSectionCommand(portfolio, "Навчання");
        CommandInterface removeEducation = new RemoveSectionCommand(portfolio, "Знання");
        portfolio.displayPortfolio();
        System.out.println();
        portfolio.displayPortfolio();
        System.out.println();
        portfolio.displayPortfolio();
    }
}

