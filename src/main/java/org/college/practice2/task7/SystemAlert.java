package org.college.practice2.task7;

import java.time.LocalDateTime;

public class SystemAlert {
    private AlertSev severity;
    private String message;
    private String processName;
    private LocalDateTime timestamp;

    public SystemAlert(AlertSev severity, String message, String processName) {
        this.severity = severity;
        this.message = message;
        this.processName = processName;
        this.timestamp = LocalDateTime.now();
    }

    public AlertSev getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public String getProcessName() {
        return processName;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}