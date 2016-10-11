/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app1;

/**
 *
 * @author x14110784
 */
public class FileIO {
    private String name; 
    private int mark;
    private String subj;
    
    public FileIO(String name, int mark, String subj){
        this.name = name;
        this.mark = mark;
        this.subj = subj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return mark;
    }

    public void setMarks(int mark) {
        this.mark = mark;
    }
    
     public String getSubj() {
        return subj;
    }

    public void setSubj(String subj) {
        this.subj = subj;
    }
    public String getDetails(){
        return "Employee Name: "+name+"\nYour Marks:"+mark +"\nYour Subject"+ subj;
    }
    
}
