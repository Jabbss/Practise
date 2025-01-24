package org.college.practice2.task6;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Report1", "Content of the report", "John Doe", "PDF");
        OutputControll outputControll = new OutputControll(document);
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            outputControll.setOutputStrategy(new WindowsOutputStrategy());
        } else if (os.startsWith("Linux")) {
            outputControll.setOutputStrategy(new LinuxOutputStrategy());
        } else {
            outputControll.setOutputStrategy(new AndroidOutputStrategy());
        }

                outputControll.printReport();
        outputControll.sendReportViaMail();
        outputControll.sendReportViaTelegram();
    }
}
