package Interface.modules.principal.panel.cards;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCardContainer extends JPanel {

    private PanelCard panelCard;
    private JButton leftPanel;
    private JButton rightPanel;

    public PanelCardContainer() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setBorder(new TitledBorder("Cultivos Analizados"));
        setBackground(Color.WHITE);

        Image icon = new ImageIcon("src/main/java/Interface/utils/icons/chevron-left.png").getImage();
        ImageIcon imgL = new ImageIcon(icon.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        Image icon2 = new ImageIcon("src/main/java/Interface/utils/icons/chevron-right.png").getImage();
        ImageIcon imgR = new ImageIcon(icon2.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        leftPanel = new JButton(imgL);
        rightPanel = new JButton(imgR);

        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);

        PanelCard panelCard = new PanelCard("Cultivo Papa", "Texto ejemplo para la papa.", "potato.png");
        add(panelCard, BorderLayout.CENTER);

    }
}
