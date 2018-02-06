package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        PersonalCalculator cal = new PersonalCalculator();
        UserInterface ui = new UserInterface(cal);
        SwingUtilities.invokeLater(ui);
    }
}
