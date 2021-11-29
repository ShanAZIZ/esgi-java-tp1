package fr.esgi.tp1;

public class Route {
    private Gare Departure;
    private Gare Arrival;
    private int distance;

    public Route(Gare departure, Gare arrival){
        if(departure.equals(arrival)){
            throw new IllegalArgumentException("Deux gares identitiques");
        }
        this.Departure = departure;
        this.Arrival = arrival;
        this.distance = Position.getDistance();
    }

    public Gare getDeparture() {
        return Departure;
    }

    public void setDeparture(Gare departure) {
        Departure = departure;
    }

    public Gare getArrival() {
        return Arrival;
    }

    public void setArrival(Gare arrival) {
        Arrival = arrival;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
