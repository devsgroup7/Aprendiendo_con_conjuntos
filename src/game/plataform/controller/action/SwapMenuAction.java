/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.plataform.controller.action;

import game.plataform.controller.PlataformController;
import game.plataform.view.BaseMenuView;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * Clase que se encargara de cambiar los paneles
 *
 * @author Vania Catorceno
 */
public class SwapMenuAction extends AbstractAction {

    private PlataformController plataformController;
    private BaseMenuView menuView;

    public SwapMenuAction(PlataformController controller, BaseMenuView menu) {
        putValue(Action.NAME, menu.getIdentifier());
        plataformController = controller;
        menuView = menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        plataformController.updateView(menuView.getBackgroundImage(), menuView);
    }
}
