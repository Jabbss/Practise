package org.college.practice2.task2.task2_1;

public class Main {
    public static void main(String[] args){
        ElectronicPortfolio electronicPortfolio = new ElectronicPortfolio("uabuilder", 2024, "Anatoli", "find job", "white-dark", true, "28.11.2024");
        UaBuilder uaBuilder = new UaBuilder(electronicPortfolio);
        System.out.println(uaBuilder.toString());
        uaBuilder.PortfolioBuilder();
        uaBuilder.applyTheme("white-blue", true);
        uaBuilder.getTitle();
        uaBuilder.assemble();
        uaBuilder.defineCore("builder", 2024, "Ann");
        System.out.println(uaBuilder.toString());

    }
}
