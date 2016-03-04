package aktorer;

import main.Enhet2000X;
import medlemmer.Kull;

import java.util.ArrayList;

/**
 * Created by Michael on 02.03.2016.
 */
public class Fagansatt extends Ansatt{
/**
 *
 */
    private ArrayList<Kull> kull = new ArrayList<>();

    public Fagansatt(String fNavn, String eNavn, String ID) {
        super(fNavn, eNavn, ID);


    }

    public ArrayList<Kull> getKull() {
        return kull;
    }

    public void setKull(ArrayList<Kull> kull) {
        this.kull = kull;
    }


}
