package org.college.practice2.task2.task2_1;

public abstract class PortfolioBuilder {

        public abstract String PortfolioBuilder();

        public abstract  void defineCore(String title, int creationYear, String ownerName);

        public abstract void configureStyle( String portfolioType);

        public abstract void applyTheme(String colorTheme, boolean isPublicAccess) ;

        public abstract ElectronicPortfolio assemble();
        public final ElectronicPortfolio buildPortfolio(String title, int creationYear, String ownerName,
                                                        String portfolioType, String colorTheme, boolean isPublicAccess) {
                defineCore(title, creationYear, ownerName);
                configureStyle(portfolioType);
                applyTheme(colorTheme, isPublicAccess);
                return assemble();
        }
    }
