package org.college.practice2.task8;

import java.time.LocalDateTime;

public class Administrator {
    private String department;
    private LocalDateTime hireDate;

    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitAdministrator(this);
    }

    public String getDepartment() {
        return department;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }
}
