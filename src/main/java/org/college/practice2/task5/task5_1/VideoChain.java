package org.college.practice2.task5.task5_1;

public class VideoChain extends Portfolio {
    @Override
    public void handleRequest(String requestType, String content) {
        if ("video".equalsIgnoreCase(requestType)) {
            System.out.println("Adding video to portfolio: " + content);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType, content);
        } else {
            System.out.println("No handler found for request type: " + requestType);
        }
    }
}