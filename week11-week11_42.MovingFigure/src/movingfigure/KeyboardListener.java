/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Christopher
 */
public class KeyboardListener implements KeyListener {

    private Component c;
    private Figure figure;

    public KeyboardListener(Component c, Figure figure) {
        this.c = c;
        this.figure = figure;
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 1);
        }
        c.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
