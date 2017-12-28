/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch9nw;

import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class Drawing extends Server{
    public static DrawingArea DrawingJp=new DrawingArea();
    public static ArrayList<MyPoint>  Allpoints=new ArrayList<MyPoint>(300);
    
    public int ct;
    public Drawing() throws IOException
    {
    this.add(DrawingJp);
    
    }
  

    
    
}
