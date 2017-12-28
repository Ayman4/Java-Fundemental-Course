/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch8threads;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Ch8Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Task []ArrayTasks=new Task[5];
        
        for (int i=0;i<5;i++)
        {
            ArrayTasks[i]=new Task(i);
            
        }
        ArrayTasks[0].setPriority(10);
        
        for (int i=0;i<5;i++)
        {
            ArrayTasks[i].start();
            
        }*/
        
        /*
        JFrame jf=new JFrame();
        jf.setSize(600, 600);
        
        MovingBalls mb=new MovingBalls();
        mb.Balls.add(new Ball());
        mb.Balls.add(new Ball(20,20,5,Color.BLUE));
        mb.Balls.add(new Ball(100,100,20,Color.ORANGE));
        mb.Balls.add(new Ball(160,160,15,Color.red));
        mb.Balls.add(new Ball(180,180,10,Color.CYAN));
        mb.Balls.add(new Ball(200,200,50,Color.pink));
        mb.Balls.add(new Ball(250,100,60,Color.black));
        mb.Balls.add(new Ball (220,140,100,Color.magenta));
        
        jf.add(mb,BorderLayout.CENTER);
        mb.setFocusable(true);
        Thread t1=new Thread(mb);
        t1.start();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
        */
        //Synchronize Example;
        BankAccount AhmedAccount=new BankAccount();
        DepositThread Eida3Thread=new DepositThread(AhmedAccount,100);
        WithdrawThread sa7bThread=new WithdrawThread(AhmedAccount, 100);
        Eida3Thread.start();
        sa7bThread.start();
        
        
        
    }
    
}
