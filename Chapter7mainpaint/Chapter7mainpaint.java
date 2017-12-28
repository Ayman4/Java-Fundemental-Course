/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7mainpaint;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Chapter7mainpaint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainprog p=new mainprog();
        TestSimple ts=new TestSimple();
        ts.setVisible(true);
        ts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
        
        /*
        TestPaint t=new TestPaint();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);
                */
                
    }
    
}
