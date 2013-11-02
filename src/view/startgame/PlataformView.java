/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.startgame;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JPanel;

/**
 * En esta clase estara el panel que ira cambiando segun
 * el usuario vaya navegando con las vistas.
 * Es decir volver atras avanzar a otra vista.
 * @author Vania Marisela Catorceno Carballo
 */
public class PlataformView extends JPanel {
/**
 * Serial por defecto.
 */
private static final long serialVersionUID = 1L;
    /**
     * el atributo hara referencia a la imagen de fondo
     * que estara en las ventanas principales del juego.
     */
    private Image backGround;
    
    public static final String LOGO = "Logo Game";
    public static final String SELECT = "Select Game";
    public static final String OPTION = "Option Game";
    public static final String SETTING = "Setting Game";
    /**
     * ContainerPanel, is the panel than container to all the other panel.
     */
    private JPanel containerPanel;

    public PlataformView() {
        containerPanel = new JPanel(new CardLayout());
        containerPanel.setPreferredSize(new Dimension(800, 700));
        containerPanel.setVisible(true);
    }
   
    public void build(JPanel gameLogo, JPanel selectGame, JPanel optionGame,
            JPanel settingGame) {

        containerPanel.add(gameLogo, LOGO);
        containerPanel.add(selectGame, SELECT);
        containerPanel.add(optionGame, OPTION);
        containerPanel.add(settingGame, SETTING);
    }
    
    public void showPanel(String identifier) {
        CardLayout layout = (CardLayout) containerPanel.getLayout();
        layout.show(containerPanel, identifier);
    }
}
