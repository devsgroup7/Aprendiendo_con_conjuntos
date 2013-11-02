/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.startgame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * En esta clase estara la ventana inicial es decir el logo del juego y el boton
 * de inicio al juego.s
 *
 * @author Vania Marisela Catorceno
 */
public class InitialView extends JPanel {
    /**
    * Serial por defecto.
    */
    private static final long serialVersionUID = 1L;
    /**
     * atributo que hara referencia al boton de inicio de la aplicacion.
     */
    private JButton buttonStart;
    /**
     * Atributo que hara referencia al logotipo de la aplicaion denomindo
     * "Aprendiendo con conjuntos".
     */
    private Image logoGame;

    public InitialView(Action startAction) {
        initComponents(startAction);
    }

    private void initComponents(Action startAction) {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridPanel = new GridBagConstraints();
        gridPanel.gridheight = 3;
        gridPanel.gridwidth = 3;
        gridPanel.gridx = 1;
        gridPanel.gridy = 1;

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 1, 30, 30));

        buttonPanel.setSize(300, 300);
        buttonPanel.setPreferredSize(buttonPanel.getSize());
        buttonStart = new JButton("Start");

        buttonPanel.add(buttonStart);
        this.add(buttonPanel);

        buttonStart.addActionListener(startAction);
    }
}
