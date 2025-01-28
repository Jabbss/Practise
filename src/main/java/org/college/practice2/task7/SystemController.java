package org.college.practice2.task7;

public class SystemController {
    private SystemAlert[] alertHistory = new SystemAlert[10];
    private int alertIndex = 0;
    private NotificationWrapper notifier;
    public SystemController(NotificationWrapper notifier) {
        this.notifier = notifier;
    }
    public void addAlert(SystemAlert alert) {
        if (alertIndex < alertHistory.length) {
            alertHistory[alertIndex++] = alert;
        }
        if (notifier != null) {
            notifier.notify(alert);
        }
    }
}
