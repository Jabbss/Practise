package org.college.practice2.task2.task2_1;

public class UaBuilder extends PortfolioBuilder {
    private ElectronicPortfolio portfolio;
    private String _title;
    private int _creationYear;
    private String _ownerName;
    private String _designStyle;
    private String _portfolioType;
    private String _colorTheme;
    private boolean _isPublicAccess;
    private String _dataStorage;

    public UaBuilder(ElectronicPortfolio portfolio){
        this.portfolio = portfolio;
    }

    public String toString() {
        return "ElectronicPortfolio " +
                "portfolio = " + portfolio +
                ", title = '" + _title + '\'' +
                ", creationYear = " + _creationYear +
                ", ownerName = '" + _ownerName + '\'' +
                ", designStyle = '" + _designStyle + '\'' +
                ", portfolioType = '" + _portfolioType + '\'' +
                ", colorTheme = '" + _colorTheme + '\'' +
                ", isPublicAccess = " + _isPublicAccess +
                ", dataStorage = '" + _dataStorage ;
    }

    public String getTitle() {
        return _title;
    }


    @Override
    public void defineCore(String title, int creationYear, String ownerName) {
        portfolio = new ElectronicPortfolio(title, creationYear, ownerName, null, null, true, null);
    }

    @Override
    public void configureStyle(String portfolioType) {
        portfolio._portfolioType = portfolioType;
    }

    @Override
    public void applyTheme(String colorTheme, boolean isPublicAccess) {
        portfolio._colorTheme = colorTheme;
        portfolio._isPublicAccess = isPublicAccess;
    }

    @Override
    public ElectronicPortfolio assemble() {
        return portfolio;
    }
}
