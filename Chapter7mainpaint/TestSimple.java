/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7mainpaint;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class TestSimple extends JFrame{
    private int ct=0;
    private Graphics myg;
    private Boolean paintme=true;
    private int currentx,currenty;
    private ArrayList<Point> allovals=new ArrayList<Point>();
    private JTextField jtf1;
    private JTextField jtf2;
    public TestSimple()
    {
        setSize(500,500);
        jtf1=new JTextField("Write email here");
        jtf2=new JTextField("Hello");
        jtf2.setBounds(10,200,150,50);
        jtf1.setBounds(10,300,150,50);
        jtf1.addKeyListener(new Keylist());
        jtf1.addFocusListener(new componentfocus());
        add(jtf2);
        add(jtf1);
        setTitle("My Pain");
        this.setLayout(null);
        JButton jbclear=new JButton("Clear");
        jbclear.setBounds(50, 400, 80, 50);
        
        add(jbclear);
        jbclear.addActionListener(new jbaction());
        this.addMouseListener(new mouselisten());
        this.addMouseMotionListener(new mymousemove());
        
    }
    private class componentfocus implements  FocusListener
    {

        @Override
        public void focusGained(FocusEvent e) {
            if (e.getSource().equals(jtf1))
            {
                //Put your code here 
            }
            Component component = e.getComponent();
            if (component instanceof JTextField) {
            ((JTextField)component).setText(null);
            }
            
        }

        @Override
        public void focusLost(FocusEvent e) {
            JOptionPane.showMessageDialog(rootPane, "Dont leave empty");
        }
    
    }
    private class Keylist implements KeyListener
    {

        @Override
        public void keyTyped(KeyEvent e) {
            
           
            System.out.println(e.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
    
    }
    public void paint(Graphics g)
    {
       System.out.println("Paint called" + ct);
          ct++;
        myg=g;
       
     
       
        super.paint(g);
        //start coordinates X,y and W and H
        if(paintme)
        {
        
        g.setColor(Color.PINK);
        g.drawString("Hello Alhag ", 350,250 );
        g.drawRect(50,50, 100, 100);
        g.setColor(Color.red);
        g.fillRect(50,50, 100, 100);
        int[] x = {240, 270, 260, 245, 220};
        int[] y = {220, 240, 280, 245, 260};
        g.drawPolygon(x, y, x.length);
        Polygon polygon = new Polygon();
        polygon.addPoint(40, 59);
        polygon.addPoint(40, 100);
        
        polygon.addPoint(10, 100);
        g.setColor(Color.BLUE);
        
        g.drawPolygon(polygon);
        g.drawArc(0, 200, 100, 50, 28, 78);
        try
        {
        BufferedImage img = ImageIO.read(new File("d:\\1.gif"));
        g.drawImage(img, 200, 300,null);
        }
        catch (IOException e)
        {}
        
        }
        else
        {
            for (Point p:allovals)
            {
            g.drawOval(p.x,p.y,10,10); 
            }
        }
    
        
      
     
    }

    private class mouselisten extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            currentx=e.getX();
            currenty=e.getY();
            allovals.add(new Point (currentx,currenty));
            repaint();
        }
    }
    private class mymousemove extends MouseMotionAdapter
    {
        public void mouseDragged(MouseEvent evt) {
         Graphics g = getGraphics();
         g.drawLine(10, 10, evt.getX(), evt.getY());
        currentx=evt.getX();
         currenty=evt.getY();
        g.setColor(Color.BLUE);
        //g.drawLine(currentx,currenty,++currentx, ++currenty);
        
        }
    }
    private class jbaction implements ActionListener {

       

        @Override
        public void actionPerformed(ActionEvent e) {
            
            myg.clearRect(0, 0, 500, 500); 
            paintme=false;
            repaint();
            
        }
    }
}
