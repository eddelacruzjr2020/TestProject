/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.applet.*;
import java.awt.*;


/**
 *
 * @author Edmundo Dela Cruz
 * 
 */

/*<applet code=AppletDemo width=400 height=400>
</applet>
*/

public class AppletDemo extends Applet {
    
    @Override
    public void init(){
        setBackground(Color.BLACK);
        setForeground(Color.PINK);
        
    }
    @Override
    public void paint(Graphics g){
        g.drawString("Welcome to World of Applet", 50, 50);
 
        
    }
    
}
