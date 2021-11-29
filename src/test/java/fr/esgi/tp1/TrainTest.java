package fr.esgi.tp1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TrainTest {

    @Test
    public void should_create_train_and_retrieve_seats() throws Exception {
        Train train = new Train(3, 100);
        int count = 0;
        for (Car car : train.getCars()) {
            for (Seat seat : car.getSeats()) {
                count += 1;
            }
        }
        Assertions.assertEquals(train.getCruzeSpeed(), 100);
        Assertions.assertEquals(count, 30);
    }


}