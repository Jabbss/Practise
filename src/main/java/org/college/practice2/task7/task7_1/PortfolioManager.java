package org.college.practice2.task7.task7_1;

public class PortfolioManager {
    private PortfolioNot _notifier;

    public PortfolioManager(PortfolioNot notifier) {
        this._notifier = notifier;
    }

    public void sharePortfolio(Portfolio portfolio) {
        System.out.println(portfolio.getOwner().getFullName() + " share own portfolio");
        _notifier.notify(portfolio);
    }
}
