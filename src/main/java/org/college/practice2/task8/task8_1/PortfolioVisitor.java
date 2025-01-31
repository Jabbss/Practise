package org.college.practice2.task8.task8_1;

public interface PortfolioVisitor {
    String visitUser(User user);
    String visitProject(Project project);
    String visitCertificate(Certificate certificate);
}
