/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Christopher
 */
public class ClickListener implements ActionListener {

    private Calculator calc;
    private JLabel label;

   public ClickListener(Calculator cal, JLabel label) {
        this.calc = cal;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        label.setText(Integer.toString(calc.giveValue()));
    }

}
