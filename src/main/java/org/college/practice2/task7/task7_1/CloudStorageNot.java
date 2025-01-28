package org.college.practice2.task7.task7_1;

public class CloudStorageNot extends PortfolioNotDecorator {
    private String _cloudService;

    public CloudStorageNot(PortfolioNot notifier, String cloudService) {
        super(notifier);
        this._cloudService = cloudService;
    }

    @Override
    public void notify(Portfolio portfolio) {
        System.out.println("Saving portfolio in the cloud: " + _cloudService);
        super.notify(portfolio);
    }
}
