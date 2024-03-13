package org.example;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected String surname;
    protected int age = 0;
    protected String address = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }

    public boolean hasAge() {
        return age != 0;
    }
    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (age == 0) return OptionalInt.empty();
        else return OptionalInt.of(age);
    }
    public String getAddress()  {
        return null;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return name + "\\" +
                surname + "\\" +
                age + "\\" +
                address + "\\";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
