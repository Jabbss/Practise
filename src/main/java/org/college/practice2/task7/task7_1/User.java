package org.college.practice2.task7.task7_1;

public class User {
    private String _firstName;
    private String _lastName;
    private UserType _role;

    public User(String firstName, String lastName, UserType role) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._role = role;
    }

    public String getFullName() {
        return _firstName + " " + _lastName;
    }

    public UserType getRole() {
        return _role;
    }
}
