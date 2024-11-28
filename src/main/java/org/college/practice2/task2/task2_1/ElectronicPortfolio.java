package org.college.practice2.task2.task2_1;

public class ElectronicPortfolio {
        private String _title;
        private int _creationYear;
        private String _ownerName;
        String _portfolioType;
        String _colorTheme;
        boolean _isPublicAccess;
        private String _dataStorage;

        // Конструктор
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
                "_title='" + _title + '\'' +
                ", _creationYear=" + _creationYear +
                ", _ownerName='" + _ownerName + '\'' +
                ", _portfolioType='" + _portfolioType + '\'' +
                ", _colorTheme='" + _colorTheme + '\'' +
                ", _isPublicAccess=" + _isPublicAccess +
                ", _dataStorage='" + _dataStorage + '\'' +
                '}';
    }
}

