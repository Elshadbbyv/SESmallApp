package aze.iktlab.smallapp.exercise.model;

import java.util.Objects;

public class Person {
    private Long id;
    //POJO Class icerisinde deyer saxlayir
    private String name;
    private String surname;
    private String fname;
    private int age;
    private Gender gender;

    public Person() {
    }

    public Person(Long id, String name, String surname, String fname, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fname = fname;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(fname, person.fname) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, fname, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fname='" + fname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
