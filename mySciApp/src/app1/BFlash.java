/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author x14110784
 */
public class BFlash extends Flash {
    //this is a subclass of Flash.java and uses polymorphism to @override the array method from that class to suit this class

    protected ArrayList<ImageIcon> img;
    protected ImageIcon im;

    public BFlash(ArrayList info, String inf,int count,ArrayList img ) {
        super();

    }
     public void setimgArray(){
        //declare and populate array
            img = new ArrayList<ImageIcon>() {
                {
                    add(new ImageIcon(getClass().getResource("/mySciApp/images/biology1.png")));
                    add(new ImageIcon(getClass().getResource("/mySciApp/images/biology2.png")));
                    add(new ImageIcon(getClass().getResource("/mySciApp/images/biology3.png")));
                    add(new ImageIcon(getClass().getResource("/mySciApp/images/biology4.png")));
                    add(new ImageIcon(getClass().getResource("/mySciApp/images/biology5.png")));
                    
                    
                }
            };
    }
     @Override
   public void ItterateArray(){
        if(count<=4 && count>=0){
         im = img.get(count);
         
        
        }
     
    }
}
