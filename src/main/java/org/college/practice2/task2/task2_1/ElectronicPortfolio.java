package org.college.practice2.task2.task2_1;

public class ElectronicPortfolio {
        private String _title;
        private int _creationYear;
        private String _ownerName;
        String _portfolioType;
        String _colorTheme;
        boolean _isPublicAccess;
        private String _dataStorage;

        public ElectronicPortfolio(String title, int creationYear, String ownerName,
                                   String portfolioType, String colorTheme, boolean isPublicAccess, String dataStorage) {
            this._title = title;
            this._creationYear = creationYear;
            this._ownerName = ownerName;
            this._portfolioType = portfolioType;
            this._colorTheme = colorTheme;
            this._isPublicAccess = isPublicAccess;
            this._dataStorage = dataStorage;
        }

        public String getTitle() {
            return _title;
        }

        public int getCreationYear() {
            return _creationYear;
        }

    @Override
    public String toString() {
        return "UaBuilder" +
                " title = '" + _title + '\'' +
                ", creationYear = " + _creationYear +
                ", ownerName = '" + _ownerName + '\'' +
                ", portfolioType = '" + _portfolioType + '\'' +
                ", colorTheme = '" + _colorTheme + '\'' +
                ", isPublicAccess = " + _isPublicAccess +
                ", dataStorage = '" + _dataStorage ;
    }
}

