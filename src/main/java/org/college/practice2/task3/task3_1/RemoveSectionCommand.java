package org.college.practice2.task3.task3_1;

class RemoveSectionCommand implements CommandInterface {
    private Portfolio portfolio;
    private String section;

    public RemoveSectionCommand(Portfolio portfolio, String section) {
        this.portfolio = portfolio;
        this.section = section;
    }

    @Override
    public void execute() {
        portfolio.removeSection(section);
    }

    @Override
    public void undo() {
        portfolio.addSection(section);
    }
}