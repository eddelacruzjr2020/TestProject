/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edmundo Dela Cruz
 */

import java.applet.*;
import java.awt.*;

/*<applet code=Applet2 width=400 height=600>
</applet>
*/

public class Applet2 extends  Applet{
    
    private Image picture;
    
    public void init(){
        setBackground(Color.BLACK);
        setForeground(Color.PINK);
        picture = getImage(getDocumentBase(), "soono.jpg");
        
    }
    public void paint(Graphics g){
        g.drawString("Welcome to the world of Applet", 40, 40);
        g.drawImage(picture, 40, 40, this);
        
    }
    
        
    
}
