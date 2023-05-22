package org.fasttrackit.homework16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonService {
    private final List<Person> personList;

    // private final PersonRepository personRepository;

    public PersonService(List<Person> personList) {
        this.personList = personList;
        // this.personRepository = new PersonRepository(connectionUrl, dbUsername, dbPassword, dbConfig);
    }

    // - list all the persons names: firstName lastName
    public List<String> getNames() {
        return personList.stream().map(person -> person.firstName() + " " + person.lastName()).toList();
    }

    //- list all persons that are major
    public List<Person> getMajorPersons() {
        return personList.stream().filter(person -> person.age() >= 18).toList();
    }

    //- list all persons from Oradea
    public List<Person> getFromOradea() {
        return personList.stream().filter(person -> person.city().equals("Oradea")).toList();
    }

    //- list all persons from Oradea OR Cluj
    public List<Person> getFromOradeaOrCluj() {
        return personList.stream().filter(person -> person.city().equals("Oradea") || person.city().equals("Cluj")).toList();
    }

    public List<Person> getFromOradeaOrCluj2() {
        return personList.stream().filter(person -> Arrays.asList("Oradea", "Cluj").contains(person.city())).toList();
    }

    //- list all firstNames CAPITALIZED
    public List<String> getFirstNamecapitalized() {
        return personList.stream()
                .map(p -> p.firstName().toUpperCase())
                .toList();
    }

    public List<String> getFirstNamecapitalized2() {
        return personList.stream()
                .map(Person::firstName)
                .map(String::toUpperCase)
                .toList();
    }

    //- list all person names: firstName firstletter from last name: Stefan B.
    //
    //- list all persons with 18 < age < 60
    //
    //- list all persons having first name starting with A
    //
    //- list all first names UNIQUELY
    public List<String> getUniqueFirstNames() {
        return personList.stream()
                .map(Person::firstName)
                .distinct()
                .toList();
    }

    //- sort the persons by first name
    //
    //- sort the persons by last name
    //
    //- sort the persons by first name, last name and then age
    public List<Person> sort() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::firstName).thenComparing(Person::lastName).thenComparing(Person::age))
                .toList();
    }
}
