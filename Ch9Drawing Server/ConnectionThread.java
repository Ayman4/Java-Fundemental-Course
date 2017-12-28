/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch9nw;

import static ch9nw.Drawing.DrawingJp;
import java.awt.Color;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class ConnectionThread implements Runnable{
    
    private Socket s;
    private InputStream is;
    private OutputStream os;
    private BufferedReader fromclient;
    private PrintWriter toclient;
    private  JLabel Message;
    private Color c;
    public ConnectionThread(Socket s,JLabel Msg,Color c) throws IOException
    {
        this.s=s;
        this.Message=Msg;
        is=s.getInputStream();
        os=s.getOutputStream();
        this.c=c;
    }
    
   
//    public String getcontentOfLabel()
//    {
//        return this.Message.getText();
//    }
    public void run() {
           fromclient=new BufferedReader(new InputStreamReader(is));
           toclient=new PrintWriter(os,true);
        while (true)
        {
               try {
                   String NewMessage=fromclient.readLine();
                   System.out.println("Message= "+ NewMessage);
                   //Message.setText(ch9nw.Server.allMessage.getText() +"<br>"+NewMessage);
                   if (NewMessage.contains("Draw"))
                   {
                     String s[]=NewMessage.split(",");
                    // System.out.println(s[2]+","+s[3]);
                     Drawing.Allpoints.add(new MyPoint (Integer.parseInt(s[2]),Integer.parseInt(s[3]),c));
                     Drawing.DrawingJp.repaint();
                   }
                   else
                   { 
                   Message.setText(Message.getText() +"<br>"+NewMessage);
                   }
                   //
                   Thread.sleep(1);
               } catch (IOException ex) {
                   Logger.getLogger(ConnectionThread.class.getName()).log(Level.SEVERE, null, ex);
               } catch (InterruptedException ex) {
                   Logger.getLogger(ConnectionThread.class.getName()).log(Level.SEVERE, null, ex);
               }
            
        }   
        
    }
    
}
