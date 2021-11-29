package fr.esgi.tp1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Trip {
    private Train train;
    private LocalDateTime time;
    private Route route;
    private Duration duration;

    public Trip(Train train, LocalDateTime time, Route route) {
        this.train = train;
        this.time = time;
        this.route = route;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
