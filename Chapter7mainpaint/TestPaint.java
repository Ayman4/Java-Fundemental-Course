/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7mainpaint;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author ayman
 */
public class TestPaint extends JFrame{
    public int cnt;
    public TestPaint()
    {
        cnt=0;
        setSize(640,480);
        setTitle("Test My Frame");
    }
    public void paint (Graphics g) 
    {
        cnt++;
        System.out.println("Paint is Called " + cnt);
        g.drawLine(100, 100, 250, 250);
        g.drawRect(250, 250, 150, 50);
        
    }
}
