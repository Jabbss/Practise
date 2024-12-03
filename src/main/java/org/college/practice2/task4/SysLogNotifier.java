package org.college.practice2.task4;

public class SysLogNotifier implements Observer{
    private String journalName;

    public SysLogNotifier(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void noti_fy(SystemAlert systemAlert) {
        System.out.println("Create a new journal with name: " + journalName);

    }
}
