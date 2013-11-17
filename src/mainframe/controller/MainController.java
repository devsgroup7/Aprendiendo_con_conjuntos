/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe.controller;

import game.chooseset.controller.ChooseSetController;
import game.plataform.controller.PlataformController;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import mainframe.view.MainView;
import mainframe.controller.action.ExitApplicationAciton;
import mainframe.controller.action.SwapGameAction;

/**
 * La clase MainController.
 * 
 * Es la base de control de toda la aplicacion, inicializa acciones,
 * componentes y vistas, se encarga de proporcionar los recursos
 * necesarios a las controladores de juegos.
 *
 * @author Dan Joel Canqui Aviles
 */
public class MainController {

    /**
     * Almacena la vista general de la aplicacion.
     */
    private MainView mainView;
    /**
     * Almacena el controlador del juego que se esta ejecutando.
     */
    private GameController gameController;
    /**
     * Lista de acciones que intercambian la vista de juegos.
     */
    private List<Action> actionGames;
    /**
     * Finaliza la aplicacion principal.
     */
    private Action exitApplication;
    /**
     * Accion que situa la plataforma inicial a la vista de la aplicacion.
     */
    private Action comeBack;

    /**
     * Constructor que inicializa los componentes de la aplicacion.
     */
    public MainController() {
        gameController = new PlataformController();
        actionGames = new ArrayList<>();
        mainView = new MainView();
        fullScreenApplication();
        initiateActions();
        initComponents();
    }

    /**
     * Actualiza el controlador del juego ejecutarse.
     * Finaliza el juego anterior, y almacena el nuevo controlador.
     * 
     * @param newController Controlador del nuevo juego.
     */
    public final void updateController(GameController newController) {
        updateView(newController.getGameView());
        gameController.finishGame();
        gameController = newController;
    }

    /**
     * Este metodo inicializa la aplicacion.
     */
    public final void startApplication() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainView.pack();
                mainView.setVisible(true);
                gameController.startGame();
            }
        });
    }

    /**
     * Este metodo termina la aplacion.
     */
    public final void finishApplication() {
        gameController.finishGame();
        mainView.setVisible(false);
        mainView.dispose();
    }

    /**
     * Introduce en la aplicacion, la vista del juego a ejecutarse.
     *
     * @param newPanel vista del nuevo juego.
     */
    private void updateView(JPanel newPanel) {
        mainView.setContentPane(newPanel);
        mainView.revalidate();
    }

    /**
     * Inicializa las acciones de la aplicacion.
     */
    private void initiateActions() {
        comeBack = new SwapGameAction(this, gameController, "VOLVER");
        exitApplication = new ExitApplicationAciton(this, "SALIR");

        actionGames = new ArrayList<>();
        actionGames.add(new SwapGameAction(this, new ChooseSetController(comeBack), "CONJUNTO CORRECTO"));
        actionGames.add(new SwapGameAction(this, gameController, "JUEGO VANIA"));
        actionGames.add(new SwapGameAction(this, gameController, "JUEGO VICENTE"));
    }

    /**
     * Inicializa los componentes de la aplicacion.
     */
    private void initComponents() {
        PlataformController plataform = (PlataformController) gameController;
        plataform.buildView(actionGames, exitApplication);
        updateView(plataform.getGameView());
    }

    /**
     * Este metodo redimensiona la aplicacion a pantalla completa.
     */
    private void fullScreenApplication() {
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        DisplayMode display = new DisplayMode(1024, 768, 32, DisplayMode.REFRESH_RATE_UNKNOWN);
        GraphicsDevice device = environment.getDefaultScreenDevice();
        device.setFullScreenWindow(mainView);
        device.setDisplayMode(display);
    }
}
