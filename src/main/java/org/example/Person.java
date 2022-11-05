package org.example;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String currentCity;


    Person(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    Person(String name,String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Person(String name,String surname, String currentCity){
        this.name = name;
        this.surname = surname;
        this.currentCity = currentCity;
    }

    Person(String name,String surname, int age, String currentCity){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.currentCity = currentCity;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
         return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return currentCity;
    }

    boolean hasAge(){
        if (age < 0){
            return false;
        } else return true;

    }

    void happyBirthday() {
    age +=1;
    }

    boolean hasAddress() {
        if (currentCity == null){
            return false;
        } else return true;
    }

    void setAddress(String city){
    this.currentCity = city;
    }

    @Override
    public String toString() {
        System.out.println();
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", city='" + currentCity + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(currentCity).setAge(0);
    }
}
