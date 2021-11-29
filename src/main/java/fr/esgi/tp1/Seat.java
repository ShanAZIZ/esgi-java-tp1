package fr.esgi.tp1;

public class Seat {
    private Reference id;
    private boolean isEmpty;

    public Seat(Reference id, boolean statut ){
        this.id = id;
        this.isEmpty = statut;
    }

    public Seat(Reference id){
        this.id = id;
        this.isEmpty = true;
    }

    public Seat(){

    }

    public Reference getId() {
        return id;
    }

    public void setId(Reference id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

}
