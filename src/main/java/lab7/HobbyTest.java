/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import javax.swing.JFrame;

/**
 *
 * @author dulguun.gan
 */
class HobbyTest extends JFrame {

    HobbyTest(String s) {
        super(s);
        getContentPane().add(new Hobby());
        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        new HobbyTest("Hobbies");
    }
}
