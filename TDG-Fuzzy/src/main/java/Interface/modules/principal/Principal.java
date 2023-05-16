package Interface.modules.principal;

import javax.swing.*;

public class Principal extends JFrame {


    public Principal() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Fuzzy Project");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
