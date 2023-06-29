/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applet;

import java.applet.*;
import java.awt.*;

/*<applet code=Applet1 width=400 height=600>
</applet>*/

public class AppletDemo extends Applet
{
	 public void init()
	 {
		setBackground(Color.black);
		setForeground(Color.yellow);
	 }
	 public void paint(Graphics g)
	 {
	 	g.drawString("Welcome to Applet",40,40);
         }
         public void destroy()
         {
             
         }

}
