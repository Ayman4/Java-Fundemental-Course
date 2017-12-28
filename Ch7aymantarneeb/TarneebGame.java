/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aymantarneeb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayman
 */
public class TarneebGame extends JFrame implements MouseMotionListener
{
   
    ArrayList <PlayingCard> Cards=new ArrayList<PlayingCard>();
    String DirectoryPath="D:\\JavaFiles\\Playing Cards\\Playing Cards\\PNG-cards-1.3";
    //ArrayList<JLabel> ArrayOfLabel=new ArrayList<JLabel>();
    JLabel XCor=new JLabel("XCor");
    JLabel YCor=new JLabel("YCor");
    
    public TarneebGame()
    {
        setTitle("Tarneeb Ver 1.0");
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        setSize(env.getMaximumWindowBounds().width, env.getMaximumWindowBounds().height);
       
        setLayout(null);
       XCor.setBounds(10,840,120,30);
       YCor.setBounds(130,840,120,30);
        add(XCor);
        add(YCor);
    
        //setLayout(new FlowLayout());
        int x=0;
        int y=10;
        int elementsinrow=0;
         File dir = new File(DirectoryPath);
        File[] directoryListing = dir.listFiles();
        
        //for (int i=0;i<8;i++)
        for (File child : directoryListing)
        {
        String Z=child.getName();
        System.out.println("Z="+Z);
        PlayingCard p=new PlayingCard();
        String []sep=Z.split("_");
        p.Value=Integer.parseInt(sep[0]);
        p.CardName="Two";
        p.Shape=PlayingCard.ShapeTypes.RedHeart;
        p.ImageName=DirectoryPath+"\\"+Z;
       Cards.add(p);
            JLabel j=new JLabel();
            j.setIcon(new ImageIcon(new ImageIcon(Cards.get(Cards.size()-1).ImageName).getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT)));
            add(j);
            j.addMouseMotionListener(this);
            j.setBounds(x,y, 100, 200);
          p.Holder=j;
            x+=100;
             
            add(p.Holder);
            elementsinrow++;
            if (elementsinrow>10)
            {
                x=0;
                y+=200;
                elementsinrow=0;
            }
        }
        
        addMouseMotionListener(this);
       
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        XCor.setText(""+e.getX());
        //YCor.setText(""+e.getXOnScreen());
        for (PlayingCard p:Cards)
        {
        if (p.Holder.equals(e.getSource()))
        {
            //JOptionPane.showMessageDialog(null, "Label 0");
           // int i=Cards.indexOf(e.getSource());
            p.Holder.setBounds(e.getXOnScreen(),e.getYOnScreen(), 100, 240);
            XCor.setText(""+p.Value);
            
        }
        }
        
      
        //System.out.println("E"+e.getSource().toString());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

}
