/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static sun.misc.ClassFileTransformer.add;

/**
 *
 * @author dulguun.gan
 */
class Hobby extends JPanel implements ActionListener, ItemListener {

    JCheckBox chkReading = new JCheckBox("Reading", false);
    JCheckBox chkMusic = new JCheckBox("Music", false);
    JCheckBox chkPainting = new JCheckBox("Painting", false);
    JCheckBox chkMovies = new JCheckBox("Movies", false);
    JCheckBox chkDancing = new JCheckBox("Dancing", false);
    JLabel lblHobby = new JLabel("What's your hobby?");
    JButton btnExit = new JButton("Exit");

    public Hobby() {
        setLayout(new GridLayout(7, 1));
        chkReading.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
        chkMusic.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
        chkPainting.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
        chkMovies.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
        chkDancing.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));

        chkReading.addItemListener(this);
        chkMusic.addItemListener(this);
        chkPainting.addItemListener(this);
        chkMovies.addItemListener(this);
        chkDancing.addItemListener(this);

        add(lblHobby);
        add(chkReading);
        add(chkMusic);
        add(chkPainting);
        add(chkMovies);
        add(chkDancing);
        add(btnExit);

        btnExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnExit)) {
            System.exit(0);
        }
    }

    public void itemStateChanged(ItemEvent e) {
        String strSelectedItem
                = ((JCheckBox) e.getSource()).getText();
        System.out.println(strSelectedItem);
    }
}



