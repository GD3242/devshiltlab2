/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dulguun.gan
 */
public class MultiplePanels extends JFrame {

    public MultiplePanels(String s) {
        super(s);
        getContentPane().setLayout(new GridLayout(2, 1));

        JPanel pnlBlue = new JPanel();
        pnlBlue.setBackground(Color.blue);
        JPanel pnlGreen = new JPanel();
        pnlGreen.setBackground(Color.green);
        getContentPane().add(pnlBlue);
        getContentPane().add(pnlGreen);

        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String args[]) {
        MultiplePanels objMultiplePanels = new MultiplePanels("Multiple Panels");
    }
}
