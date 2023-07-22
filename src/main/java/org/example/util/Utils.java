package org.example.util;

import org.example.model.Patient;
import org.example.model.enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Patient> init() {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("John", "Doe", 15, Gender.MALE, "Budapest",
                LocalDate.of(1994, 1, 23),
                1, 1, 1));
        patients.add(new Patient("Peter", "Doe", 22, Gender.MALE, "Budapest",
                LocalDate.of(2000, 4, 3),
                1, 2, 3));
        patients.add(new Patient("Michael", "Doe", 20, Gender.MALE, "Budapest",
                LocalDate.of(2001, 1, 4),
                1, 1, 4));
        patients.add(new Patient("John", "Smith", 15, Gender.MALE, "Budapest",
                LocalDate.of(2007, 3, 1),
                7, 2, 0));
        patients.add(new Patient("David", "Doe", 31, Gender.MALE, "Budapest",
                LocalDate.of(1991, 10, 30),
                0, 0, 1));
        patients.add(new Patient("Peter", "Smith", 42, Gender.MALE, "Budakeszi",
                LocalDate.of(1978, 10, 10),
                3, 0, 0));
        patients.add(new Patient("John", "Snow", 10, Gender.MALE, "Budakeszi",
                LocalDate.of(1994, 11, 11),
                2, 1, 0));
        patients.add(new Patient("Joseph", "Doe", 7, Gender.MALE, "Budakeszi",
                LocalDate.of(2015, 1, 4),
                2, 0, 0));
        patients.add(new Patient("Thomas", "Doe", 65, Gender.MALE, "Debrecen",
                LocalDate.of(1956, 10, 23),
                31, 7, 7));
        patients.add(new Patient("Luis", "Doe", 4, Gender.MALE, "Debrecen",
                LocalDate.of(2019, 6, 20),
                1, 3, 0));
        patients.add(new Patient("Jane", "Doe", 27, Gender.FEMALE, "Budapest",
                LocalDate.of(1995, 1, 23),
                0, 1, 1));
        patients.add(new Patient("Anna", "Apple", 20, Gender.FEMALE, "Budapest",
                LocalDate.of(2002, 9, 1),
                10, 1, 0));
        patients.add(new Patient("Petra", "Doe", 30, Gender.FEMALE, "Budapest",
                LocalDate.of(1992, 12, 3),
                0, 1, 0));
        patients.add(new Patient("Petra", "Potter", 45, Gender.FEMALE, "Budapest",
                LocalDate.of(1977, 6, 22),
                1, 0, 0));
        patients.add(new Patient("Leila", "Lovecraft", 20, Gender.FEMALE, "Budapest",
                LocalDate.of(2002, 1, 11),
                10, 5, 2));
        patients.add(new Patient("Jannet", "Doe", 28, Gender.FEMALE, "Eger",
                LocalDate.of(1994, 1, 23),
                0, 2, 0));
        patients.add(new Patient("Anna", "Smith", 15, Gender.FEMALE, "Eger",
                LocalDate.of(2007, 7, 13),
                2, 0, 0));
        patients.add(new Patient("Bianka", "Doe", 22, Gender.FEMALE, "Miskolc",
                LocalDate.of(2000, 3, 10),
                1, 0, 1));
        patients.add(new Patient("Gitta", "Doe", 7, Gender.FEMALE, "Miskolc",
                LocalDate.of(2015, 4, 4),
                1, 0, 0));
        patients.add(new Patient("Monica", "Doe", 52, Gender.FEMALE, "Miskolc",
                LocalDate.of(1970, 1, 23),
                1, 6, 4));

        return patients;
    }

    public static void printPatientData(List<Patient> patients){
        patients.forEach(System.out::println);
    }
}
