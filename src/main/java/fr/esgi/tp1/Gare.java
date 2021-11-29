package fr.esgi.tp1;

import java.util.Objects;

public class Gare {
    private long name;
    private float x;
    private float y;

    public Gare(long name, float x, float y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gare gare = (Gare) o;
        return name == gare.name && Float.compare(gare.x, x) == 0 && Float.compare(gare.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y);
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
