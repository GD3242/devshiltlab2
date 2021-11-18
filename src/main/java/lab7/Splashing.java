/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dulguun.gan
 */
public class Splashing extends JFrame {

    private int duration;

    public Splashing(int d) {
        duration = d;
    }

    public void showSplash() {
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.setBackground(Color.white);
        // Width and height of splash screen
        int width = 450;
        int height = 115;
        // Find the x,y coordinates to place the frame
        // in the center of the screen
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
        JLabel lblCalv = new JLabel(new ImageIcon("calv.gif"));
        JLabel lblCopyRight = new JLabel("My Splash Screen",JLabel.CENTER);
        lblCopyRight.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        contentPane.add(lblCalv, BorderLayout.CENTER);
        contentPane.add(lblCopyRight, BorderLayout.SOUTH);
        Color clrRed = new Color(156, 20, 20, 255);

        contentPane.setBorder(BorderFactory.createLineBorder(clrRed,
                10));
        // Remove borders from frame
        setUndecorated(true);
        setVisible(true);
        // Wait for a few seconds
        try {
            Thread.sleep(duration);
        } catch (Exception e) {
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        Splashing splash = new Splashing(10000);
        splash.showSplash();
    }
}
