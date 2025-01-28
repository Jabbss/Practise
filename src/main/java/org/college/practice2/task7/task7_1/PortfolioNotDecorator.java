package org.college.practice2.task7.task7_1;

public abstract class PortfolioNotDecorator implements PortfolioNot {
    protected PortfolioNot _notifier;

    public PortfolioNotDecorator(PortfolioNot notifier) {
        this._notifier = notifier;
    }

    @Override
    public void notify(Portfolio portfolio) {
        if (_notifier != null) {
            _notifier.notify(portfolio);
        }
    }
}