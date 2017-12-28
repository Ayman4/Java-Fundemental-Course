/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7ballbar;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author ASUS
 */
public class BallGame extends MovingBall{
    Madrab bar=new Madrab(400,400);
    public BallGame()
    {
        addKeyListener(new KeyList());
    }
    public void paint (Graphics g)
    {
        super.paint(g);
        if (iscontact())
        {
        kora.bounce();
        }
        else
        {
        bar.paint(g);
        }
    }

    private boolean iscontact() {
        return bar.area().contains(kora.getposition());
    }
    private class KeyList extends KeyAdapter
    {
        public void keyPressed (KeyEvent k)
        {
            if (k.getKeyCode()==KeyEvent.VK_LEFT)
            {
                bar.movel();
            }
            if (k.getKeyCode()==KeyEvent.VK_RIGHT)
            {
                bar.mover();
            }
            if (k.getKeyCode()==KeyEvent.VK_R)
            {
                kora.setPos(new Point(200,200));
                //kora.paint();
            }
        }
    }
}
