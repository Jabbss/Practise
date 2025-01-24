package org.college.practice2.task6.Task6_1;

public class User {
    private String firstName;
    private String lastName;
    private String role;

    public User(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getRole() {
        return role;
    }
}