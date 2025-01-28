package org.college.practice2.task7;

public class TelegrammWrapper extends AbsWrapper {
    private String userId;
    private boolean isAdmin;

    public TelegrammWrapper(NotificationWrapper wrapper, String userId, boolean isAdmin) {
        super(wrapper);
        this.userId = userId;
        this.isAdmin = isAdmin;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending Telegram message to user " + userId + " (Admin: " + isAdmin + "): " + alert.getMessage());
        super.notify(alert);
    }
}
