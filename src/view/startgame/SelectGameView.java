/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.startgame;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * La clase que contendra los juegos a elegir, por el usuario.
 *
 * @author Dan Joel Canqui Aviles
 */
public class SelectGameView extends JPanel {

    /**
     * Serial por defecto.
     */
    private static final long serialVersionUID = 1L;

    public SelectGameView() {
        build();
    }

    /**
     * metodo que construira la ventana de seleccion de juego.
     */
    private void build() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(titlePanel());
        panel.add(listOfButtons());
        add(panel);
    }
    
    /**
     * Metodo que dara el titulo del panel.
     * 
     * @return a JPanel
     */
    private JPanel titlePanel() {
        JPanel result = new JPanel();
        result.setPreferredSize(new Dimension(500, 35));
        result.add(new JLabel("SELECTED OF THE GAME"));
        return result;
    }

    /**
     * Metodo que genera los botons que se encontraran
     * en la ventana.
     * @return un JPanel
     */
    private JPanel listOfButtons() {
        JPanel result = new JPanel(new GridLayout(1, 3, 25, 0));
        result.add(buttonGame("PIENSA RAPIDO"));
        result.add(buttonGame("CUANTO SABES DE CONJUNTOS"));
        result.add(buttonGame("ARRASTRA AL CONJUNTO CORRECTO"));
        return result;
    }

    /**
     * Metodo que crea los botones personalizados.
     * 
     * @param path una String
     * @return un JButton
     */
    private JButton buttonGame(String path) {
        JButton result = new JButton(path);
        result.setPreferredSize(new Dimension(250, 450));
        result.setBorderPainted(false);
        return result;
    }
}
