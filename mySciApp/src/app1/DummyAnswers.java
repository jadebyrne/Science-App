/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app1;
import java.util.ArrayList;

/**
 *
 * @author x14110784
 */
public class DummyAnswers {
    private ArrayList <String> dumAns;
    private ArrayList <String> dumAns2;
    
    
    public void fillerAnswers(){
        dumAns = new ArrayList<String>();
        dumAns2 = new ArrayList<String>();
        
        String da1 = "Pat Butcher";
        String da2 = "Chicken";
        String da3 = "Onion";
        String da4 = "Ferrari";
        String da5 = "Tunafish";
        String da6 = "Bugatti";
        String da7 = "Shaq";
        String da8 = "Pigeon";
        String da9 = "Java";
        String da10 = "Tea";
        
        String d2a1 = "Dog";
        String d2a2 = "Cat";
        String d2a3 = "Hamster";
        String d2a4 = "Fox";
        String d2a5 = "Horse";
        String d2a6 = "Goat";
        String d2a7 = "Penguin";
        String d2a8 = "Monkey";
        String d2a9 = "Giraffe";
        String d2a10 = "Wolf";
        
        dumAns.add(da1);
        dumAns.add(da2);
        dumAns.add(da3);
        dumAns.add(da4);
        dumAns.add(da5);
        dumAns.add(da6);
        dumAns.add(da7);
        dumAns.add(da8);
        dumAns.add(da9);
        dumAns.add(da10);
        
        dumAns2.add(d2a1);
        dumAns2.add(d2a2);
        dumAns2.add(d2a3);
        dumAns2.add(d2a4);
        dumAns2.add(d2a5);
        dumAns2.add(d2a6);
        dumAns2.add(d2a7);
        dumAns2.add(d2a8);
        dumAns2.add(d2a9);
        dumAns2.add(d2a10);
        
        
    }
    public ArrayList<String> getDumQuest(){
        return dumAns;
    }
    public ArrayList<String> getDumQuest2(){
        return dumAns2;
    }
    
}
