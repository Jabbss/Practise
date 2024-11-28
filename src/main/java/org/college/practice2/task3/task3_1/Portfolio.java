package org.college.practice2.task3.task3_1;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<String> sections = new ArrayList<>();

    public void addSection(String section) {
        sections.add(section);
        System.out.println("Доданий роздiл: " + section);
    }

    public void removeSection(String section) {
        sections.remove(section);
        System.out.println("Видалений роздiл: " + section);
    }

    public void displayPortfolio() {
        System.out.println("Портфолио: " + sections);
    }

}
