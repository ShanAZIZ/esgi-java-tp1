package fr.esgi.tp1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;


public class TrainTest {

    @Test
    public void should_create_train_and_retrieve_seats() {
        try {
            Train train = new Train(3, 100);
            int count = 0;
            for (Car car : train.getCars()) {
                for (Seat seat : car.getSeats()) {
                    count += 1;
                }
            }
            Assertions.assertEquals(100, train.getCruzeSpeed());
            Assertions.assertEquals(30, count);
            Assertions.assertEquals(30, train.getEmptySeats());
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    @Test
    public void shoud_book_seat() throws IllegalArgumentException {
        try {
            Train train = new Train(3, 100);
            train.book();
            Assertions.assertFalse(train.getCars().get(0).getSeats().get(0).isEmpty());
            Assertions.assertEquals(29, train.getEmptySeats());
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }

    @Test
    public void should_create_route_and_verify_distance(){
        Gare gare = new Gare(1L, (new Position(10, 10)));
        Gare gare2 = new Gare(2L, (new Position(19, 25)));
        try {
            Route route = new Route(gare, gare2);
            Assertions.assertEquals(100, route.getDistance());
            Assertions.fail();
        }
        catch (IllegalArgumentException exception){
            exception.printStackTrace();
        }

    }

    @Test
    public void shoud_throw_exection_when_two_identitical_gare_in_route(){
        Gare gare = new Gare(1L, (new Position(10, 10)));
        Gare gare2 = new Gare(1L, (new Position(10, 10)));
        try {
            Route route = new Route(gare, gare2);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception){
            exception.printStackTrace();
        }
    }

    @Test
    public void should_create_trip_and_verify_distance() {
        try {
            Gare gare = new Gare(1L, (new Position(10, 10)));
            Gare gare2 = new Gare(2L, (new Position(125, 143)));
            Route route = new Route(gare, gare2);
            Train train = new Train(3, 100);
            Trip trip = new Trip(train, LocalDateTime.now(), route);
            Assertions.assertEquals(5, trip.getDuration());

        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

}