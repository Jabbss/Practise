package org.college.practice2.task7.task7_1;

import java.time.LocalDateTime;

public class Portfolio {
    private User _owner;
    private String _content;
    private LocalDateTime _lastUpdated;

    public Portfolio(User owner, String content) {
        this._owner = owner;
        this._content = content;
        this._lastUpdated = LocalDateTime.now();
    }

    public User getOwner() {
        return _owner;
    }

    public String getContent() {
        return _content;
    }

    public LocalDateTime getLastUpdated() {
        return _lastUpdated;
    }
}
