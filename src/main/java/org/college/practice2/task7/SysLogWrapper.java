package org.college.practice2.task7;

class SysLogWrapper extends AbsWrapper {
    private String journalName;

    public SysLogWrapper(NotificationWrapper wrapper, String journalName) {
        super(wrapper);
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Logging to SysLog [" + journalName + "]: " + alert.getMessage());
        super.notify(alert);
    }
}
