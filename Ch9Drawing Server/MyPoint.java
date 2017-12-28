/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch9nw;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author ASUS
 */
public class MyPoint extends Point{
    public Color c;
    public MyPoint(int x,int y,Color c)
    {
    super(x,y);
    this.c=c;
    }
}
