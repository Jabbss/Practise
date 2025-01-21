package org.college.practice2.task5.task5_1;

public abstract class  Portfolio {
    protected Portfolio nextHandler;

    public void setNextHandler(Portfolio nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String requestType, String content);
}
