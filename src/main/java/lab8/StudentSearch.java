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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dulguun.gan
 */
class StudentSearch extends JFrame implements ActionListener {

    JLabel lblName = new JLabel("Name");
    JLabel lblRollNo = new JLabel("RollNo");
    JTextField txtName = new JTextField(20);
    JTextField txtRollNo = new JTextField(20);

    JButton btnSearch = new JButton("Search");
    JButton btnExit = new JButton("Exit");
    Statement st;
    String strSql;
    JPanel pnlStart, pnlEnd;

    public StudentSearch(String title) {
        super(title);
//        try {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//        } catch (ClassNotFoundException ce) {
//            System.out.println(ce);
//        }
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            Connection con = DriverManager.getConnection(url, username, "");
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

        pnlEnd = new JPanel();
        pnlEnd.add(btnSearch);
        pnlEnd.add(btnExit);
        btnSearch.addActionListener(this);
        btnExit.addActionListener(this);
        getContentPane().add(pnlStart, BorderLayout.PAGE_START);
        getContentPane().add(pnlEnd, BorderLayout.PAGE_END);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource().equals(btnSearch)) {
                int rollno = Integer.parseInt(txtRollNo.getText());
                String strSql = "select * from t_student where name like '" + txtName.getText();
                strSql = strSql + "' and rollno=" + rollno;
                ResultSet rs = st.executeQuery(strSql);
                if (rs.next() == false) {
                    System.out.println("Record not found");
                } else {
                    System.out.print("\nRollNo : ");
                    System.out.print(rs.getInt(1) + "\t");
                    System.out.print("\nName : ");
                    System.out.print(rs.getString(2) + "\t");
                    System.out.print("\nClass : ");
                    System.out.print(rs.getString(3));
                }
                rs.close();
            } else if (e.getSource().equals(btnExit)) {
                System.exit(0);
            }
        } catch (SQLException ce) {
            System.out.println(ce);
        }
    }

    public static void main(String args[]) {
        StudentSearch objStudentSearch = new StudentSearch("Student");
    }
}
