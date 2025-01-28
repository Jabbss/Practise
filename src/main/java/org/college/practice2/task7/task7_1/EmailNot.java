package org.college.practice2.task7.task7_1;

public class EmailNot extends PortfolioNotDecorator {
    private String _email;

    public EmailNot(PortfolioNot notifier, String email) {
        super(notifier);
        this._email = email;
    }

    @Override
    public void notify(Portfolio portfolio) {
        System.out.println("Send portfolio via Email: " + _email);
        System.out.println("Content: " + portfolio.getContent());
        super.notify(portfolio);
    }
}
