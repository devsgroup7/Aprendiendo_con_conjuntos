/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe.controller.action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import mainframe.controller.MainController;

/**
 *
 * @author Dan Joel Canqui Aviles.
 */
public class ExitApplicationAciton extends AbstractAction {

    private MainController mainController;

    public ExitApplicationAciton(MainController mainController, String name) {
        this.mainController = mainController;
        putValue(Action.NAME, name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainController.finishApplication();
    }
}
