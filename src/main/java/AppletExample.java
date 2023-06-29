
import java.applet.Applet;
import java.awt.Color;
import java.awt.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edmundo Dela Cruz
 */
/*<applet code=AppletExample width=400 height=400>
</applet>
*/

public class AppletExample extends Applet{
    
    @Override
    public void init(){
        setBackground(Color.black);
        setForeground(Color.pink);
        
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString("Gusto ko ng Lemon, meron ka bang tequila", 50, 50);
    }
    
}
