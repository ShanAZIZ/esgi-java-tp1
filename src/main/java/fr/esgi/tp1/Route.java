package fr.esgi.tp1;

public class Route {
    private Gare Departure;
    private Gare Arrival;
    private int distance;

    public Route(Gare departure, Gare arrival, int distance){
        if(departure.equals(arrival)){
            throw new IllegalArgumentException("Deux gares identitiques");
        }
        this.Departure = departure;
        this.Arrival = arrival;
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

    public int getDistance(Gare Depart, Gare Arrive) {
        float x1 = Depart.getX();
        float y1 = Depart.getY();

        float x2 = Arrive.getX();
        float y2 = Arrive.getY();

        if(x1 > x2){
            float distanceX = x1 - x2;
        }
        else{
            float distanceX = x2 - x1;
        }
        if(y1 > y2){
            float distanceY = y1 - y2;
        }
        else{
            float distanceY = y2 - y1;
        }

        return 0;

    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
