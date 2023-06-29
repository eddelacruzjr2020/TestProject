
import java.applet.*;
import java.awt.Graphics;
import java.awt.Image;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edmundo Dela Cruz
 */

/*<applet code=Ryu width=400 height=400>
</applet>
*/


public class Ryu extends Applet{
    private Image ryu;
    private Image haduken;
    private Image ken;
    
    public void init(){
         ryu = getImage(getDocumentBase(), "ryu.jpg");
         haduken = getImage(getDocumentBase(), "haduken.jpg");
         
    }
    
    @Override
    public void paint(Graphics g){
        g.drawImage(ryu, 20, 50, this);
        
        for(int i = 130; i<230; i++){
            g.drawImage(haduken, i, 80, this);
            try{Thread.sleep(10);}catch(Exception e){}  
        }
    }
    
}
