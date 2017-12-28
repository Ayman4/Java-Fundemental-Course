/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7ballbar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author ASUS
 */
public class Ball {
    private final int r=10;
    private Point pos;
    private Color BallColor=Color.red;
    private int yc=1;
    private int xc=1;
    private int w,h;
    public void setPos(Point d)
    {
        this.pos=d;
    }
    public Ball(int w,int h)
    {
        this.w=w;
        this.h=h;
        pos=new Point();
        pos.x=(int)(Math.random()*(this.w-r)+r);
        pos.y=(int)(Math.random()*(h/2-r)+r);
    }
    public void paint(Graphics g)
    {
        g.setColor(BallColor);
        g.fillOval(pos.x-r, pos.y-r, 2*r, 2*r);
    }
    public void move()
    {
       if (pos.y<r)
       {
       yc = -yc;
       }
       if (pos.x<r)
       {
          xc = -xc;
       }
       if (pos.x>w-r)
       {
           xc= -xc;
       }
       if (pos.y<h-r)
       {
           pos.translate(xc, yc);
       }
       if (pos.x<w-r)
       {
           pos.translate(xc, yc);
       }
        //some code here missed
    }
    
    public void bounce()
    {
        yc= -yc;
        pos.translate(xc, yc);
    }
    public Point getposition()
    {
        return pos;
    }
    }

            

