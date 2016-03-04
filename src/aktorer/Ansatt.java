package aktorer;

import medlemmer.Enhet;

import java.util.ArrayList;

/**
 * Created by Michael on 02.03.2016.
 */
public class Ansatt extends Person{

    ArrayList<Enhet> enheter = new ArrayList<>();

    public Ansatt(String fNavn, String eNavn, String ID) {
        super(fNavn, eNavn, ID);
    }

    public ArrayList<Enhet> getEnheter() {
        return enheter;
    }

    public void setEnheter(ArrayList<Enhet> enheter) {
        this.enheter = enheter;
    }

    @Override
    public String toString() {
        return "Ansatt: " + geteNavn() + ", " + getfNavn()  ;
    }
}
