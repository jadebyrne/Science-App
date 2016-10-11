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
public class Questions {
    private String question;
    private String answer;
    private int score;
    
 public Questions(){
        question = new String();
        answer = new String();
        score = 0;
                
    }
    
    
     public String getQuestionText() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
            
}