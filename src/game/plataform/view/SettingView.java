/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package game.plataform.view;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 * En esta ventana estara la vista de las opciones
 * de personalizacion al juego.
 *
 * @author Vania Marisela Catorceno Carballo
 */
public class SettingView extends BaseMenuView {

    private static final long serialVersionUID = 1L;

    public SettingView() {
        super.identifier = "OPCIONES";
        super.backgroundImage =
                new ImageIcon("src/game/plataform/view/image/setting.jpg").getImage();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    }
    
    public void build(Action comeBack) {
        add(createLabel("Musica"));
        add(createLabel("Sonido"));
        add(createCheckBox("Pantalla Completa"));
        add(createButton(comeBack));
    }

    private JLabel createLabel(String message) {
        JLabel result = new JLabel(message);
        return result;
    }
    
    private JCheckBox createCheckBox(String message) {
        JCheckBox result = new JCheckBox(message, true);
        return result;
    }
        
    private JButton createButton(Action action) {
        JButton result = new JButton(action);
        return result;
    }
}
