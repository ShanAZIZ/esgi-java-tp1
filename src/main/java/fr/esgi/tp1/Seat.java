package fr.esgi.tp1;

public class Seat {
    private int id;
    private Train train;
    private boolean statut;

    public Seat(int id, Train leTrain, boolean statut ){
        this.id = id;
        this.train = leTrain;
        this.statut = statut;
    }

    public Seat(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }
}
