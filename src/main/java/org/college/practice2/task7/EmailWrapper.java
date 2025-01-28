package org.college.practice2.task7;

public class EmailWrapper extends AbsWrapper {
    private String uniqueName;

    public EmailWrapper(NotificationWrapper wrapper, String uniqueName) {
        super(wrapper);
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending Email to " + uniqueName + ": " + alert.getMessage());
        super.notify(alert);
    }
}
