package org.college.practice2.task5.task5_1;

public class PortfolioManager {
    private Portfolio firstHandler;

    public PortfolioManager() {
        DocumentChain documentHandler = new DocumentChain();
        ImageChain imageHandler = new ImageChain();
        VideoChain videoHandler = new VideoChain();

        documentHandler.setNextHandler(imageHandler);
        imageHandler.setNextHandler(videoHandler);

        firstHandler = documentHandler;
    }
    public void addContent(String type, String content) {
        firstHandler.handleRequest(type, content);
    }
}
