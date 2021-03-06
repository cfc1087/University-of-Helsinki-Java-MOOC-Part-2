package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

import static wormgame.Direction.DOWN;
import wormgame.domain.Apple;

import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        int x = width / 2;
        int y = height / 2;
        this.worm = new Worm(x, y, DOWN);

        this.apple = new Apple(new Random().nextInt(width), new Random().nextInt(height));

        if (apple.getX() == width / 2 && apple.getY() == height / 2) {
            this.apple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
        }
        addActionListener(this);
        setInitialDelay(2000);

    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            this.apple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
        }
        if (worm.runsIntoItself()) {
            continues = false;

        }
        if (worm.getHead().getX() == width || worm.getHead().getY() == height) {
            continues = false;
        }
        if (worm.getHead().getX() == 0 || worm.getHead().getY() == 0) {
            continues = false;
        }

        updatable.update();
        setDelay(1000 / worm.getLength());
    }

    public Worm getWorm() {
        return this.worm;

    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return this.apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

}
