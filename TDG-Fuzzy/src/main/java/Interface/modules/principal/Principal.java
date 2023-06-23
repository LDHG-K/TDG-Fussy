package Interface.modules.principal;

import Controllers.Controller;
import Domain.gateways.IController;
import Interface.modules.principal.panel.PanelAction;
import Interface.modules.principal.panel.PanelBanner;
import Interface.modules.principal.panel.PanelParams;
import Interface.modules.principal.panel.cards.PanelCardContainer;
import Interface.modules.service.Service;

import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {

    private PanelBanner banner;
    private PanelParams params;
    private PanelAction action;
    private PanelCardContainer cardContainer;

    private IController controller;

    private Service service;
    public Principal(IController controller) {
        this.controller = controller;
        this.service = new Service(controller);
        initComponents();
    }

    private void initComponents() {
        initFrameConfig();
        initPannels();
        setVisible(true);// Hacer visible la ventana (No colocar nada despúes o no será visible)
    }


    private void initFrameConfig(){
        setLayout(new BorderLayout());// Establecer el tipo de layout (tipo de distribución de los elementos)
        setTitle("Fuzzy Project");// Título de la ventana superior
        setSize(1280, 720); // Tamaño de la ventana
        setLocationRelativeTo(null);// Centrar la ventana en la pantalla
        setResizable(true);// No permitir que se cambie el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// Terminar el programa al cerrar la ventana
        requestFocusInWindow();// Establecer el foco en la ventana
    }

    private void initPannels(){

        // Banner
        banner = new PanelBanner();
        add(banner, BorderLayout.NORTH);

        // Params
        add(panelContainerParams(), BorderLayout.WEST);

        // Cards
        cardContainer = new PanelCardContainer(this);
        add(cardContainer, BorderLayout.CENTER);
    }

    private JPanel panelContainerParams() {
        params = new PanelParams();
        action = new PanelAction(this);
        JPanel container = new JPanel();
        container.setBackground(Color.WHITE);
        container.setLayout(new BorderLayout());
        container.add(params, BorderLayout.CENTER);
        container.add(action, BorderLayout.SOUTH);
        return container;
    }

    public PanelParams getPanelParams() {
        return params;
    }
    public PanelAction getPanelAction() {
        return action;
    }
    public PanelCardContainer getPanelCardContainer() {
        return cardContainer;
    }

    public IController getController() {
        return controller;
    }

    public Service getService() {
        return service;
    }
}
