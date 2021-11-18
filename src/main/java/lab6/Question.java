/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author dulguun.gan
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Question extends JFrame implements ActionListener {

    JPanel p1;
    JCheckBoxMenuItem ch1, ch2;
    JMenuItem ch3;
    JScrollPane p;

    Question() {
        JMenuBar mb = new JMenuBar();
        JMenu subjects = new JMenu("SICT");
        JMenu submenu1 = new JMenu("IT Department");
        ch1 = new JCheckBoxMenuItem("IT");
        ch1.addActionListener(this);
        submenu1.add(ch1);
        ch2 = new JCheckBoxMenuItem("IS");
        ch2.addActionListener(this);
        submenu1.add(ch2);
        subjects.add(submenu1);
        submenu1 = new JMenu("Electronic Department");
        ch3 = new JMenuItem("EE");
        ch3.addActionListener(this);
        submenu1.add(ch3);
        subjects.add(submenu1);

        mb.add(subjects);
        setJMenuBar(mb);
        setTitle("MenuTest");
        setSize(300, 200);
        setVisible(true);
        p1 = new JPanel();
        add(p1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void addComp(int i) {
        p1 = new JPanel(new BorderLayout());
        if (i == 1) {
            String[] arr = {"aa", "bb", "cc",
                 "dd", "ee", "ff", "gg", "hh"};
            JList list = new JList(arr);
            p1.add(list);
        } else if (i == 2) {
            JLabel label = new JLabel("IS");
            p1.add(label);
        } else if (i == 3) {
            String[] columNames = {"ID", "NAME", "SALARY"};
            String[][] data = {{"101", "Amit", "670000"},
            {"102", "Jai", "780000"}, {"103", "Sachin", "700000"}};
            JTable table = new JTable(data, columNames);
            Object[] row = {};
            p1.add(table);
        }
    }

    void register() //Сонсогчдыг бүртгэх функц
    {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ch1) {
            remove(p1);
            ch2.setSelected(false);
            addComp(1);
        } else if (e.getSource() == ch2) {
            ch1.setSelected(false);
            remove(p1);
            addComp(2);
        } else if (e.getSource() == ch3) {
            ch1.setSelected(false);
            ch2.setSelected(false);
            remove(p1);
            addComp(3);
        }
        add(p1, BorderLayout.CENTER);
        p1.revalidate();
        validate();
    }

    public static void main(String[] args) {
        Question q = new Question();
        q.register();
    }
}
