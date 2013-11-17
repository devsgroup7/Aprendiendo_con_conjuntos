package view;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Clase base de la aplicaion el JFrame
 * que contendra los paneles necesarios de la aplicacion.
 * 
 * @author Dan Joel Canqui Aviles
 */
public class MainView extends JFrame {
/**
 * Serial por defecto.
 */
private static final long serialVersionUID = 1L;

    public MainView() {
        super("Aprendiendo con los conjuntos");
        final int widthFrame = 900;
        final int heighFrame = 500;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(widthFrame, heighFrame));
    }

}
