/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Sam Conneely
 */
public class PFlashC extends javax.swing.JFrame {

    /**
     * Creates new form PFlashC
     */
    public PFlashC() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgrond = new javax.swing.JPanel();
        pNotesName = new javax.swing.JLabel();
        pNotesPic = new javax.swing.JLabel();
        pNotesStart = new javax.swing.JButton();
        pNotesPause = new javax.swing.JButton();
        pNotesNext = new javax.swing.JButton();
        pNotesEnd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pNotesText = new javax.swing.JTextArea();
        pFCMenuBar = new javax.swing.JMenuBar();
        mnu = new javax.swing.JMenu();
        mnuReturn = new javax.swing.JMenuItem();
        mnuHome = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Physics Flash C (Sam)");

        pNotesName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pNotesName.setText("Physics notes");

        pNotesPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app1/physics.png"))); // NOI18N
        pNotesPic.setFocusable(false);

        pNotesStart.setText("<<");
        pNotesStart.setToolTipText("Back");

        pNotesPause.setText("||");
        pNotesPause.setToolTipText("Pause");

        pNotesNext.setText("|>");
        pNotesNext.setToolTipText("Play");

        pNotesEnd.setText(">>");
        pNotesEnd.setToolTipText("Forward");

        pNotesText.setEditable(false);
        pNotesText.setColumns(20);
        pNotesText.setLineWrap(true);
        pNotesText.setRows(5);
        pNotesText.setText("Mechanics is the study of motion, force and energy. The basic terminology used in physics includes words like velocity, acceleration, momentum, force, power, weight, etc. Such words have a general meaning in everyday vocabulary, but in physics, they have very specific meanings, and it is essential to know their exact meanings.");
        jScrollPane1.setViewportView(pNotesText);

        javax.swing.GroupLayout backgrondLayout = new javax.swing.GroupLayout(backgrond);
        backgrond.setLayout(backgrondLayout);
        backgrondLayout.setHorizontalGroup(
            backgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrondLayout.createSequentialGroup()
                .addGroup(backgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgrondLayout.createSequentialGroup()
                        .addGroup(backgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgrondLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(pNotesStart)
                                .addGap(18, 18, 18)
                                .addComponent(pNotesPause)
                                .addGap(18, 18, 18)
                                .addComponent(pNotesNext)
                                .addGap(18, 18, 18)
                                .addComponent(pNotesEnd))
                            .addGroup(backgrondLayout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(pNotesName)))
                        .addGap(0, 215, Short.MAX_VALUE))
                    .addGroup(backgrondLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(backgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pNotesPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        backgrondLayout.setVerticalGroup(
            backgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrondLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pNotesName)
                .addGap(18, 18, 18)
                .addComponent(pNotesPic, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pNotesStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pNotesPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pNotesNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pNotesEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mnu.setText("Go Back");

        mnuReturn.setText("Return to Physics");
        mnuReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReturnActionPerformed(evt);
            }
        });
        mnu.add(mnuReturn);

        mnuHome.setText("Main Menu");
        mnuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHomeActionPerformed(evt);
            }
        });
        mnu.add(mnuHome);

        pFCMenuBar.add(mnu);

        jMenu2.setText("Exit");

        mnuExit.setText("Save & Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu2.add(mnuExit);

        pFCMenuBar.add(jMenu2);

        setJMenuBar(pFCMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgrond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgrond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReturnActionPerformed
        new Physic().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuReturnActionPerformed

    private void mnuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHomeActionPerformed
        new appFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuHomeActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuExitActionPerformed

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
            java.util.logging.Logger.getLogger(PFlashC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PFlashC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PFlashC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PFlashC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PFlashC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgrond;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnu;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuHome;
    private javax.swing.JMenuItem mnuReturn;
    private javax.swing.JMenuBar pFCMenuBar;
    private javax.swing.JButton pNotesEnd;
    private javax.swing.JLabel pNotesName;
    private javax.swing.JButton pNotesNext;
    private javax.swing.JButton pNotesPause;
    private javax.swing.JLabel pNotesPic;
    private javax.swing.JButton pNotesStart;
    private javax.swing.JTextArea pNotesText;
    // End of variables declaration//GEN-END:variables
}
