/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7ballbar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author ASUS
 */
public class Madrab {
    private Color MardrabColor=Color.blue;
    private int x,y;
    private int w=100;
    private int h=20;
    private int move=10;
    public Madrab(int framew,int frameh)
    {
        x=(int)(Math.random()*(framew-w));
        y=frameh-h;
    }
    public void mover()
    {
        x+=move;
    }
    public void movel()
    {
        x-=move;
    }
    public Rectangle area()
    {
        return new Rectangle(x,y,w,h);
    }
    public void paint(Graphics g)
    {
        g.setColor(MardrabColor);
        g.fillRect(x, y, w, h);
    }
}
