
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout grid = new GridLayout(3, 1);
        container.setLayout(grid);
        JTextField out = new JTextField("0");
        out.setEnabled(false);
        JTextField input = new JTextField("0");
        container.add(out);
        container.add(input);
        JPanel panel = new JPanel();
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("Z");
        z.setEnabled(false);
        panel.add(plus);
        panel.add(minus);
        panel.add(z);
        panel.setLayout(new GridLayout(1, 3));

        ButtonListener listen = new ButtonListener(plus, minus, z, out, input);
        plus.addActionListener(listen);
        minus.addActionListener(listen);
        z.addActionListener(listen);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
