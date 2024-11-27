package org.college.practice2.task1.task1_1;

class Portfolio {
    private String _title;
    private String _description;
    private String _owner;

    public Portfolio(String title, String description, String owner) {
        this._title = title;
        this._description = description;
        this._owner = owner;
    }

    public String getTitle() {
        return _title;
    }

    public String getDescription() {
        return _description;
    }

    public String getOwner() {
        return _owner;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "title='" + _title + '\'' +
                ", description='" + _description + '\'' +
                ", owner='" + _owner + '\'' +
                '}';
    }
}