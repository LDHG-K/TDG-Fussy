package Interface.modules.principal;

import Interface.modules.principal.panel.PanelAction;
import Interface.modules.principal.panel.PanelBanner;
import Interface.modules.principal.panel.PanelMenu;
import Interface.modules.principal.panel.cards.PanelCard;
import Interface.modules.principal.panel.cards.PanelCardContainer;

import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {

    private PanelBanner banner;
    private PanelMenu menu;
    private PanelAction action;
    private PanelCardContainer cardContainer;
    public Principal() {
        initComponents();
    }

    private void initComponents() {
        initFrameConfig();
        initPannels();
    }

    private void initFrameConfig(){
        setTitle("Fuzzy Project");// Título de la ventana superior
        setSize(1280, 720); // Tamaño de la ventana
        setLocationRelativeTo(null);// Centrar la ventana en la pantalla
        setResizable(true);// No permitir que se cambie el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// Terminar el programa al cerrar la ventana
        requestFocusInWindow();// Establecer el foco en la ventana
        setVisible(true);// Hacer visible la ventana
        setLayout(new BorderLayout());// Establecer el tipo de layout (tipo de distribución de los elementos)
    }

    private void initPannels(){
        banner = new PanelBanner();
        add(banner, BorderLayout.NORTH);
        menu = new PanelMenu();
        add(menu, BorderLayout.WEST);
        action = new PanelAction();
        add(action, BorderLayout.SOUTH);
        cardContainer = new PanelCardContainer();
        add(cardContainer, BorderLayout.CENTER);
    }
}
