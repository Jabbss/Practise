package org.college.practice2.task8.task8_1;

import java.util.ArrayList;

public class PortfolioStorage {
    private ArrayList<PortfolioItem> portfolioItems = new ArrayList<>();
    private PortfolioVisitor serializer;

    public void save() {
        for (PortfolioItem item : portfolioItems) {
            System.out.println(item.accept(serializer));
        }
    }

    public void changeFormat(String format) {
        if (format.equals("json")) {
            serializer = new PortfolioJsonVisitor();
        } else {
            serializer = new PortfolioDatabaseVisitor();
        }
    }

    public void addPortfolioItem(PortfolioItem item) {
        portfolioItems.add(item);
    }
}
