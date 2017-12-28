/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aymantestingfiles;

import java.io.*;
import java.nio.charset.CharsetEncoder;

/**
 *
 * @author ASUS
 */
public class MyFiles {
    public BufferedWriter BW;
    public MyFiles(String FileName) throws IOException
    {
        BW=new BufferedWriter(new FileWriter(FileName,true));
        
       // BW=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileName,true),"UTF-8"));
    }
    

}
