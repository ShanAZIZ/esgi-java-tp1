package fr.esgi.tp1;

public class Seat {
    private Reference id;
    private boolean statut;

    public Seat(Reference id, boolean statut ){
        this.id = id;
        this.statut = statut;
    }

    public Seat(Reference id){
        this.id = id;
        this.statut = true;
    }

    public Seat(){

    }

    public Reference getId() {
        return id;
    }

    public void setId(Reference id) {
        this.id = id;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }
}
