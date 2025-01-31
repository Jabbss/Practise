package org.college.practice2.task8.task8_1;

public class PortfolioDatabaseVisitor implements PortfolioVisitor {
    @Override
    public String visitUser(User user) {
        return "INSERT INTO users (name) " + user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public String visitProject(Project project) {
        return "INSERT INTO projects (title, description)" + project.getTitle() + "', '" + project.getDescription() ;
    }

    @Override
    public String visitCertificate(Certificate certificate) {
        return "INSERT INTO certificates (name, organization) " + certificate.getName() + "', '" + certificate.getIssuingOrganization() ;
    }
}
