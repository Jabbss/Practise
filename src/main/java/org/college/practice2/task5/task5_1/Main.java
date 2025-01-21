package org.college.practice2.task5.task5_1;

public class Main {
    public static void main(String[] args) {
        PortfolioManager portfolioManager = new PortfolioManager();

        portfolioManager.addContent("document", "Resume.pdf");
        portfolioManager.addContent("image", "ProfilePicture.jpg");
        portfolioManager.addContent("video", "Introduction.mp4");
        portfolioManager.addContent("audio", "Podcast.mp3");
    }
}