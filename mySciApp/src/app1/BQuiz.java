/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x14110831
 */
public class BQuiz extends javax.swing.JFrame {

    DummyAnswers dA = new DummyAnswers();

    private ArrayList<String> ansList;
    private ArrayList<String> ansList2;

    private ArrayList<String> answers;
    private ArrayList<String> questions;

    private ArrayList<String> questions2;
    private ArrayList<String> answers2;

    private ArrayList<Integer> marks;

    private int score;
    private String name;
    private String printableTotal;
    private int mark;
    private String subj;

    /**
     * Creates new form BQuiz
     */
    public BQuiz() {
        initComponents();

        subj = "Biology";
        name = JOptionPane.showInputDialog("Please enter your name");

        //Calls method from instansiable class 
        dA.fillerAnswers();
        ansList = dA.getDumQuest();
        ansList2 = dA.getDumQuest2();

        marks = new ArrayList<>();

        answers = new ArrayList<>();
        questions = new ArrayList<>();

        questions2 = new ArrayList<>();
        answers2 = new ArrayList<>();

        String quest1 = "Ordinary table salt is sodium chloride. What is baking soda?";
        String quest2 = "Ozone hole refers to";
        String quest3 = "Pollination is best defined as";
        String quest4 = "Plants receive their nutrients mainly from";
        String quest5 = "Movement of cell against concentration gradient is called";
        questions.add(quest1);
        questions.add(quest2);
        questions.add(quest3);
        questions.add(quest4);
        questions.add(quest5);

        String answ1 = "Sodium bicarbonate";
        String answ2 = "decrease in thickness of ozone layer in stratosphere";
        String answ3 = "transfer of pollen from anther to stigma";
        String answ4 = "soil";
        String answ5 = "Tactive transport";
        answers.add(answ1);
        answers.add(answ2);
        answers.add(answ3);
        answers.add(answ4);
        answers.add(answ5);

        String quest21 = "Which cell feature is responsible for making proteins??";
        String quest22 = "What is the name of the jelly-like substance that is inside the cell?";
        String quest23 = "What cell feature is responsible for powering the cell?";
        String quest24 = "Where in the cell does DNA replication take place?";
        String quest25 = "What is one major feature that plant cells have that animal cells do not?";
        String quest26 = "What cell feature contains digestive enzymes which breaks things down?";
        String quest27 = "Which cell feature processes proteins?";
        String quest28 = "The plant cell structure where photosynthesis takes place is called..";
        questions2.add(quest21);
        questions2.add(quest22);
        questions2.add(quest23);
        questions2.add(quest24);
        questions2.add(quest25);
        questions2.add(quest26);
        questions2.add(quest27);
        questions2.add(quest28);

        questions2.remove(quest24);

        questions2.add(quest24);

        String answ21 = "Ribosomes";
        String answ22 = "Cytoplasm";
        String answ23 = "Mitochondria";
        String answ24 = "Cell Nucleus";
        String answ25 = "Cell Wall";
        String answ26 = "Lysosomes";
        String answ27 = "The Golgi body";
        String answ28 = "Chloroplasts";
        answers2.add(answ21);
        answers2.add(answ22);
        answers2.add(answ23);
        answers2.add(answ24);
        answers2.add(answ25);
        answers2.add(answ26);
        answers2.add(answ27);
        answers2.add(answ28);

        //ComboBox1 Options
        cmbBox1.addItem(answers2.get(0));
        cmbBox1.addItem(ansList2.get(0));
        cmbBox1.addItem(ansList.get(0));

        //comboBox2 Options
        cmbBox2.addItem(answers2.get(1));
        cmbBox2.addItem(ansList2.get(1));
        cmbBox2.addItem(ansList.get(1));

        //comboBox3 Options
        cmbBox3.addItem(ansList.get(2));
        cmbBox3.addItem(ansList2.get(2));
        cmbBox3.addItem(answers2.get(2));

        //comboBox4 Options
        cmbBox4.addItem(ansList.get(3));
        cmbBox4.addItem(answers2.get(3));
        cmbBox4.addItem(ansList2.get(3));

        //comboBox5 Options
        cmbBox5.addItem(ansList2.get(4));
        cmbBox5.addItem(answers2.get(4));
        cmbBox5.addItem(ansList.get(4));

        //comboBox6 Options
        cmbBox6.addItem(ansList2.get(5));
        cmbBox6.addItem(ansList.get(5));
        cmbBox6.addItem(answers2.get(5));

        //comboBox7 Options
        cmbBox7.addItem(answers2.get(6));
        cmbBox7.addItem(ansList.get(6));
        cmbBox7.addItem(ansList.get(6));

        //comboBox8 Options
        cmbBox8.addItem(ansList.get(7));
        cmbBox8.addItem(ansList.get(7));
        cmbBox8.addItem(answers2.get(7));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        lblQnum1 = new javax.swing.JLabel();
        lblQ1 = new javax.swing.JLabel();
        lblQnum2 = new javax.swing.JLabel();
        lblQ2 = new javax.swing.JLabel();
        lblQnum3 = new javax.swing.JLabel();
        lblQ3 = new javax.swing.JLabel();
        lblQnum4 = new javax.swing.JLabel();
        lblQ4 = new javax.swing.JLabel();
        lblQnum5 = new javax.swing.JLabel();
        lblQ5 = new javax.swing.JLabel();
        lblQnum6 = new javax.swing.JLabel();
        lblQ6 = new javax.swing.JLabel();
        lblQnum7 = new javax.swing.JLabel();
        lblQ7 = new javax.swing.JLabel();
        lblQnum8 = new javax.swing.JLabel();
        lblQ8 = new javax.swing.JLabel();
        cmbBox1 = new javax.swing.JComboBox();
        cmbBox2 = new javax.swing.JComboBox();
        cmbBox3 = new javax.swing.JComboBox();
        cmbBox4 = new javax.swing.JComboBox();
        cmbBox5 = new javax.swing.JComboBox();
        cmbBox6 = new javax.swing.JComboBox();
        cmbBox7 = new javax.swing.JComboBox();
        cmbBox8 = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuReturn = new javax.swing.JMenuItem();
        mnuHome = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biology Quiz (Robbie)");

        lblHeading.setFont(new java.awt.Font("Jing Jing", 0, 18)); // NOI18N
        lblHeading.setText("Biology Quiz");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        lblQnum1.setText("Q1");

        lblQ1.setText("Which cell feature is responsible for making proteins?");

        lblQnum2.setText("Q2");

        lblQ2.setText("What is the name of the jelly-like substance that is inside the cell?");

        lblQnum3.setText("Q3");

        lblQ3.setText("What cell feature is responsible for powering the cell?");

        lblQnum4.setText("Q4");

        lblQ4.setText("Where in the cell does DNA replication take place?");

        lblQnum5.setText("Q5");

        lblQ5.setText("What is one major feature that plant cells have that animal cells do not?");

        lblQnum6.setText("Q6");

        lblQ6.setText("What cell feature contains digestive enzymes which breaks things down?");

        lblQnum7.setText("Q7");

        lblQ7.setText("Which cell feature processes proteins?");

        lblQnum8.setText("Q8");

        lblQ8.setText("The plant cell structure where photosynthesis takes place is called...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblQnum8)
                            .addGap(18, 18, 18)
                            .addComponent(lblQ8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblQnum7)
                            .addGap(18, 18, 18)
                            .addComponent(lblQ7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblQnum4)
                            .addGap(18, 18, 18)
                            .addComponent(lblQ4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblQnum2)
                            .addGap(18, 18, 18)
                            .addComponent(lblQ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblQnum1)
                            .addGap(18, 18, 18)
                            .addComponent(lblQ1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblQnum3)
                            .addGap(18, 18, 18)
                            .addComponent(lblQ3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblQnum5)
                            .addGap(18, 18, 18)
                            .addComponent(lblQ5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQnum6)
                        .addGap(18, 18, 18)
                        .addComponent(lblQ6, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(Reset))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lblHeading)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnum1)
                    .addComponent(lblQ1)
                    .addComponent(cmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnum2)
                    .addComponent(lblQ2)
                    .addComponent(cmbBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnum3)
                    .addComponent(lblQ3)
                    .addComponent(cmbBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnum4)
                    .addComponent(lblQ4)
                    .addComponent(cmbBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnum5)
                    .addComponent(lblQ5)
                    .addComponent(cmbBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnum6)
                    .addComponent(lblQ6)
                    .addComponent(cmbBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnum7)
                    .addComponent(lblQ7)
                    .addComponent(cmbBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnum8)
                    .addComponent(lblQ8)
                    .addComponent(cmbBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(Reset))
                .addContainerGap())
        );

        jMenu1.setText("Go Back");

        mnuReturn.setText("Return to biology");
        mnuReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReturnActionPerformed(evt);
            }
        });
        jMenu1.add(mnuReturn);

        mnuHome.setText("Main Menu");
        mnuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHomeActionPerformed(evt);
            }
        });
        jMenu1.add(mnuHome);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");

        mnuExit.setText("Save & Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu2.add(mnuExit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReturnActionPerformed
        new Bio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuReturnActionPerformed

    private void mnuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHomeActionPerformed
        new appFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuHomeActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuExitActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        if (cmbBox1.getSelectedItem().equals(answers2.get(0))) {
            marks.add(10);
        }
        if (cmbBox2.getSelectedItem().equals(answers2.get(1))) {
            marks.add(10);
        }
        if (cmbBox3.getSelectedItem().equals(answers2.get(2))) {
            marks.add(10);
        }
        if (cmbBox4.getSelectedItem().equals(answers2.get(3))) {
            marks.add(10);
        }
        if (cmbBox5.getSelectedItem().equals(answers2.get(4))) {
            marks.add(10);
        }
        if (cmbBox6.getSelectedItem().equals(answers2.get(5))) {
            marks.add(10);
        }
        if (cmbBox7.getSelectedItem().equals(answers2.get(6))) {
            marks.add(10);
        }
        if (cmbBox8.getSelectedItem().equals(answers2.get(7))) {
            marks.add(10);
        }

        for (int i = 0; i < marks.size(); i++) {
            score += (marks.get(i));
        }

        JOptionPane.showMessageDialog(null, "Your test is submitted");
        //JOptionPane.showMessageDialog(null, "Your answerd: "+answers2.size()+" Questions");
        JOptionPane.showMessageDialog(null, "Your Score is" + score + "/80");
        printableTotal = Integer.toString(score);

        //Call on class FileIO.java
        FileIO f = new FileIO(name, mark, subj);
        //set the values to the FileIO class
        f.setName(name);
        f.setMarks(mark);
        f.setSubj(subj);

        //File IO  write name, subject and mark to the file progress.txt
        //Try catch with exception to catch in case of an error 
        try {
            File fi = new File("output.txt");
            FileWriter fw = new FileWriter(fi);
            BufferedWriter bW = new BufferedWriter(fw);

            bW.write("Your Subject: " + f.getSubj() + ".   ");
            bW.write("Your Name: " + f.getName() + ".   ");
            //bWrite.newLine();
            bW.write("Your Score: " + printableTotal + "/80" + ".  ");
            bW.close();
            JOptionPane.showMessageDialog(null, "Hi " + name + " Your Score and Has been saved to 'your progress' page ");

        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println("Problem writing to File");
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        this.dispose();
        new BQuiz().setVisible(true);
    }//GEN-LAST:event_ResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox cmbBox1;
    private javax.swing.JComboBox cmbBox2;
    private javax.swing.JComboBox cmbBox3;
    private javax.swing.JComboBox cmbBox4;
    private javax.swing.JComboBox cmbBox5;
    private javax.swing.JComboBox cmbBox6;
    private javax.swing.JComboBox cmbBox7;
    private javax.swing.JComboBox cmbBox8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQ4;
    private javax.swing.JLabel lblQ5;
    private javax.swing.JLabel lblQ6;
    private javax.swing.JLabel lblQ7;
    private javax.swing.JLabel lblQ8;
    private javax.swing.JLabel lblQnum1;
    private javax.swing.JLabel lblQnum2;
    private javax.swing.JLabel lblQnum3;
    private javax.swing.JLabel lblQnum4;
    private javax.swing.JLabel lblQnum5;
    private javax.swing.JLabel lblQnum6;
    private javax.swing.JLabel lblQnum7;
    private javax.swing.JLabel lblQnum8;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuHome;
    private javax.swing.JMenuItem mnuReturn;
    // End of variables declaration//GEN-END:variables
}
