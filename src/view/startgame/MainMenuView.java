/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.startgame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * En la clase se mostrara el menu principal
 * del juego es decir la ventana principal luego de la
 * ventana.
 * 
 * @author Vicente Rodriguez.
 */
public class MainMenuView extends JPanel {
/**
 * Serial por defecto.
 */
private static final long serialVersionUID = 1L;

	public MainMenuView() {
		initComponents();
	}
	
	private final void initComponents(){
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridheight = 3;
		constraints.gridwidth = 3;
		constraints.gridx = 1;
		constraints.gridy = 1;
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(0, 1, 30, 30));
		
		buttonsPanel.setSize(400, 300);
		buttonsPanel.setPreferredSize(buttonsPanel.getSize());
		
		JButton gamesButton = new JButton("Games");
		JButton optionsButton = new JButton("Options");
		JButton exitButton = new JButton("Exit");
		
		buttonsPanel.add(gamesButton);
		buttonsPanel.add(optionsButton);
		buttonsPanel.add(exitButton);
		
		this.add(buttonsPanel, constraints);
	}
}

