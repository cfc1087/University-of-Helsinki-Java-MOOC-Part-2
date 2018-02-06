/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

/**
 *
 * @author Christopher
 */
public class Piece {

    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean runsInto(Piece compared) {
        int x1 = this.getX();
        int y1 = this.getY();
        int x2 = compared.getX();
        int y2 = compared.getY();
        return x1 == x2 && y1 == y2;
    }



    @Override
    public String toString() {
        String s = String.format("(%d,%d)", getX(), getY());
        return s;
    }
}
