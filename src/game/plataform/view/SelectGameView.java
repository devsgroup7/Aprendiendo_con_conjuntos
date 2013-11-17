package game.plataform.view;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * La clase que contendra los juegos a elegir, por el usuario.
 *
 * @author Dan Joel Canqui Aviles
 */
public class SelectGameView extends BaseMenuView {

    /**
     * Serial por defecto.
     */
    private static final long serialVersionUID = 1L;

    public SelectGameView() {
        super.identifier = "JUEGOS";
        super.backgroundImage =
                new ImageIcon("src/game/plataform/view/image/8.jpg").getImage();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    }

    /**
     * metodo que construira la ventana de seleccion de juego.
     */
    public void build(List<Action> games, Action comeBack) {
        add(titlePanel());
        add(listOfButtons(games));
        add(buttonGame(comeBack));
    }

    /**
     * Metodo que dara el titulo del panel.
     * 
     * @return a JPanel
     */
    private JPanel titlePanel() {
        JPanel result = new JPanel();
        result.add(new JLabel("SELECTED OF THE GAME"));
        result.setOpaque(false);
        return result;
    }

    /**
     * Metodo que genera los botons que se encontraran
     * en la ventana.
     * @return un JPanel
     */
    private JPanel listOfButtons(List<Action> games) {
        JPanel result = new JPanel();
        for (Action current: games) {
            result.add(buttonGame(current));
        }
        result.setOpaque(false);
        return result;
    }

    /**
     * Metodo que crea los botones personalizados.
     * 
     * @param path una String
     * @return un JButton
     */
    private JButton buttonGame(Action action) {
        JButton result = new JButton(action);
        result.setBorderPainted(false);
        return result;
    }
}
