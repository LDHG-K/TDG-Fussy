package Interface.modules.principal.panel;

import Interface.modules.principal.Principal;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAction extends JPanel implements ActionListener {

    private JButton btnAction;
    private Principal principal;

    public PanelAction(Principal principal) {
        this.principal = principal;
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(1, 1, 10, 10));
        setBackground(Color.WHITE);
        btnAction = new JButton("Generar");
        btnAction.addActionListener(this);
        add(btnAction, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAction)
            if (validateInputs()) {
                principal.getPanelCardContainer().setActionEnabled(true);
                principal.getPanelCardContainer().updateCards();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Ingrese todos los valores y en formato númerico",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
    }

    public boolean validateInputs() {
        String pattern = "^\\d+(\\.\\d+)?$";
        boolean inputA = principal.getPanelParams().getTxtTitleA().matches(pattern);
        boolean inputB = principal.getPanelParams().getTxtTitleB().matches(pattern);
        boolean inputC = principal.getPanelParams().getTxtTitleC().matches(pattern);
        boolean inputD = principal.getPanelParams().getTxtTitleD().matches(pattern);
        return inputA && inputB && inputC && inputD;
    }

}
