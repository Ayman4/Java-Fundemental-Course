/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7ballbar;

/**
 *
 * @author ASUS
 */
public class Chapter7BallBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       BallGame bg=new BallGame();
        //BigContainer bg=new BigContainer();
      bg.setVisible(true);
      bg.move();
    }
    
}
