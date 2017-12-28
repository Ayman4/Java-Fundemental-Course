/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aymantestingfiles;

import com.sun.media.jfxmedia.events.NewFrameEvent;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ASUS
 */
public class AymanTestingFiles {

    /**
     * @param args the command line arguments
     */
    public static String Encrypt2 (String Word,int key)
    {
       String result="";
       for (int i=0;i<Word.length();i++)
        {
            result+=(char)(Word.charAt(i)+key+i);
        }
       return result;
    }
     public static String Decrypt2 (String Word,int key)
    {
       String result="";
       for (int i=0;i<Word.length();i++)
        {
            result+=(char)(Word.charAt(i)-key-i);
        }
       return result;
    }
    public static String Encrypt (String Word, int key)
    {
        String result="";
        for (int i=0;i<Word.length();i++)
        {
            result+=(char)(Word.charAt(i)+key);
        }
        return result;
    }
    
    public static ArrayList<String> Tokens(String Line,char seprator)
    {   ArrayList<String> Result=new ArrayList<String>();
        String Word="";
        for (int i=0;i<Line.length();i++)
        {
            if (Line.charAt(i)!=seprator)
            {Word+=Line.charAt(i);}
            else
            {
            Result.add(Word);
            Word=new String();
            }
        }
        return Result;
    }
    public static void main(String[] args) throws IOException{
        
      
                String abc="Cute Cat";
                System.out.println("Cute cat =" +Encrypt2(abc, 1));
        // TODO code application logic here
//        FileWriter FW=new FileWriter("d:\\JavaFiles\\TestJavatxtFiles.txt",true);//true or false means open for append or not
//        
//        FW.write("I go to School by Bus");
//        FW.write("Second Line");
//        FW.write("\r\n Third Line");
//        FW.write("\r\n 4th Line");
////FW.flush();
//    FW.close();
      
        //Encryption program
        /*
        File MyFile=new File ("d:\\JavaFiles\\TestJava.txt" );
        PrintWriter PW=new PrintWriter("d:\\JavaFiles\\MIUG2_V2.txt");
        Scanner scan=new Scanner(MyFile);
       // scan=new Scanner(System.in);
        int i=1;
        while (scan.hasNext())
        {
            String Line=scan.nextLine();
            System.out.println(Line);
            String MyEncryptedWord=Encrypt2(Line, 1);
            System.out.println("Encrypted = " + MyEncryptedWord);
            //String Ali=Encrypt2(Line, 1);
            //System.out.println("Encrypted " + Ali);
        
            
            //String EncLine=Encrypt2(Line,1);
               PW.println(MyEncryptedWord);
            //System.out.println("Line "+ i + " - "+ Line);
            //i++;
              //      
        }
        PW.close();
/*
        //Decrypting
       PW=new PrintWriter("d:\\JavaFiles\\Decrypt.txt");
       scan=new Scanner(new File("d:\\JavaFiles\\Encrypt.txt"));
       i=1;
        while (scan.hasNext())
        {
            String Line=scan.nextLine();
            String EncLine=Decrypt2(Line,1);
            PW.println(EncLine);
            System.out.println("Line "+ i + " - "+ Line);
            i++;
        }
        PW.close();
        
    /*    
        
        Student Ahmed=new Student();
        Ahmed.FullName="Ahmed Mohamed Ahmed";
        Ahmed.age=12;
        Ahmed.id=1;
        Student Mohamed=new Student();
        Mohamed.id=2;
        Mohamed.age=19;
        Mohamed.FullName="Mohamed Ibrahim";
        
    PrintWriter NewFile=new PrintWriter("d:\\JavaFiles\\StoreStudent.txt");
    NewFile.println(Ahmed.id + "@" + Ahmed.age+ "@" + Ahmed.FullName+ "@" );
    NewFile.println(Mohamed.id + "@" + Mohamed.age+ "@" + Mohamed.FullName+ "@");
    NewFile.close();
    File NewFile1=new File("d:\\JavaFiles\\StoreStudent.txt");
    Scanner scan1=new Scanner(NewFile1);
    Student []AllStudents=new Student[5];
    int j=0;
    while (scan1.hasNext())
        {
            AllStudents[j]=new Student();
            String Line=scan1.nextLine();
            
            ArrayList<String> Seprated=Tokens(Line, '@');
            AllStudents[j].id=Integer.parseInt(Seprated.get(0));
            AllStudents[j].age=Integer.parseInt(Seprated.get(1));
            AllStudents[j].FullName=Seprated.get(2);
            System.out.println("All student ID= " + AllStudents[j].id + " FULL Name= "+AllStudents[j].FullName + " Age= "+AllStudents[j].age);
          j++;
        }
    
    
		StringTokenizer st2 = new StringTokenizer("12@1234@Ayman Mohamed Ezzat@GPA=2.3", "@");

		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
              */
              /* Scanner sc=new Scanner(System.in);
              // int x=sc.nextInt();
               */
               
        
        
        URL l=new URL("http://www.miuegypt.edu.eg");
               Scanner xn;
             PrintWriter html=new PrintWriter(new File("d:\\website.html"));
               try
               {
                xn=new Scanner(l.openStream());
               int Counter=0;
                while (xn.hasNext())
                {
                    
                    String L=xn.nextLine();
                    if (L.indexOf("student")>0)
                    {
                        Counter++;
                    }
                    html.println(L);
                    System.out.println(L);
                }
                   System.out.println("Word was stated " + Counter);
                html.close();
                xn.close();
                }
               catch (Exception ex)
               {
                   System.out.println("EX=" + ex.getMessage());
               }
      /*  URL url = new URL("http://www.miuegypt.edu.eg");
InputStream is = url.openConnection().getInputStream();

BufferedReader reader = new BufferedReader( new InputStreamReader( is )  );

String line = null;
while( ( line = reader.readLine() ) != null )  {
   System.out.println(line);
}
reader.close();
  */             
    }
    
  
    
}
