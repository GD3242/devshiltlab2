/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author dulguun.gan
 */
public class Prob1 implements ActionListener{

    JFrame frame = new JFrame("prob1");
    JLabel label = new JLabel();
    JCheckBox readingCheckBox = new JCheckBox("Reading");
    JCheckBox singingCheckBox = new JCheckBox("Singing");
    JCheckBox dancingCheckBox = new JCheckBox("Dancing");
    JCheckBox paintingCheckBox = new JCheckBox("Painting");
    Font t = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14);
    JButton exitButton = new JButton("EXIT");
    
    JRadioButton maleRadioButton = new JRadioButton("male");
    JRadioButton femaleRadioButton = new JRadioButton("female");
    

    Prob1() {
        label.setBounds(0, 0, 300, 25);
        readingCheckBox.setBounds(0, 40, 75, 25);
        readingCheckBox.setFont(t);
        singingCheckBox.setBounds(0, 80, 75, 25);
        dancingCheckBox.setBounds(0, 120, 75, 25);
        paintingCheckBox.setBounds(0, 160, 75, 25);
        
        maleRadioButton.setBounds(100, 40, 75, 25);
        maleRadioButton.addActionListener(this);
        femaleRadioButton.setBounds(180, 40, 75, 25);
        femaleRadioButton.addActionListener(this);
        exitButton.setBounds(100, 120, 100, 100);
        exitButton.addActionListener(this);
        
        
        frame.add(label);
        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);
        frame.add(readingCheckBox);
        frame.add(singingCheckBox);
        frame.add(dancingCheckBox);
        frame.add(paintingCheckBox);
        frame.add(exitButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360, 360);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            System.exit(0);
        }
        
        if(e.getSource() == maleRadioButton) {
            String text = "";
            if(readingCheckBox.isSelected()) {
                text = text + "Reading";
            } 
            if (singingCheckBox.isSelected()) {
                text = text + " Singing";
            } 
            if (dancingCheckBox.isSelected()) {
                text = text + " Dancing";
            } 
            if (paintingCheckBox.isSelected()) {
                text = text + " Painting";
            }
            label.setText(text);
        }
        
        if(e.getSource() == femaleRadioButton) {
            String text = "";
            if(readingCheckBox.isSelected()) {
                text = text + "Reading";
            } 
            if (singingCheckBox.isSelected()) {
                text = text + " Singing";
            } 
            if (dancingCheckBox.isSelected()) {
                text = text + " Dancing";
            } 
            if (paintingCheckBox.isSelected()) {
                text = text + " Painting";
            }
            label.setText(text);
        }
    }
    
    public static void main(String[] args) {
        Prob1 prob = new Prob1();
    }


}
