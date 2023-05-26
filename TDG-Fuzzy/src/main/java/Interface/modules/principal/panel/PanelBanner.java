package Interface.modules.principal.panel;

import javax.swing.*;
import java.awt.*;

public class PanelBanner extends JPanel {

    public PanelBanner() {
        initPanel();
    }

    private void initPanel() {
        setBackground(Color.WHITE);
        ImageIcon icono = new ImageIcon("src/main/java/Interface/utils/test-banner.png");
        JLabel imagen = new JLabel("", SwingConstants.CENTER);
        imagen.setIcon(icono);

        add(imagen);
    }

}
