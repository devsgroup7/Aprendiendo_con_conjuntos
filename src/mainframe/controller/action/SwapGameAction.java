/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe.controller.action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import mainframe.controller.GameController;
import mainframe.controller.MainController;

/**
 * La clase SwapGameAction.
 *
 * Es la responsable de actualizar los controladores de los juegos
 * en la aplicacion principal.
 *
 * @author Dan Joel Canqui Aviles
 */
public class SwapGameAction extends AbstractAction {

    /**
     * Controlador de la aplicacion.
     */
    private MainController mainController;
    /**
     * Controlador del juego a ejecutarse.
     */
    private GameController gameController;

    /**
     * Constructor por defecto que recive el controlador de la aplicacion
     * y el controlador del juego a ejecutarse.
     *
     * @param mainController Controlador de la aplicacion.
     * @param gameController Controlador del juego a ejecutarse.
     */
    public SwapGameAction(MainController mainController, GameController gameController,
            String name) {
        this.mainController = mainController;
        this.gameController = gameController;
        putValue(Action.NAME, name);
    }

    /**
     * Este metodo envia el controlador de un juego al controlador principal.
     *
     * @param e ActionEvent.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        mainController.updateController(gameController);
        gameController.startGame();
    }
}
