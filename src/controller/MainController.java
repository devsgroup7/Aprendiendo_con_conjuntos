/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import view.MainView;
import view.startgame.PlataformView;

/**
 * La clase sera el controlador de la clase principal, el JFrame.
 * 
 * @author Dan Joel Canqui Aviles
 */
public class MainController {
    /**
     * Atributo que hace referencia al JFrame.
     */
    private MainView mainView;

    /**
     * metodo constructor que inicializa
     * el panel base.
     */
    public MainController() {
        mainView = new MainView();
        updateView(new PlataformView());
        showView();
    }

    /**
     * metodo que carga el panel base
     * que contendra el resto de los paneles.
     * @param newPanel 
     */
    public void updateView(JPanel newPanel) {
        mainView.setContentPane(newPanel);
    }

    /**
     * Metodo que hace visible la vista principal.
     */
    private void showView() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainView.pack();
                mainView.setLocationRelativeTo(null);
                mainView.setVisible(true);
            }
        });
    }
}
