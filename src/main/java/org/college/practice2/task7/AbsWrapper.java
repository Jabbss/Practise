package org.college.practice2.task7;

public abstract class AbsWrapper implements NotificationWrapper {
    protected NotificationWrapper wrapper;

    public AbsWrapper(NotificationWrapper wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void notify(SystemAlert alert) {
        if (wrapper != null) {
            wrapper.notify(alert);
        }
    }
}
