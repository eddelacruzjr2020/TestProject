
import java.applet.*;
import java.awt.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edmundo Dela Cruz
 */

/*<applet code=CoupleAnimation width=600 height=600>
</applet>
*/
public class CoupleAnimation extends Applet {
    
    private Image girlPicture, boyPicture,heartPicture;
    
     public void init(){
         
         girlPicture = getImage(getDocumentBase(), "girl.jpg");
         boyPicture = getImage(getDocumentBase(), "boy.jpg");
         heartPicture = getImage(getDocumentBase(), "heart.jpg");
     }
     
     public void paint(Graphics g){
         g.drawString("Welcome to Happy Life", 250, 100);
         for(int i=0; i<100; i++){
             g.drawImage(boyPicture, i, 150, this);
              
             try{Thread.sleep(100);}catch(Exception e){}  
         }
         
         for(int i=300; i>200; i--){
             g.drawImage(girlPicture, i, 150, this);
              
             try{Thread.sleep(100);}catch(Exception e){}  
         }    
         
     }
         
     public void repaint(Graphics g){
         g.drawImage(heartPicture, 150, 150, this);
         
         try{Thread.sleep(100);}catch(Exception e){}  
         
     }
    
    
    
    
 
    
}
