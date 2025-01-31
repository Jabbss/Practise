package org.college.practice2.task8;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String district;
    private String houseNumber;
    private String additionalNotes;

    @Override
    public String toString() {
        return "Address - country='" + country + ", region='" + region +", city='" + city + ", street='" + street +", district='" + district + ", houseNumber='" + houseNumber + ", additionalNotes='" + additionalNotes ;
    }
}
