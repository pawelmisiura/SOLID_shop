package com.spartaglobal.SOLID_shop.Students;

public class Student implements IStudents {
    private String firstName;
    private String lastName;
    private String stream;
    boolean hasLaptop;

    public Student(String firstName, String lastName, String stream) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stream = stream;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
    @Override
    public boolean hasLaptop() {
        return hasLaptop;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }
}
