/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyPackage;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Login extends Frame{
    
    public Login(){
        setTitle("Click Me!");
        setSize(400, 300);
        
        Button btnClickMe = new Button("Click!");
        btnClickMe.setBounds(175, 140, 80, 30);
        
        add(btnClickMe);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        
        
    }
        
    
}
