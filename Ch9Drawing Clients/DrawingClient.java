/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch9neclient;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ASUS
 */
public class DrawingClient extends Client {
    public DrawingClient(String Name) throws IOException
    {
        super(Name);
        this.addMouseMotionListener(new mouselisten());
    }
    private class mouselisten implements MouseMotionListener
    {

        @Override
        public void mouseDragged(MouseEvent e) {
            PrintWriter pw=new PrintWriter(os,true);
            pw.println(clientName+",Draw,"+e.getX()+","+e.getY());
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            
        }
    
    }
}
