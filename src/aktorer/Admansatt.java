package aktorer;

import main.Enhet2000X;
import medlemmer.Enhet;

/**
 * Created by Michael on 02.03.2016.
 */
public class Admansatt extends Ansatt
{
    public Admansatt(String fNavn, String eNavn, String ID)
    {
        super(fNavn, eNavn, ID);


    }

    @Override
    public String toString() {
        return "Admansatt: " + geteNavn() + ", " + getfNavn()  ;
    }
}
