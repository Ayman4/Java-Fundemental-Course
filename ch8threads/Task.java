/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch8threads;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Task extends Thread{
    
    int id;
    public Task(int id)
    {
        this.id=id;
    }
    public void run()
    {
     //  Object x=new Object();
       
       
        for (int i=0;i<150;i++)
        {
            //Date d=new Date();
            //Calendar.getInstance().get(Calendar.MILLISECOND);
            //System.currentTimeMillis()%1000
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Date now = new Date();
            String strDate = sdf.format(now);
            System.out.println(strDate+" : I am thread " + this.id + " Printing " + i);
        }
    }
    
    
}
