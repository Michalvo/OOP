package gui;

import javax.swing.*;

public class gui extends JDialog {
    private JPanel contentPane;
    private JButton nyEnhetBtn;
    private JButton nyttKullBtn;
    private JButton seEksBtn;
    private JButton nyPersonBtn;


    public gui() {
        setContentPane(contentPane);
        setModal(true);
        setTitle("Lag ny");


        nyEnhetBtn.addActionListener(e ->
        {
            enhet enhet = new enhet();
            enhet.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            enhet.setBounds(710,200,400,400);
            enhet.setVisible(true);
        }
        );
        nyttKullBtn.addActionListener(e ->
        {
            kull kull = new kull();
            kull.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            kull.setBounds(710,200,400,400);
            kull.setVisible(true);
        }
        );
        nyPersonBtn.addActionListener(e ->
        {
            person person = new person();
            person.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            person.setBounds(710,200,400,400);
            person.setVisible(true);
        }
        );
        seEksBtn.addActionListener(e ->
        {
            eksisterende eks = new eksisterende();
            eks.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            eks.setBounds(710,200,400,400);
            eks.setVisible(true);
        }
        );
    }


}
