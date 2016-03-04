package medlemmer;

import aktorer.Fagansatt;

import java.util.ArrayList;

/**
 * Created by Michael on 02.03.2016.
 */
public class Kull {

    public static ArrayList<Kull> kull = new ArrayList<>();

    private String startaar;
    private Fagansatt ansvarlig;

    public Kull(String startaar, Fagansatt ansvarlig) {
        this.startaar = startaar;
        this.ansvarlig = ansvarlig;
        this.kull.add(this);
        this.ansvarlig.getKull().add(this);
    }

    public String getStartaar() {
        return startaar;
    }

    public void setStartaar(String startaar) {
        this.startaar = startaar;
    }

    public Fagansatt getAnsvarlig() {
        return ansvarlig;
    }

    public void setAnsvarlig(Fagansatt ansvarlig) {
        this.ansvarlig = ansvarlig;
    }

    @Override
    public String toString() {
        return "Kull : " + startaar + ", " + ansvarlig;
    }
}
