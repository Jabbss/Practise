package org.college.practice2.task6;

public interface OutputStrategy {
    void printReport(Document document);
    void sendReportViaMail(Document document);
    void sendReportViaTelegram(Document document);
}
