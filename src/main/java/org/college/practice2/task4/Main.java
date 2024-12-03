package org.college.practice2.task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        SystemAlert alert = new SystemAlert(AlertSeverity.ERROR, "CPU Overload", 1001, LocalDate.now(), "CPU");
        SystemController controller = new SystemController();

        EmailNotifier emailNotifier = new EmailNotifier("admin@example.com");
        SysLogNotifier sysLogNotifier = new SysLogNotifier("system_log");
        PhoneNotifier phoneNotifier = new PhoneNotifier("+123456789");
        TelegramNotifier telegramNotifier = new TelegramNotifier("user123", true);

        controller.subscribe(emailNotifier);
        controller.subscribe(sysLogNotifier);
        controller.subscribe(phoneNotifier);
        controller.subscribe(telegramNotifier);

controller.informAlert();
        controller.addAlert(alert);
        controller.informAlert();

    }
}
