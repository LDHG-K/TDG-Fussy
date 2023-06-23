package Interface.modules.principal.panel.cards;

import Interface.modules.models.Card;
import Interface.modules.principal.Principal;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelCardContainer extends JPanel implements ActionListener {
    private JButton leftPanel;
    private JButton rightPanel;

    private Principal principal;

    private CardLayout cardLayout;

    private JPanel card;

    public PanelCardContainer(Principal principal) {
        this.principal = principal;
        initComponents();
        cardConfig();
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

        leftPanel.addActionListener(this);
        rightPanel.addActionListener(this);

        setActionEnabled(false);

        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);

    }

    private void cardConfig() {
        cardLayout = new CardLayout();
        card = new JPanel();
        card.setLayout(cardLayout);

        PanelCard panelCard = new PanelCard("Cultivos del proceso",
                "Ingresa los parametros iniciales para empezar",
                "",
                principal);

        panelCard.setActionEnabled(false);

        card.add(panelCard, "1");

        add(card, BorderLayout.CENTER);
    }

    private void fillCards(String A, String B, String C) {
        List<Card> infos = principal.getService().getCardsInfo(A, B, C);

        infos.forEach(info -> {
            PanelCard panelCard = new PanelCard(info.getPosition() + " - " + info.getTitle(),
                    info.getText(),
                    info.getImageName(),
                    principal);
            card.add(panelCard, info.getTitle());
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == leftPanel) {
            cardLayout.previous(card);
        }
        if (e.getSource() == rightPanel) {
            cardLayout.next(card);
        }
    }

    public void updateCards() {
        card.removeAll();
        fillCards(principal.getPanelParams().getTxtTitleA(),
                principal.getPanelParams().getTxtTitleB(),
                principal.getPanelParams().getTxtTitleC());
        card.revalidate();
        card.repaint();
    }

    public void setActionEnabled(boolean enabled) {
        leftPanel.setEnabled(enabled);
        rightPanel.setEnabled(enabled);
    }
}
