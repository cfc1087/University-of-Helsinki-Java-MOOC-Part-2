/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;

import wormgame.game.WormGame;

/**
 *
 * @author Christopher
 */
public class DrawingBoard extends JPanel implements Updatable {

    private WormGame game;
    private int pieceLength;

    public DrawingBoard(WormGame game, int pieceLength) {
        this.game = game;
        this.pieceLength = pieceLength;
        super.setBackground(Color.gray);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Worm worm = game.getWorm();
        g.setColor(Color.BLACK);
        for (Piece p : worm.getPieces()) {
            int x = p.getX();
            int y = p.getY();
            g.fill3DRect(x*pieceLength, y*pieceLength, pieceLength, pieceLength, true);
        }
        Apple apple = game.getApple();
        int x = apple.getX();
        int y = apple.getY();
        g.setColor(Color.RED);
        g.fillOval(x*pieceLength, y*pieceLength, pieceLength, pieceLength);

    }

    @Override
    public void update() {
        super.repaint();
    }

}
