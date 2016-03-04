package gui;

import aktorer.Fagansatt;
import aktorer.Person;
import medlemmer.Kull;

import javax.swing.*;

public class kull extends JDialog {
    private JPanel contentPane;
    private JTextField startÅrText;
    private JButton kLagBtn;
    private JComboBox fagAnsvarligCb;


    public kull() {
        setContentPane(contentPane);
        setModal(true);
        ansvarlig ();


        kLagBtn.addActionListener(e ->
        {
           new Kull(startÅrText.getText(),(Fagansatt) fagAnsvarligCb.getSelectedItem());
            dispose();
        }
        );
    }

    private void ansvarlig ()
    {
        for(Person p : Person.personer)
        {
            if(p instanceof Fagansatt)
            {
                fagAnsvarligCb.addItem(p);
            }
        }
    }

}
