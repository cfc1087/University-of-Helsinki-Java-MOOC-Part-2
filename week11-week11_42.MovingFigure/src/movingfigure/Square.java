/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Christopher
 */
public class Square extends Figure {

    private int length;

    public Square(int x, int y) {
        super(x, y);
    }

    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), length, length);
    }

}
