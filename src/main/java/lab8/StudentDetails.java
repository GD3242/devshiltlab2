/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dulguun.gan
 */
class StudentDetails extends JFrame implements ActionListener {

    JLabel lblName = new JLabel("Name :");
    JLabel lblRollNo = new JLabel("RollNo :");
    JLabel lblClass = new JLabel("Class :");
    JTextField txtName = new JTextField(20);
    JTextField txtRollNo = new JTextField(20);
    JTextField txtClass = new JTextField(20);
    JButton btnAdd = new JButton("Add");
    JButton btnDelete = new JButton("Delete");
    JButton btnModify = new JButton("Modify");
    JButton btnExit = new JButton("Exit");
    Statement st;
    String strSql;
    JPanel pnlStart, pnlEnd;

    public StudentDetails(String title) {
        super(title);
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ce) {
            System.out.println(ce);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            st = con.createStatement();
        } catch (SQLException ce) {
            System.out.println(ce);
        }
        getContentPane().setLayout(new BorderLayout());
        pnlStart = new JPanel();
        pnlStart.setLayout(new GridLayout(3, 2));
        pnlStart.add(lblName);
        pnlStart.add(txtName);
        pnlStart.add(lblRollNo);
        pnlStart.add(txtRollNo);
        pnlStart.add(lblClass);
        pnlStart.add(txtClass);
        pnlEnd = new JPanel();
        pnlEnd.add(btnAdd);
        pnlEnd.add(btnDelete);
        pnlEnd.add(btnModify);
        pnlEnd.add(btnExit);
        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnModify.addActionListener(this);
        btnExit.addActionListener(this);
        getContentPane().add(pnlStart, BorderLayout.PAGE_START);
        getContentPane().add(pnlEnd, BorderLayout.PAGE_END);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource().equals(btnAdd)) {
                int roll = Integer.parseInt(txtRollNo.getText());
                strSql = "Insert into t_student values("
                        + roll;
                strSql = strSql + ", '" + txtName.getText() + "','"
                        + txtClass.getText() + "')";
                System.out.println("Insert: " + strSql);
                st.executeUpdate(strSql);
                JOptionPane.showMessageDialog(this, "Record added!");
            } else if (e.getSource().equals(btnDelete)) {
                strSql = "Delete from t_student where name like '" + txtName.getText();
                strSql = strSql + "' and rollno like '" + txtRollNo.getText() + "'";
                System.out.println("Delete: " + strSql);
                st.executeUpdate(strSql);
                JOptionPane.showMessageDialog(this, "Record deleted!");
            } else if (e.getSource().equals(btnModify)) {
                String name = txtName.getText();
                int roll = Integer.parseInt(txtRollNo.getText());
                strSql = "Update t_student set name ='" + txtName.getText();
                strSql = strSql + "' ,rollno=" + roll + ",class ='" + txtClass.getText();
                strSql = strSql + "' where name like '" + txtName.getText() + "' and rollno=" + roll;
                st.executeUpdate(strSql);
                JOptionPane.showMessageDialog(this, "Record updated!");
            } else if (e.getSource().equals(btnExit)) {
                System.exit(0);
            }
        } catch (SQLException ce) {
            System.out.println(ce);
        }
    }

    public static void main(String args[]) {
        StudentDetails objStudentDetails = new StudentDetails("Student Details");
    }
}
