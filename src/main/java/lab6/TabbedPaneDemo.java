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
import javax.swing.*;

class TabbedPaneDemo extends JFrame {

    private JTabbedPane jtpPane;
    private JPanel pnlPage1;
    private JPanel pnlPage2;
    private JPanel pnlPage3;

    public TabbedPaneDemo() {
        setTitle("Tabbed Pane Application");
        setSize(300, 200);
        setBackground(Color.blue);
        JPanel pnlMain = new JPanel();
        pnlMain.setLayout(new BorderLayout());
        createPage1();
        createPage2();
        createPage3();
        jtpPane = new JTabbedPane();
        jtpPane.addTab("First Page ", pnlPage1);
        jtpPane.addTab("Second Page ", pnlPage2);
        jtpPane.addTab("Third Page ", pnlPage3);
        pnlMain.add(jtpPane, BorderLayout.CENTER);
        add(pnlMain);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void createPage1() {
        pnlPage1 = new JPanel();
        pnlPage1.setLayout(null);
        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setBounds(10, 15, 150, 20);
        pnlPage1.add(lblUsername);
        JTextField txtUsername = new JTextField(10);
        txtUsername.setBounds(10, 35, 150, 20);
        pnlPage1.add(txtUsername);
        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setBounds(10, 60, 150, 20);
        pnlPage1.add(lblPassword);
        JPasswordField txtPassword = new JPasswordField(10);
        txtPassword.setBounds(10, 80, 150, 20);
        pnlPage1.add(txtPassword);
    }

    public void createPage2() {
        pnlPage2 = new JPanel();
        pnlPage2.setLayout(new BorderLayout());
        pnlPage2.add(new JButton("North"), BorderLayout.PAGE_START);
        pnlPage2.add(new JButton("South"), BorderLayout.PAGE_END);
        pnlPage2.add(new JButton("East"), BorderLayout.LINE_END);
        pnlPage2.add(new JButton("West"), BorderLayout.LINE_START);
        pnlPage2.add(new JButton("Center"), BorderLayout.CENTER);
    }

    public void createPage3() {
        pnlPage3 = new JPanel();
        pnlPage3.setLayout(null);
        JLabel name = new JLabel("name :");
        name.setBounds(10, 15, 150, 20);
        JLabel address = new JLabel("address :");
        address.setBounds(10, 55, 150, 20);
        JLabel birthDate = new JLabel("birthDate :");
        birthDate.setBounds(10, 95, 150, 20);
        
        JTextArea nameText = new JTextArea();
        nameText.setBounds(90, 15, 150, 20);
        
        JTextArea addressText = new JTextArea();
        addressText.setBounds(90, 55, 150, 20);
        
        JTextArea birthDateText = new JTextArea();
        birthDateText.setBounds(90, 95, 150, 20);
        
        
        pnlPage3.add(name);
        pnlPage3.add(address);
        pnlPage3.add(birthDate);
        pnlPage3.add(nameText);
        pnlPage3.add(addressText);
        pnlPage3.add(birthDateText);
        
    }

    public static void main(String[] args) {
        TabbedPaneDemo jtab = new TabbedPaneDemo();
    }
}
