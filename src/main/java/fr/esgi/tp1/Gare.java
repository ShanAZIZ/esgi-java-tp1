package fr.esgi.tp1;

public class Gare {
    private long name;
    private float x;
    private float y;

    public Gare(long name, float x, float y){
        this.name = name;
        this.x = x;
        this.y = y;
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
