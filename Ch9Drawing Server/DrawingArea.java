/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch9nw;

import static ch9nw.Drawing.Allpoints;
import static ch9nw.Drawing.DrawingJp;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class DrawingArea extends JPanel{
    
    public DrawingArea()
    {
    this.setBounds(200, 10, 400, 400);
    this.setBackground(java.awt.Color.red);
    
    }
    public void paintComponent(Graphics g) {
    
        super.paintComponent(g);
    
//super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
       // g.setColor(java.awt.Color.white);
        //System.out.println("Size= "+Drawing.Allpoints.size());
        for (MyPoint p:Drawing.Allpoints)
        {
            g.setColor(p.c);
            g.drawOval(p.x,p.y, 10, 10);
        }
    }
}
