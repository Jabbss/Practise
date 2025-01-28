package org.college.practice2.task7.task7_1;

public class Main {
    public static void main(String[] args) {
        User student = new User("Alex", "Koust", UserType.STUDENT);
        Portfolio studentPortfolio = new Portfolio(student, "Achivements");

        PortfolioNot notifier = null;

        notifier = new EmailNot(notifier, "student@gmail.com");
        notifier = new CloudStorageNot(notifier, "Google Drive");
        notifier = new SocialMediaNot(notifier, "LinkedIn");

        PortfolioManager manager = new PortfolioManager(notifier);
        manager.sharePortfolio(studentPortfolio);
    }
}
