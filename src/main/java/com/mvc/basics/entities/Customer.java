package com.mvc.basics.entities;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    private String firstName;

    @NotNull(message = "Please enter the last name")
    @Size(min = 1, message = "Please enter name longer than 1 character")
    private String lastName;

    @Min(value = 0, message = "Value should be more than 0")
    @Max(value = 5, message = "Value should be less than 5")
    private int freePass;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull(message = "Please enter the last name")
    @Size(min = 1, message = "Please enter name longer than 1 character")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "Please enter the last name") @Size(min = 1, message = "Please enter name longer than 1 character") String lastName) {
        this.lastName = lastName;
    }

    @Min(value = 0, message = "Value should be more than 0")
    @Max(value = 5, message = "Value should be less than 5")
    public int getFreePass() {
        return freePass;
    }

    public void setFreePass(@Min(value = 0, message = "Value should be more than 0") @Max(value = 5, message = "Value should be less than 5") int freePass) {
        this.freePass = freePass;
    }
}
