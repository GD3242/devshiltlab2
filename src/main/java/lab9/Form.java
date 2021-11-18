/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dulguun.gan
 */
public class Form {
    JFrame frame = new JFrame();
    
    JLabel lblName = new JLabel("Name: ");
    JLabel lblAge = new JLabel("Age: ");
    JLabel lblGender = new JLabel("Gender: ");
    JLabel lblIdentityNumber = new JLabel("Identity number: ");
    JLabel lblMobile = new JLabel("Mobile: ");
    JLabel lblMailAddr = new JLabel("Mail address: ");
    JLabel lblCardNumber = new JLabel("Card Number: ");
    
    //inputs
    JTextField txtName = new JTextField();
    JTextField txtAge = new JTextField();
    JTextField txtIdentitNumber = new JTextField();
    JTextField txtMobile = new JTextField();
    JTextField txtMailAddr = new JTextField();
    JTextField txtCardNum = new JTextField();
    
    JComboBox listGender = null;
    
    
    Form () {
        String gender[] = {"male" , "female"};
        listGender = new JComboBox(gender);
        
        lblName.setBounds(10, 10, 150, 20);
        frame.add(lblName);
        txtName.setBounds(160, 10, 150, 20);
        frame.add(txtName);
        
        lblAge.setBounds(10, 50, 150, 20);
        frame.add(lblAge);
        txtAge.setBounds(160, 50, 150, 20);
        frame.add(txtAge);
        
        lblGender.setBounds(10, 90, 150, 20);
        frame.add(lblGender);
        listGender.setBounds(160, 90, 150, 20);
        frame.add(listGender);
        
        lblIdentityNumber.setBounds(10, 130, 150, 20);
        frame.add(lblIdentityNumber);
        txtIdentitNumber.setBounds(160, 130, 150, 20);
        frame.add(txtIdentitNumber);
        
        lblMobile.setBounds(10, 170, 150, 20);
        frame.add(lblMobile);
        txtMobile.setBounds(160, 170, 150, 20);
        frame.add(txtMobile);
        
        lblMailAddr.setBounds(10, 210, 150, 20);
        frame.add(lblMailAddr);
        txtMailAddr.setBounds(160, 210, 150, 20);
        frame.add(txtMailAddr);
        
        lblCardNumber.setBounds(10, 250, 150, 20);
        frame.add(lblCardNumber);
        txtCardNum.setBounds(160, 250, 150, 20);
        frame.add(txtCardNum);
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480,480);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        Form form = new Form();
    }
}
