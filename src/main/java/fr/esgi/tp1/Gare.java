package fr.esgi.tp1;

import java.util.Objects;

public class Gare {
    private long name;
    private Position position;

    public Gare(long name, Position position) {
        this.name = name;
        this.position = position;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gare gare = (Gare) o;
        return name == gare.name && Objects.equals(position, gare.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
