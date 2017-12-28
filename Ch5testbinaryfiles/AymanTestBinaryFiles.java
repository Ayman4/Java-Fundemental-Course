/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aymantestbinaryfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class AymanTestBinaryFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        /*Students x=new Students(1, "ay haga", 23, null);
        Students y=new Students(2, "Mohsen", 23, null);
        
        ObjectOutputStream apo=new ObjectOutputStream(new FileOutputStream("d:\\JavaFiles\\Nabawy.txt",true));
        apo.writeObject(x);
        apo.reset();
        apo.writeObject(y);
        apo.close();
        
        */
        
        /*
        ObjectInputStream Inp=new ObjectInputStream(new FileInputStream("d:\\JavaFiles\\Nabawy.txt"));
        Students fff=(Students)Inp.readObject();
        System.out.println(fff.FullName);
        fff=(Students)Inp.readObject();
        System.out.println(fff.FullName);
        */
        
        
        
        Students Ahmed=new Students();
        Ahmed.FullName="Fady Ibrahim Essmat";
        Ahmed.id=12;
        Ahmed.SubjectsFall[0]=100;
        Ahmed.SubjectsFall[1]=56;
        Ahmed.SubjectsFall[2]=95;
        
        ObjectOutputStream Bin=new ObjectOutputStream(new FileOutputStream("d:\\JavaFiles\\MIUF17G2.txt",true));
        Bin.writeObject(Ahmed);
        Bin.close();
        ObjectInputStream Inp1=new ObjectInputStream(new FileInputStream("d:\\JavaFiles\\MIUF17G2.txt"));
        Students fffx=(Students)Inp1.readObject();
        System.out.println(fffx.FullName);
        System.out.println("Scores" +fffx.SubjectsFall[0]);
        
        
        Students []Array=new Students[5];
        double []Scores={32,45,88,98.5,30.5};
        Array[0]=new Students(1,"Ayman Ezzat",19,Scores);
        Array[1]=new Students(2,"Second Students",29,Scores);
        Array[2]=new Students(3,"Third Students",39,Scores);
        Array[3]=new Students(4,"Forth Students",49,Scores);
        Array[4]=new Students(5,"Fifth Students",59,Scores);
        Bin=new ObjectOutputStream(new FileOutputStream("d:\\JavaFiles\\TestBinary.bin"));
        Bin.writeObject(Array);
        Bin.close();
        Array=null;
        Inp1=new ObjectInputStream(new FileInputStream("d:\\JavaFiles\\TestBinary.bin"));
        Array=(Students[])Inp1.readObject();
        System.out.println(Array[0].FullName);
      System.out.println(Array[0].SubjectsFall[0]);
        
      
      Object[] arr = new Object[6];

arr[0] = new String("First Pair");
arr[1] = new Integer(1);
arr[2] = new String("Second Pair");
arr[3] = Ahmed;
arr[4] = new String("Third Pair");
arr[5] = new Integer(3);
        System.out.println("Arr [3]"+ ((Students)arr[3]).FullName);
//System.out.println(((Students)arr[3]).);
        
    }
    
}
