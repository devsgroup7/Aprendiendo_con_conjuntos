/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.chooseset.controller;

import game.chooseset.model.Cuadrado;
import game.chooseset.view.ChooseSetView;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.Timer;
import mainframe.controller.GameController;

/**
 *
 * @author Dan Joel Canqui Aviles.
 */
public class ChooseSetController implements GameController {

    private ChooseSetView chooseSetView;
    private Cuadrado cuadrado;
    private Timer timer;
    private Action next;
    private Action after;

    public ChooseSetController(Action comeBack) {
        cuadrado = new Cuadrado();
        buildChooseSetView();
        initiateActions();
        initiateTimer();
        chooseSetView.build(next, after, comeBack);
    }

    @Override
    public final JPanel getGameView() {
        return chooseSetView;
    }

    @Override
    public final void startGame() {
        timer.start();
    }

    @Override
    public final void finishGame() {
        timer.stop();
    }

    private void initiateActions() {
        next = new AbstractAction("next") {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseSetView.setPanel2();
                chooseSetView.revalidate();
            }
        };
        after = new AbstractAction("after") {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseSetView.setPanel1();
                chooseSetView.revalidate();
            }
        };
    }

    private void initiateTimer() {
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadrado.mover();
                chooseSetView.repaint();
            }
        });
    }

    private void buildChooseSetView() {
        chooseSetView = new ChooseSetView() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(ChooseSetView.BACKGROUD, 0, 0, this);
                cuadrado.paint(g);
            }
        };
    }
}
