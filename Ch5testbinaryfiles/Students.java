/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aymantestbinaryfiles;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Students implements Serializable{
     public int id;
    public String FullName;
    public int age;
    public double []SubjectsFall;
    public Students(int id, String FullName,int age,double []SubjectsFall)
    {
        this.id=id;
        this.FullName=FullName;
        this.age=age;
        this.SubjectsFall=SubjectsFall;
    }
    public Students()
    {
        SubjectsFall=new double[5];
        
    }
}
