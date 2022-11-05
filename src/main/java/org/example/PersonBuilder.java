package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String currentCity;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0 && age < 120) {
            this.age = age;
        } else throw new IllegalArgumentException("Возраст недопустимый");
        return this;
    }

    public PersonBuilder setAddress(String currentCity) {
        this.currentCity = currentCity;
        return this;
    }

    public Person build() {
        if (name == null || surname == null || name.isEmpty() || surname.isEmpty()) {
            throw new IllegalStateException("Не хватает обязательных полей");
        } else return new Person(name, surname, age, currentCity);
    }

}
