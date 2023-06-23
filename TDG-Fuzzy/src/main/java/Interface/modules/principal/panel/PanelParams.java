package Interface.modules.principal.panel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelParams extends JPanel {

    private JLabel lblTitleA;
    private JLabel lblTitleB;
    private JLabel lblTitleC;
    private JLabel lblTitleD;
    
    private JTextField txtTitleA;
    private JTextField txtTitleB;
    private JTextField txtTitleC;
    private JTextField txtTitleD;
    
    public PanelParams() {
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
        lblTitleA = new JLabel("\t Párametro A :\t ", SwingConstants.CENTER);
        lblTitleB = new JLabel("\t Párametro B :\t ", SwingConstants.CENTER);
        lblTitleC = new JLabel("\t Párametro C :\t ", SwingConstants.CENTER);
        lblTitleD = new JLabel("\t Párametro D :\t ", SwingConstants.CENTER);
    }

    private void initPanel() {
        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Opciones de la simulación"));
        //setLayout(new GridLayout(9, 2));
        setLayout(new GridLayout(9, 2, 10, 10));
    }

    public String getTxtTitleA() {
        return txtTitleA.getText();
    }

    public String getTxtTitleB() {
        return txtTitleB.getText();
    }

    public String getTxtTitleC() {
        return txtTitleC.getText();
    }

    public String getTxtTitleD() {
        return txtTitleD.getText();
    }

    public void clearTextBoxs() {
        txtTitleA.setText("");
        txtTitleB.setText("");
        txtTitleC.setText("");
        txtTitleD.setText("");
    }

    public void unableTextBoxs() {
        txtTitleA.setEnabled(false);
        txtTitleB.setEnabled(false);
        txtTitleC.setEnabled(false);
        txtTitleD.setEnabled(false);
    }

    public void enableTextBoxs() {
        txtTitleA.setEnabled(true);
        txtTitleB.setEnabled(true);
        txtTitleC.setEnabled(true);
        txtTitleD.setEnabled(true);
    }

}
