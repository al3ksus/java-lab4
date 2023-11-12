package org.example.model;

import java.util.Objects;

public class Human {
    int id;
    String name;
    String gender;
    String birthDate;
    Division division;
    int salary;

    public Human(int id, String name, String gender, String birthDate, Division division, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
        System.out.println(this);
    }

    public Human(String[] data) {
        id = Integer.parseInt(data[0]);
        name = data[1];
        gender = data[2];
        birthDate = data[3];
        division = new Division(data[4].toCharArray()[0]);
        salary = Integer.parseInt(data[5]);
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && salary == human.salary && Objects.equals(name, human.name) && Objects.equals(gender, human.gender) && Objects.equals(birthDate, human.birthDate) && Objects.equals(division, human.division);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, birthDate, division, salary);
    }
}