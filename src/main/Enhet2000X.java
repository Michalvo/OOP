package main;


import aktorer.Admansatt;
import aktorer.Elev;
import aktorer.Fagansatt;
import aktorer.Person;
import medlemmer.Enhet;
import medlemmer.Kull;
import gui.gui;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Michael on 02.03.2016.
 */
public class Enhet2000X
{


    public static void main(String[] args)
    {
        Fagansatt fa1 = new Fagansatt("Per","Bisseberg","1");
        Kull k1 = new Kull("1994",fa1);
        Enhet e1 = new Enhet("mobil","1");
        Elev el1 = new Elev("Daniel","Danielsen","1",k1);
        Elev el2 = new Elev("Thomas","Thomasen","2",k1);
        Admansatt adm1 = new Admansatt("Petter","Pettersen","1");

        gui gui = new gui();
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        gui.setBounds(710,200,400,400);
        gui.setVisible(true);


    }
}
