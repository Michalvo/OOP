package medlemmer;

import java.util.ArrayList;

/**
 * Created by Michael on 02.03.2016.
 */
public class Enhet {
    private String navn;
    private String id;
    public static ArrayList<Enhet> enheter = new ArrayList<>();

    public Enhet(String navn, String id) {
        this.navn = navn;
        this.id = id;
        enheter.add(this);
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return navn + " " + id;
    }


}
