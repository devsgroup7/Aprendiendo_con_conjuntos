package mainframe.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * La clase MainView.
 * 
 * Es la vista principal de la aplicaion, que contiene
 * las vista de los juegos que se ejecutaran.
 * 
 * @author Dan Joel Canqui Aviles
 */
public class MainView extends JFrame {

    /**
     * Serial por defecto.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor por defecto que configura las propiedades de la aplicacion.
     */
    public MainView() {
        setPreferredSize(new Dimension(1024, 768));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setForeground(Color.BLACK);
        setUndecorated(true);
        setResizable(false);
    }
}
