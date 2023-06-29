/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*<applet code=AppleDemoTake2 height=400 width=400>
</applet>
*/
/**
 *
 * @author Edmundo Dela Cruz
 */
public class AppleDemoTake2 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        setBackground(Color.RED);
        setForeground(Color.BLUE);
    }

    @Override
    public void paint(Graphics g){
        g.drawString("Welcome to Applet", 100, 100);
        
    }
}
