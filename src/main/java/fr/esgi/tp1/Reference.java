package fr.esgi.tp1;

import java.time.LocalDateTime;

public class Reference {

    private int reference;

    public Reference(int reference) {
        this.reference = reference;
    }

    public Reference(){
        this.reference = LocalDateTime.now().getSecond();
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}
