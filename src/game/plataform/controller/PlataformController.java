/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.plataform.controller;

import game.plataform.controller.action.SwapMenuAction;
import game.plataform.view.AboutView;
import game.plataform.view.InitialMenuView;
import java.util.List;
import javax.swing.Action;
import javax.swing.JPanel;
import game.plataform.view.PlataformView;
import game.plataform.view.SelectGameView;
import game.plataform.view.SettingView;
import java.awt.Graphics;
import java.awt.Image;
import mainframe.controller.GameController;

/**
 *
 * @author Dan Joel Canqui Aviles.
 */
public class PlataformController implements GameController {

    private PlataformView plataformView;
    private InitialMenuView initialMenuView;
    private SelectGameView selectGameView;
    private SettingView settingsView;
    private AboutView aboutView;

    public PlataformController() {
        buildPlataformView();
        initialMenuView = new InitialMenuView();
        selectGameView = new SelectGameView();
        settingsView = new SettingView();
        aboutView = new AboutView();
    }

    public final void buildView(List<Action> games, Action exit) {
        Action initialMenu = new SwapMenuAction(this, initialMenuView);
        Action settings = new SwapMenuAction(this, settingsView);
        Action select = new SwapMenuAction(this, selectGameView);
        Action about = new SwapMenuAction(this, aboutView);

        initialMenuView.build(select, settings, about, exit);
        selectGameView.build(games, initialMenu);
        settingsView.build(initialMenu);
        aboutView.build(initialMenu);

        updateView(initialMenuView.getBackgroundImage(), initialMenuView);
    }

    public final void updateView(Image backgroud, JPanel newView) {
        plataformView.setBackgroudImage(backgroud);
        plataformView.updateView(newView);
        plataformView.repaint();
        plataformView.revalidate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final JPanel getGameView() {
        return plataformView;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final void startGame() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final void finishGame() {
    }

    private void buildPlataformView() {
        plataformView = new PlataformView(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getBackgroudImage(), 0, 0, this);
            }
        };
    }
}
