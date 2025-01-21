package org.college.practice2.task5.task5_1;

public class ImageChain extends Portfolio {
    @Override
    public void handleRequest(String requestType, String content) {
        if ("image".equalsIgnoreCase(requestType)) {
            System.out.println("Adding image to portfolio: " + content);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType, content);
        } else {
            System.out.println("No handler found for request type: " + requestType);
        }
    }
}