package org.college.practice2.task8.task8_1;

import java.time.LocalDateTime;

public class User {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private Address address;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public String accept(PortfolioVisitor visitor) {
        return visitor.visitUser(this);
    }
}
