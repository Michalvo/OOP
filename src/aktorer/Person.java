package aktorer;

import java.util.ArrayList;

/**
 * Created by Michael on 02.03.2016.
 */
public class Person {

    private String fNavn;
    private String eNavn;
    private String ID;
    public static ArrayList<Person> personer = new ArrayList<>();

    public Person(String fNavn, String eNavn, String ID) {
        this.fNavn = fNavn;
        this.eNavn = eNavn;
        this.ID = ID;
        this.personer.add(this);
    }

    public String getfNavn() {
        return fNavn;
    }

    public void setfNavn(String fNavn) {
        this.fNavn = fNavn;
    }

    public String geteNavn() {
        return eNavn;
    }

    public void seteNavn(String eNavn) {
        this.eNavn = eNavn;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
