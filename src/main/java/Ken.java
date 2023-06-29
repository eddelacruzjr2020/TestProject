
import java.applet.Applet;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edmundo Dela Cruz
 */
/*<applet code=Ken width=600 height=400>
</applet>
*/

public class Ken extends Applet{
     private Image ken;
     private Image kenhadouken;
    
    public void init(){
        ken = getImage(getDocumentBase(), "ken.jpg");
        kenhadouken = getImage(getDocumentBase(), "kenhadouken.jpg");
        
    }
    
    public void paint(Graphics g){
        g.drawImage(ken, 50, 50, this);
        
        for(int i = 180; i<300; i++){
            g.drawImage(kenhadouken, i, 70, this);
             try{Thread.sleep(10);}catch(Exception e){}  
        }
        

    }
    
}
