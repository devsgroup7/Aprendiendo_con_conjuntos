/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe.controller;

import javax.swing.JPanel;

/**
 *
 * @author Dan Joel
 */
public interface GameController {

    /**
     * Retorna la vista principlal donde se visualiza el juego.
     *
     * @return el panel contenedor del juego.
     */
    JPanel getGameView();

    /**
     * Inicializa el juego.
     */
    void startGame();

    /**
     * Finaliza el juego reiniciando todos sus componentes.
     */
    void finishGame();
}
