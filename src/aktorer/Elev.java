package aktorer;

import main.Enhet2000X;
import medlemmer.Enhet;
import medlemmer.Kull;

/**
 * Created by Michael on 02.03.2016.
 */

public class Elev extends Person{

    private Kull kull;
    private Enhet enhet;

    public Elev(String fNavn, String eNavn, String ID, Kull kull) {
        super(fNavn, eNavn, ID);
        this.kull = kull;

    }


    @Override
    public String toString() {
        return "Elev: " + geteNavn() + ", " + getfNavn()  ;
    }
}
