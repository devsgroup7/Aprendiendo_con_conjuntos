/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.plataform.view;

import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Dan Joel
 */
public abstract class BaseMenuView extends JPanel {
    
    protected String identifier;
    protected Image backgroundImage;

    public BaseMenuView() {
        setOpaque(false);
    }

    public final String getIdentifier() {
        return identifier;
    }

    public final Image getBackgroundImage() {
        return backgroundImage;
    }

}
