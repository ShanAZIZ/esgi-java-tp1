package fr.esgi.tp1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


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
    public void shoud_exection_two_identitical_gare_in_route(){
        Gare gare = new Gare(1L, 10, 10);
        try {
            Route route = new Route(gare, gare, 100);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception){
            exception.printStackTrace();
        }
    }


}