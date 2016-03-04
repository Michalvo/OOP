package gui;

import medlemmer.Enhet;

import javax.swing.*;

public class enhet extends JDialog {
    private JPanel contentPane;
    private JTextField idText;
    private JTextField navnText;
    private JButton eLagBtn;

    public enhet() {
        setContentPane(contentPane);
        setModal(true);

        eLagBtn.addActionListener(e ->
                {
                    new Enhet(navnText.getText(),idText.getText());
                    dispose();
                }
        );
    }


}
