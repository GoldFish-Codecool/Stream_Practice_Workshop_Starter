package org.example.model;

import org.example.model.enums.Gender;

import java.time.LocalDate;

public class Patient {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private String birthPlace;
    private LocalDate dateOfBirth;

    private int numberOfLowPriorityProblems;

    private int numberOfMediumPriorityProblems;

    private int numberOfHighPriorityProblems;

    public Patient(String firstName, String lastName, int age, Gender gender, String birthPlace, LocalDate dateOfBirth, int numberOfLowPriorityProblems, int numberOfMediumPriorityProblems, int numberOfHighPriorityProblems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.birthPlace = birthPlace;
        this.dateOfBirth = dateOfBirth;
        this.numberOfLowPriorityProblems = numberOfLowPriorityProblems;
        this.numberOfMediumPriorityProblems = numberOfMediumPriorityProblems;
        this.numberOfHighPriorityProblems = numberOfHighPriorityProblems;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumberOfLowPriorityProblems() {
        return numberOfLowPriorityProblems;
    }

    public void setNumberOfLowPriorityProblems(int numberOfLowPriorityProblems) {
        this.numberOfLowPriorityProblems = numberOfLowPriorityProblems;
    }

    public int getNumberOfMediumPriorityProblems() {
        return numberOfMediumPriorityProblems;
    }

    public void setNumberOfMediumPriorityProblems(int numberOfMediumPriorityProblems) {
        this.numberOfMediumPriorityProblems = numberOfMediumPriorityProblems;
    }

    public int getNumberOfHighPriorityProblems() {
        return numberOfHighPriorityProblems;
    }

    public void setNumberOfHighPriorityProblems(int numberOfHighPriorityProblems) {
        this.numberOfHighPriorityProblems = numberOfHighPriorityProblems;
    }
}
