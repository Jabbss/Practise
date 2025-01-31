package org.college.practice2.task8.task8_1;

public class PortfolioJsonVisitor implements PortfolioVisitor {
    @Override
    public String visitUser(User user) {
        return "User" + user.getFirstName() + " " + user.getLastName() + "\"}";
    }

    @Override
    public String visitProject(Project project) {
        return "Project" + project.getTitle() + "\"}";
    }

    @Override
    public String visitCertificate(Certificate certificate) {
        return "Certificate" + certificate.getName() + "\"}";
    }
}
