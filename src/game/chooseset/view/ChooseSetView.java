/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.chooseset.view;

import game.chooseset.controller.Panel1;
import game.chooseset.controller.Panel2;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Dan Joel
 */
public class ChooseSetView extends JPanel {

    public static final Image BACKGROUD =
            new ImageIcon("src/game/chooseset/view/image/settings.jpg").getImage();
    private JPanel panel1;
    private JPanel panel2;
    private JPanel container;

    public void build(Action next, Action after, Action comeBack) {
        panel1 = new Panel1(next, comeBack);
        panel2 = new Panel2(after);
        container = panel1;
        add(container);
    }
    public final void setPanel1() {
        removeAll();
        add(panel1);
    }
    public final void setPanel2() {
        removeAll();
        add(panel2);
    }
}
