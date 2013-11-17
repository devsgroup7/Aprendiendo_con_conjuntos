/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.plataform.view;

import java.awt.Dimension;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Dan Joel Canqui Aviles.
 */
public class InitialMenuView extends BaseMenuView {

    private static final long serialVersionUID = 1L;
    private static final float ALIGNMENT = 0.975f;
    /**
     * el atributo hara referencia a la imagen de fondo que estara en las
     * ventanas principales del juego.
     */
    private Dimension separator;

    public InitialMenuView() {
        super.identifier = "MENU";
        super.backgroundImage =
                new ImageIcon("src/game/plataform/view/image/logo.jpg").getImage();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        separator = new Dimension(0, 30);
    }

    public void build(Action game, Action setting, Action about, Action exit) {
        add(Box.createRigidArea(separator));
        add(createButton(about));
        add(Box.createVerticalGlue());
        add(createButton(game));
        add(Box.createRigidArea(separator));
        add(createButton(setting));
        add(Box.createRigidArea(separator));
        add(createButton(exit));
        add(Box.createRigidArea(separator));
    }

    private JButton createButton(Action action) {
        JButton result = new JButton(action);
        result.setAlignmentX(ALIGNMENT);
        return result;
    }
}
