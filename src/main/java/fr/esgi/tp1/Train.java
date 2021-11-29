package fr.esgi.tp1;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private Reference ref;
    private List<Car> cars;
    private int cruzeSpeed;

    public Train(Reference ref, List<Car> cars, int cruzeSpeed) {
        this.ref = ref;
        this.cars = cars;
        this.cruzeSpeed = cruzeSpeed;
    }

    public Train(int numberOfCars, int cruzeSpeed) throws IllegalArgumentException {
        this.ref = new Reference();
        this.cars = new ArrayList<>();
        if(cruzeSpeed <= 0){
            throw new IllegalArgumentException("the speed must be > 0");
        }else {
            this.cruzeSpeed = cruzeSpeed;
        }
        if(numberOfCars < 3){
            numberOfCars = 3;
        }
        for(int i = 0; i <numberOfCars; i ++){
            Car car = new Car(new Reference(i));
            this.cars.add(car);
        }
    }


    public String book(){
        for(Car car : this.cars){
            for(Seat seat : car.getSeats()){
                if(seat.isEmpty()) {
                    seat.setIsEmpty(false);
                    return "Booking successfull";
                }
            }
        }
        return "No empty seat available";
    }

    public int getEmptySeats(){
        int count = 0;
        for(Car car : this.cars){
            for(Seat seat: car.getSeats()){
                if (seat.isEmpty()){
                    count += 1;
                }
            }
        }
        return count;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getCruzeSpeed() {
        return cruzeSpeed;
    }

    public void setCruzeSpeed(int cruzeSpeed) {
        this.cruzeSpeed = cruzeSpeed;
    }
}
