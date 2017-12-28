/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch9neclient;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Ch9NEClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       /* Client cl=new Client("Ahmed");
        cl.setVisible(true);
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Client cl2=new Client("Youssef");
        cl2.setVisible(true);
        cl2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       */ 
       DrawingClient dc=new DrawingClient("Ahmed");
        dc.setVisible(true);
        dc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingClient dc1=new DrawingClient("Ibrahim");
        dc1.setVisible(true);
        dc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
