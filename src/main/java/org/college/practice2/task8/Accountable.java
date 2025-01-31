package org.college.practice2.task8;

import java.time.LocalDateTime;

public abstract class Accountable {
    public long id;
    public LocalDateTime creationDate;

    public abstract String accept(BankAbstractVisitor visitor);

    @Override
    public String toString() {
        return "Accountable" + "id=" + id + ", creationDate=" + creationDate ;
    }
}