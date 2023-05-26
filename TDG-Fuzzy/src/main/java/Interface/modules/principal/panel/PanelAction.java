package Interface.modules.principal.panel;

import javax.swing.*;

import java.awt.*;

public class PanelAction extends JPanel {

    private JButton btnAction;

    public PanelAction() {
        initComponents();
    }

    private void initComponents() {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        btnAction = new JButton("GENERAR");
        btnAction.setFont(new Font("Arial", Font.BOLD, 30));
        add(btnAction, BorderLayout.CENTER);
    }
}
