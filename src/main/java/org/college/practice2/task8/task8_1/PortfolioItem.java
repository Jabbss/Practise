package org.college.practice2.task8.task8_1;

import java.time.LocalDateTime;

public abstract class PortfolioItem {
    private long id;
    private LocalDateTime creationDate;

    public abstract String accept(PortfolioVisitor visitor);
}
