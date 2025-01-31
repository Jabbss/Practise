package org.college.practice2.task8.task8_1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        PortfolioStorage storage = new PortfolioStorage();
        storage.changeFormat("json");

        User user = new User("John", "Doe");

        Project project = new Project("Research", "Research on programing applications.");

        Certificate certificate = new Certificate("Java Certification", "Oracle", LocalDateTime.now());

        storage.addPortfolioItem(project);
        storage.addPortfolioItem(certificate);
        storage.save();
    }
}
