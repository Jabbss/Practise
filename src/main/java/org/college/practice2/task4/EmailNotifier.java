package org.college.practice2.task4;

public class EmailNotifier implements Observer{
    private String uniqueName;

    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public void noti_fy(SystemAlert systemAlert) {
        System.out.println("Email adress: " + uniqueName);

    }
}
