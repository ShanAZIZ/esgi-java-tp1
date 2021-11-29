package fr.esgi.tp1;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Reference id;
    private List<Seat> seats;

    public Car(Reference id, List<Seat> seats) {
        this.id = id;
        this.seats = seats;
    }

    public Car(Reference id){
        this.id = id;
        this.seats = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Seat seat = new Seat(id);
            this.seats.add(seat);
        }
    }

    public Reference getId() {
        return id;
    }

    public void setId(Reference id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
