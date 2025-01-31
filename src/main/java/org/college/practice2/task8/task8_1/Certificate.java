package org.college.practice2.task8.task8_1;

import java.time.LocalDateTime;

public class Certificate extends PortfolioItem {
    private String name;
    private String issuingOrganization;
    private LocalDateTime issueDate;

    public Certificate(String name, String issuingOrganization, LocalDateTime issueDate) {
        this.name = name;
        this.issuingOrganization = issuingOrganization;
        this.issueDate = issueDate;
    }

    public String getName() { return name; }
    public String getIssuingOrganization() { return issuingOrganization; }
    public LocalDateTime getIssueDate() { return issueDate; }

    @Override
    public String accept(PortfolioVisitor visitor) {
        return visitor.visitCertificate(this);
    }
}
