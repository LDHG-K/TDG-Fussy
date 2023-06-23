package Interface.modules.principal.panel.cards;

import Interface.modules.principal.Principal;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelCard extends JPanel implements ActionListener
{

    private JLabel lblImage;
    private JLabel lblText;
    private JButton btnAction;

    private String title;
    private String text;
    private String imageName;
    private Principal principal;

    public PanelCard(String title, String text, String imageName, Principal principal) {
        this.principal = principal;
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

        btnAction.addActionListener(this);

        Image icon = new ImageIcon("src/main/java/Interface/utils/icons/"+imageName).getImage();
        ImageIcon img = new ImageIcon(icon.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        lblImage.setIcon(img);

        add(lblImage, BorderLayout.NORTH);
        add(lblText, BorderLayout.CENTER);
        add(btnAction, BorderLayout.SOUTH);

     }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAction) {
            principal.setEnabled(false);
            int opcion = JOptionPane.showOptionDialog(null,
                    "¿Deseas ver los detalles del cultivo " + (title.split("-")[1]).trim() + " ?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Aceptar", "Cancelar"},
                    "Aceptar");

            if (opcion == JOptionPane.YES_OPTION) {
                // Acción al hacer clic en "Aceptar"
                JOptionPane.showMessageDialog(null, "Aqui se llama a la nueva pantalla, en progreso...");
                principal.setEnabled(true);
                // INICIAR AQUI LA VENTANA DE DETALLES
            } else if (opcion == JOptionPane.NO_OPTION) {
                // Acción al hacer clic en "Cancelar"
                principal.setEnabled(true);
            }
        }
    }

    public void setActionEnabled(boolean enabled) {
        btnAction.setEnabled(enabled);
    }
}
