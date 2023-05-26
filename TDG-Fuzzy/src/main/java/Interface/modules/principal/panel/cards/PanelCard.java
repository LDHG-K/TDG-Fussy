package Interface.modules.principal.panel.cards;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCard extends JPanel {

    private JLabel lblImage;
    private JLabel lblText;
    private JButton btnAction;

    private String title;
    private String text;
    private String imageName;

    public PanelCard(String title, String text, String imageName) {

        this.title = title;
        this.text = text;
        this.imageName = imageName;


        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        setBackground(Color.WHITE);
        setBorder(new TitledBorder(title));

        lblImage = new JLabel("", SwingConstants.CENTER);
        lblText = new JLabel(text, SwingConstants.CENTER);
        btnAction = new JButton("Ver Estudio");

        Image icon = new ImageIcon("src/main/java/Interface/utils/icons/"+imageName).getImage();
        ImageIcon img = new ImageIcon(icon.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        lblImage.setIcon(img);

        add(lblImage, BorderLayout.NORTH);
        add(lblText, BorderLayout.CENTER);
        add(btnAction, BorderLayout.SOUTH);

     }
}
