/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Christopher
 */
public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn() {

    }

    public Barn(BulkTank tank) {
        this.tank = tank;

    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) throws IllegalStateException {
        if (robot == null) {
            throw new IllegalStateException();
        }
        robot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {
        if (robot == null) {
            throw new IllegalStateException();
        }
        for (Cow c : cows) {
            robot.milk(c);
        }
    }

    @Override
    public String toString() {
        return tank.toString();
    }

}
