package fr.esgi.tp1;

import java.util.List;

public class Train {

    private Long ref;
    private List<Car> cars;
    private Float cruzeSpeed;

    public Train(Long ref, List<Car> cars, Float cruzeSpeed) {
        this.ref = ref;
        this.cars = cars;
        this.cruzeSpeed = cruzeSpeed;
    }

    public Train() {
    }
}
