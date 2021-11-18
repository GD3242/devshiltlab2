/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author dulguun.gan
 */
public class LookFeel extends JFrame implements ActionListener {

    JButton btnMetal, btnMotif, btnWindows;
    JLabel l;
    JComboBox c;

    public LookFeel() {
        super("Look and Feel Example");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        l = new JLabel("Your choice:", JLabel.CENTER);
        add(l, BorderLayout.CENTER);
        String[] a = {"IT", "IS", "IN", "EE"};
        c = new JComboBox(a);
        add(c, BorderLayout.NORTH);
        c.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                JComboBox d = (JComboBox) e.getSource();
                l.setText(d.getSelectedItem().toString());
            }
        });
        JPanel pnlLookFeel = new JPanel();
        btnMetal = new JButton("Metal");
        btnMetal.addActionListener(this);
        pnlLookFeel.add(btnMetal);
        btnMotif = new JButton("Motif");
        btnMotif.addActionListener(this);
        pnlLookFeel.add(btnMotif);
        btnWindows = new JButton("Windows");
        btnWindows.addActionListener(this);
        pnlLookFeel.add(btnWindows);
        getContentPane().add(pnlLookFeel, BorderLayout.SOUTH);
        setSize(450, 250);
        setVisible(true);
//pack();
    }

    public void actionPerformed(ActionEvent ae) {
        String strLookFeel = null;
        if (ae.getActionCommand().equals("Metal")) {
            strLookFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
        } else if (ae.getActionCommand().equals("Windows")) {
            strLookFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        } else if (ae.getActionCommand().equals("Motif")) {
            strLookFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        } else {
            System.err.println("Unrecognized L&F request action:" + ae.getActionCommand());
            return;
        }
        try {
            UIManager.setLookAndFeel(strLookFeel);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex1) {
            System.err.println("Unsupported LookAndFeel: " + strLookFeel);
        } catch (ClassNotFoundException ex2) {
            System.err.println("LookAndFeel class not found: " + strLookFeel);
        } catch (InstantiationException ex3) {
            System.err.println("Could not load LookAndFeel: " + strLookFeel);
        } catch (IllegalAccessException ex4) {
            System.err.println("Cannot use LookAndFeel: " + strLookFeel);
        }
    }

    public static void main(String args[]) {
        LookFeel objLookFeel = new LookFeel();
    }
}
