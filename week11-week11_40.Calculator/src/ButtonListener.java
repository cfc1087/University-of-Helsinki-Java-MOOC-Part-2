
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class ButtonListener implements ActionListener {

    private JButton plus;
    private JButton minus;
    private JButton z;
    private JTextField out;
    private JTextField input;

    public ButtonListener(JButton plus, JButton minus, JButton z, JTextField out, JTextField input) {
        this.plus = plus;
        this.minus = minus;
        this.z = z;
        this.out = out;
        this.input = input;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == plus) {
                int a = Integer.parseInt(input.getText());
                int b = Integer.parseInt(out.getText());
                int sum = a + b;
                out.setText(Integer.toString(sum));
                input.setText("");

            }
            if (e.getSource() == minus) {
                int a = Integer.parseInt(input.getText());
                int b = Integer.parseInt(out.getText());
                int diff = b - a;
                out.setText(Integer.toString(diff));
                input.setText("");
            }
            if (e.getSource() == z) {
                input.setText("");
                out.setText(Integer.toString(0));
                z.setEnabled(false);
            }
            if (Integer.parseInt(out.getText()) == 0) {
                z.setEnabled(false);
            } else {
                z.setEnabled(true);
            }
        } catch (NumberFormatException nfe) {
            input.setText("");
            out.setText("0");
        }
    }
}
