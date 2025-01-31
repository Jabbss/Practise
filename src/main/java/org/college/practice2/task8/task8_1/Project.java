package org.college.practice2.task8.task8_1;

public class Project extends PortfolioItem {
    private String title;
    private String description;

    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }

    @Override
    public String accept(PortfolioVisitor visitor) {
        return visitor.visitProject(this);
    }
}