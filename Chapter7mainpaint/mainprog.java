/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7mainpaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class mainprog extends JFrame{
    
    private int ct=0;
    public int x,y;
    public mainprog()
    {
        x=0;
        y=0;
        setSize(500,500);
       /* GraphicsEnvironment t=GraphicsEnvironment.getLocalGraphicsEnvironment();
        String []fontnames=t.getAvailableFontFamilyNames();
        
        for (int i=0;i<fontnames.length;i++)
        {
            System.out.println(fontnames[i]);
        }
       */
        JButton b=new JButton("Test");
        b.setBounds(200,200,100,50);
        this.setLayout(null);
        b.addActionListener(new actions());
        add(b);        
        
    }
    private class actions implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
        {
            System.out.println("Action performed");
        move();
        }
        catch (InterruptedException ez)
        {}
        }
    
    }
   public void move() throws InterruptedException
   {
            
      Thread gameThread = new Thread() {
         public void run() {
        for (int i=0;i<400;i++)
        {
            x=i;
            y=i;
        
             repaint();
             try
             {
            Thread.sleep(10);
             }
             catch (InterruptedException z){
                 System.out.println("Exception Fired");
             }
        }    
         }};
         
            
        gameThread.start();
   }
   
   public void paint (Graphics g)
    {
        //super.paint(g);
        g.drawString("Hello", 100, 100);
        g.drawLine(0, 100, 300, 300);
        g.drawRect(300, 300, 200, 100);
        g.setColor(Color.red);
        g.fillRect(300, 300, 200, 100);
        
        g.setColor(Color.BLUE);
        g.drawOval(0, 0, 100, 50);
        g.setColor(Color.MAGENTA);
        g.drawOval(150, 150, 50, 50);
       /* 
        try
        {
        BufferedImage img = ImageIO.read(new File("d:\\1.gif"));
        g.drawImage(img, 300, 100,null);
        }
        catch (IOException e)
        {}
*/
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, 50, 50);
        g.drawOval(x, y,50 ,50);
        //System.out.println("Paint is called " +ct);
        ct++;
      
        
        
    }
    
}
