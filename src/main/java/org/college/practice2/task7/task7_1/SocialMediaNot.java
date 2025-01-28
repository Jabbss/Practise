package org.college.practice2.task7.task7_1;

public class SocialMediaNot extends PortfolioNotDecorator {
    private String _platform;

    public SocialMediaNot(PortfolioNot notifier, String platform) {
        super(notifier);
        this._platform = platform;
    }

    @Override
    public void notify(Portfolio portfolio) {
        System.out.println("Put in publish portfolio on the social media: " + _platform);
        super.notify(portfolio);
    }
}
