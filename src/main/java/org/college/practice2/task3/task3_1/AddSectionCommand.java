package org.college.practice2.task3.task3_1;

public class AddSectionCommand implements CommandInterface {
    private Portfolio portfolio;
    private String section;

    public AddSectionCommand(Portfolio portfolio, String section) {
        this.portfolio = portfolio;
        this.section = section;
    }

    @Override
    public void execute() {
        portfolio.addSection(section);
    }

    @Override
    public void undo() {
        portfolio.removeSection(section);
    }
}