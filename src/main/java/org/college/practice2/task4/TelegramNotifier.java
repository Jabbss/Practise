package org.college.practice2.task4;

public class TelegramNotifier implements Observer{
    private String _userId;
    private boolean _isInstant;

    public TelegramNotifier(String _userId, boolean _isInstant) {
        this._userId = _userId;
        this._isInstant = _isInstant;
    }

    @Override
    public void noti_fy(SystemAlert systemAlert) {
        System.out.println(_userId + " just written a message to you");

    }
}
