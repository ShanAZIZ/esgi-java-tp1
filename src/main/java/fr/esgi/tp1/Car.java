package fr.esgi.tp1;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int id;
    private List<Seat> seats;

    public Car(int id, List<Seat> seats) {
        this.id = id;
        this.seats = seats;
    }

    public Car(int id){
        this.id = id;
        this.seats = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Seat seat = new Seat(id);
            this.seats.add(seat);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
