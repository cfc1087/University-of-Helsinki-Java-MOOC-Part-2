/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;
import static wormgame.Direction.DOWN;
import static wormgame.Direction.LEFT;
import static wormgame.Direction.RIGHT;
import static wormgame.Direction.UP;

/**
 *
 * @author Christopher
 */
public class Worm {

    private int x;
    private int y;
    private Direction direction;
    private List<Piece> pieces;
    private Piece newPiece;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(originalX, originalY));
        this.grow = false;

    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return this.pieces.size();
    }

    public List<Piece> getPieces() {
        return this.pieces;
    }

    public Piece getHead() {

        return this.pieces.get(pieces.size() - 1);
    }

    public void move() {

        int x = getHead().getX();
        int y = getHead().getY();
        if (grow) {
            newPiece = new Piece(x, y);
            pieces.add(newPiece);

        }
        if (null != direction) {
            switch (direction) {
                case RIGHT:
                    newPiece = new Piece(x + 1, y);
                    break;
                case LEFT:
                    newPiece = new Piece(x - 1, y);
                    break;
                case UP:
                    newPiece = new Piece(x, y - 1);
                    break;
                case DOWN:
                    newPiece = new Piece(x, y + 1);
                    break;
                default:
                    break;
            }
        }

        if (getLength() < 3) {
            pieces.add(newPiece);
        } else if (getLength() >= 3 && !grow) {
            pieces.add(newPiece);
            pieces.remove(0);

        }
        if (grow) {

            pieces.remove(pieces.size() - 1);
            pieces.add(newPiece);
            grow = false;
        }

    }

    public void grow() {
        grow = true;
    }

    public boolean runsInto(Piece piece) {
        for (int i = 0; i < pieces.size() ; i++) {
            if (pieces.get(i).runsInto(piece)) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {

        for (int i = 0; i < pieces.size() - 1; i++) {
            if (getHead().runsInto(pieces.get(i))) {
                return true;
            }
        }
        return false;

    }

}
