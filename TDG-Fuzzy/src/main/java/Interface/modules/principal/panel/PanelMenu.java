package Interface.modules.principal.panel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PanelMenu extends JPanel {

    private JLabel lblTitleA;
    private JLabel lblTitleB;
    private JLabel lblTitleC;
    private JLabel lblTitleD;
    
    private JTextField txtTitleA;
    private JTextField txtTitleB;
    private JTextField txtTitleC;
    private JTextField txtTitleD;
    
    public PanelMenu() {
        initComponents();
        addComponents();
    }

    private void addComponents() {
        add(new JLabel());
        add(new JLabel());
        add(lblTitleA);
        add(txtTitleA);
        add(new JLabel());
        add(new JLabel());
        add(lblTitleB);
        add(txtTitleB);
        add(new JLabel());
        add(new JLabel());
        add(lblTitleC);
        add(txtTitleC);
        add(new JLabel());
        add(new JLabel());
        add(lblTitleD);
        add(txtTitleD);
        add(new JLabel());
        add(new JLabel());

    }

    private void initComponents() {
        initPanel();
        initLabels();
        initTextFields();
    }

    private void initTextFields() {
        txtTitleA = new JTextField();
        txtTitleB = new JTextField();
        txtTitleC = new JTextField();
        txtTitleD = new JTextField();
    }

    private void initLabels() {
        lblTitleA = new JLabel("    Parametro A :     ", SwingConstants.CENTER);
        lblTitleB = new JLabel("    Parametro B :     ", SwingConstants.CENTER);
        lblTitleC = new JLabel("    Parametro C :     ", SwingConstants.CENTER);
        lblTitleD = new JLabel("    Parametro D :     ", SwingConstants.CENTER);
    }

    private void initPanel() {
        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Opciones de la simulación"));
        setLayout(new GridLayout(9, 2));
    }
}
