/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.plataform.view;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author Dan Joel
 */
public class AboutView extends BaseMenuView {

    private static final long serialVersionUID = 1L;

    public AboutView() {
        super.identifier = "ACERCA";
        super.backgroundImage =
                new ImageIcon("src/game/plataform/view/image/about.jpg").getImage();
    }

    public final void build(Action comeback) {
        add(new JButton(comeback));
    }
}
