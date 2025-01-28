package org.college.practice2.task7;

public class PhoneWrapper extends AbsWrapper {
    private String phoneNumber;

    public PhoneWrapper(NotificationWrapper wrapper, String phoneNumber) {
        super(wrapper);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending SMS to phone number " + phoneNumber + ": " + alert.getMessage());
        super.notify(alert);
    }
}