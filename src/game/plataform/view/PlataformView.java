/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.plataform.view;

import java.awt.Image;
import javax.swing.JPanel;

/**
 * En esta clase estara el panel que ira cambiando segun el usuario vaya
 * navegando con las vistas. Es decir volver atras avanzar a otra vista.
 *
 * @author Vania Marisela Catorceno Carballo
 */
public class PlataformView extends JPanel {

    /**
     * Serial por defecto.
     */
    private static final long serialVersionUID = 1L;
    private Image backgroundImage;

    public final void updateView(JPanel newView) {
        removeAll();
        add(newView);
    }

    public final Image getBackgroudImage() {
        return backgroundImage;
    }

    public final void setBackgroudImage(Image newBackground) {
        backgroundImage = newBackground;
    }
}
