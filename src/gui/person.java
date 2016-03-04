package gui;

import aktorer.Admansatt;
import aktorer.Elev;
import aktorer.Fagansatt;
import aktorer.Person;
import medlemmer.Kull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class person extends JDialog {
    private JPanel contentPane;
    private JTextField fornavnText;
    private JTextField etternavnText;
    private JTextField idText;
    private JButton pLagBtn;
    private JComboBox kullCb;
    private JComboBox aktorCb;

    public person() {
        setContentPane(contentPane);
        setModal(true);
        kull ();
        aktor();
        kullCb.setEnabled(false);

        pLagBtn.addActionListener(e ->
        {
            String selected = aktorCb.getSelectedItem().toString();
            if (selected.equals(Elev.class.getSimpleName()))
            {
                new Elev(fornavnText.getText(),etternavnText.getText(),idText.getText(),(Kull) kullCb.getSelectedItem());
            }
            else if (selected.equals(Fagansatt.class.getSimpleName()))
            {
                new Fagansatt(fornavnText.getText(),etternavnText.getText(),idText.getText());
            }
            else if (selected.equals(Admansatt.class.getSimpleName()))
            {
                new Admansatt(fornavnText.getText(),etternavnText.getText(),idText.getText());
            }
            dispose();
        }
        );
        aktorCb.addActionListener(e -> {

            if(aktorCb.getSelectedItem().toString().equals(Elev.class.getSimpleName()))
            {
                kullCb.setEnabled(true);
            }
            else
            {
                kullCb.setEnabled(false);
            }
        });
    }


    private void kull ()
    {
        for(Kull k : Kull.kull)
        {
          kullCb.addItem(k);
        }
    }

    private void aktor ()
    {
        String[] aktorer = new String[] {Admansatt.class.getSimpleName(), Fagansatt.class.getSimpleName(), Elev.class.getSimpleName()};
        for (String s : aktorer)
        {
            aktorCb.addItem(s);
        }

    }
}
