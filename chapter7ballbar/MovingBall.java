/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7ballbar;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.awt.WindowClosingListener;

/**
 *
 * @author ASUS
 */

public class MovingBall extends JFrame{
    protected Ball kora=new Ball (400,400);
    private class wind extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            JOptionPane.showMessageDialog(null, "Thanks for using");
            System.exit(0);
        }
    }
    public MovingBall()
    {
        setTitle("Breaks V 1.0");
        setSize(400,400);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new wind());
        
        
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        kora.paint(g);
    }
    
    public void move()
    {
        while (true)
        {
            kora.move();
            repaint();
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                System.exit(0);
            }
        }
    }
}
