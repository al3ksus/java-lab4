package org.example.model;

import java.util.Objects;

public class Division {
    int id;
    char title;

    public Division(char title) {
        this.title = title;
        id = 1000 + (int) (Math.random() * 10000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Division division = (Division) o;
        return title == division.title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
