/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.chooseset.model;

import java.awt.Graphics;

/**
 *
 * @author Dan Joel
 */
public class Cuadrado {
    
    private static final int WIDTH = 75;
    private static final int HEIGHT = 25;
    private int positionX;
    private int positionY;
    private boolean volver;

    public Cuadrado() {
        volver = true;
    }
    public final void paint(Graphics graphic) {
        graphic.fillRect(positionX, positionY, WIDTH, HEIGHT);
    }
    public final void mover() {
        if (volver) {
            positionX += 5;
        } else {
            positionX -= 5;
        }
        if (positionX == 150) {
            volver = false;
        }
        if (positionX == 0) {
            volver = true;
        }
    }
}
