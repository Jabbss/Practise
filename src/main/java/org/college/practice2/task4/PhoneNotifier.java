package org.college.practice2.task4;

public class PhoneNotifier implements Observer{
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void noti_fy(SystemAlert systemAlert) {
        System.out.println("Unknown number " + phoneNumber + " call to you");

    }
}
