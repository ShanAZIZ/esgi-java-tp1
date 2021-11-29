package fr.esgi.tp1;

public class Seat {
    private int id;
    private boolean statut;

    public Seat(int id, boolean statut ){
        this.id = id;
        this.statut = statut;
    }

    public Seat(int id){
        this.id = id;
        this.statut = true;
    }

    public Seat(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }
}
