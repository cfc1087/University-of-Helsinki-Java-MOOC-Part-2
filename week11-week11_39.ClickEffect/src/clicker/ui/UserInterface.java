package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator calc;

    public UserInterface() {

    }

    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        JButton click = new JButton("Click!");
       
        JLabel label = new JLabel(Integer.toString(calc.giveValue()));
        ClickListener listen = new ClickListener(calc, label);
        click.addActionListener(listen);
        container.add(label,BorderLayout.NORTH);
        container.add(click, BorderLayout.SOUTH);

    }

    public JFrame getFrame() {
        return frame;
    }
}
