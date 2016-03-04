package gui;

import aktorer.Person;
import medlemmer.Enhet;
import medlemmer.Kull;

import javax.swing.*;

public class eksisterende extends JDialog {
    private JPanel contentPane;
    private JButton kHentBtn;
    private JButton pHentBtn;
    private JButton eHentBtn;
    private JButton tilbakeBtn;
    private JList eList;

    private DefaultListModel<Person> personModel = new DefaultListModel<>();
    private DefaultListModel<Kull> kullModel = new DefaultListModel<>();
    private DefaultListModel<Enhet> enhetsModel = new DefaultListModel<>();


    public eksisterende() {
        setContentPane(contentPane);
        setModal(true);
        lagJList();

        kHentBtn.addActionListener(e ->
        {
            eList.setModel(kullModel);
        }
        );
        eHentBtn.addActionListener(e ->
        {
            eList.setModel(enhetsModel);
        }
        );
        pHentBtn.addActionListener(e ->
        {
            eList.setModel(personModel);
        }
        );
        tilbakeBtn.addActionListener(e ->
        {
            dispose();
        }
        );
    }

    public void lagJList(){
        personModel.removeAllElements();
        kullModel.removeAllElements();
        enhetsModel.removeAllElements();

        for (Person p: Person.personer )
        {
            personModel.addElement(p);
        }

        for (Kull k: Kull.kull)
        {
            kullModel.addElement(k);
        }
        for (Enhet e: Enhet.enheter)
        {
            enhetsModel.addElement(e);
        }
    }


}
