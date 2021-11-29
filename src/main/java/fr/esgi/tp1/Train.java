package fr.esgi.tp1;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private Reference ref;
    private List<Car> cars;
    private Float cruzeSpeed;

    public Train(Reference ref, List<Car> cars, Float cruzeSpeed) {
        this.ref = ref;
        this.cars = cars;
        this.cruzeSpeed = cruzeSpeed;
    }

    public Train(int numberOfCars, int cruzeSpeed) throws Exception {
        this.ref = new Reference();
        this.cars = new ArrayList<>();
        if(cruzeSpeed <= 0){
            throw new IllegalArgumentException("the speed must be > 0");
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
                if(seat.isStatut()) {
                    seat.setStatut(false);
                    return "Booking successfull";
                }
            }
        }
        return "No empty seat available";
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Float getCruzeSpeed() {
        return cruzeSpeed;
    }

    public void setCruzeSpeed(Float cruzeSpeed) {
        this.cruzeSpeed = cruzeSpeed;
    }
}
