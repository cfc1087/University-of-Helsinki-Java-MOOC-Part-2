package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField text = new JTextField("I was coped here from the JTextArea");
        container.add(text);
        JButton copyButton = new JButton("Copy!");
        JLabel label = new JLabel("");
        ActionEventListener  action  = new ActionEventListener(text, label);
        container.add(copyButton);
        container.add(label);
        copyButton.addActionListener(action);

    }

}
