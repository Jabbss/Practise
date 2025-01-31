package org.college.practice2.task8;

import java.time.LocalDateTime;

public class User {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private Address address;

    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitUser(this);
    }

    @Override
    public String toString() {
        return "User" + "firstName='" + firstName + ", lastName='" + lastName +", birthDate=" + birthDate + ", address=" + address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}