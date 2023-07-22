package org.example;

import org.example.model.Patient;
import org.example.model.enums.Gender;
import org.example.repository.PatientRepository;
import org.example.util.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestRepository {
    private List<Patient> patients;
    private PatientRepository patientRepository;

    @BeforeEach
    public void Init(){
        patients = Utils.init();
        patientRepository = new PatientRepository(patients);
    }

    @Test
    public void TestAllPatients(){
        Assertions.assertArrayEquals(
                patients.toArray(),
                patientRepository.listAllPatients().toArray());
    }

    @Test
    public void TestPatientsOlderThan30(){
        List<Patient> expected = new ArrayList<>() {
            {
                add(new Patient("David", "Doe", 31, Gender.MALE, "Budapest",
                        LocalDate.of(1991, 10, 30),
                        0, 0, 1));
                add(new Patient("Peter", "Smith", 42, Gender.MALE, "Budakeszi",
                        LocalDate.of(1978, 10, 10),
                        3, 0, 0));
                add(new Patient("Thomas", "Doe", 65, Gender.MALE, "Debrecen",
                        LocalDate.of(1956, 10, 23),
                        31, 7, 7));
                add(new Patient("Petra", "Potter", 45, Gender.FEMALE, "Budapest",
                        LocalDate.of(1977, 6, 22),
                        1, 0, 0));
                add(new Patient("Monica", "Doe", 52, Gender.FEMALE, "Miskolc",
                        LocalDate.of(1970, 1, 23),
                        1, 6, 4));
            }
        };

        Assertions.assertArrayEquals(
                expected.toArray(),
                patientRepository.listPatientsOlderThan30().toArray());
    }

    @Test
    public void TestPatientsOlderOlderThanGivenAge(){
        List<Patient> expected = new ArrayList<>() {
            {
                add(new Patient("Peter", "Smith", 42, Gender.MALE, "Budakeszi",
                        LocalDate.of(1978, 10, 10),
                        3, 0, 0));
                add(new Patient("Thomas", "Doe", 65, Gender.MALE, "Debrecen",
                        LocalDate.of(1956, 10, 23),
                        31, 7, 7));
                add(new Patient("Petra", "Potter", 45, Gender.FEMALE, "Budapest",
                        LocalDate.of(1977, 6, 22),
                        1, 0, 0));
                add(new Patient("Monica", "Doe", 52, Gender.FEMALE, "Miskolc",
                        LocalDate.of(1970, 1, 23),
                        1, 6, 4));
            }
        };

        Assertions.assertArrayEquals(
                expected.toArray(),
                patientRepository.listPatientsOlderThanGivenAge(40).toArray());
    }

    @Test
    public void TestPatientsFromGivenBirthPlace(){
        List<Patient> expected = new ArrayList<>() {
            {
                add(new Patient("Jannet", "Doe", 28, Gender.FEMALE, "Eger",
                        LocalDate.of(1994, 1, 23),
                        0, 2, 0));
                add(new Patient("Anna", "Smith", 15, Gender.FEMALE, "Eger",
                        LocalDate.of(2007, 7, 13),
                        2, 0, 0));
            }
        };

        Assertions.assertArrayEquals(
                expected.toArray(),
                patientRepository.listPatientsFromGivenBirthPlace("Eger").toArray());
    }

    @Test
    public void TestPatientsWhoHasWrongAgeGiven(){

        Assertions.assertEquals(19, patientRepository.listPatientsWhoHasWrongAgeGiven().size());
    }

    @Test
    public void testMalePatientsWithGivenBirthPlace(){
        List<Patient> expected = new ArrayList<>() {
            {
                add(new Patient("Thomas", "Doe", 65, Gender.MALE, "Debrecen",
                        LocalDate.of(1956, 10, 23),
                        31, 7, 7));
                add(new Patient("Luis", "Doe", 4, Gender.MALE, "Debrecen",
                        LocalDate.of(2019, 6, 20),
                        1, 3, 0));
            }
        };

        Assertions.assertArrayEquals(
                expected.toArray(),
                patientRepository.listMalePatientsWithGivenBirthPlace("Debrecen").toArray());
    }


    @Test
    public void testFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter(){
        List<Patient> expected = new ArrayList<>() {
            {
                add(new Patient("Anna", "Apple", 20, Gender.FEMALE, "Budapest",
                        LocalDate.of(2002, 9, 1),
                        10, 1, 0));
                add(new Patient("Petra", "Potter", 45, Gender.FEMALE, "Budapest",
                        LocalDate.of(1977, 6, 22),
                        1, 0, 0));
                add(new Patient("Leila", "Lovecraft", 20, Gender.FEMALE, "Budapest",
                        LocalDate.of(2002, 1, 11),
                        10, 5, 2));

            }
        };

        Assertions.assertArrayEquals(
                expected.toArray(),
                patientRepository.listFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter().toArray());
    }

    @Test
    public void testTopTenPatientsBasedOnPriorityScore(){
        Assertions.assertEquals(10,
                patientRepository.listTopTenPatientsBasedOnPriorityScore().size());
    }
}
