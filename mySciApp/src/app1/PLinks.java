/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.awt.Desktop;
import java.net.URL;

/**
 *
 * @author Sam Conneely
 */
public class PLinks extends javax.swing.JFrame {

    /**
     * Creates new form PLinks
     */
    public PLinks() {
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

        background = new javax.swing.JPanel();
        pLinks = new javax.swing.JLabel();
        pSitesBack = new javax.swing.JPanel();
        pSites = new javax.swing.JLabel();
        pLinkBtn1 = new javax.swing.JButton();
        pLinkBtn2 = new javax.swing.JButton();
        pGamesBack = new javax.swing.JPanel();
        pGames = new javax.swing.JLabel();
        pLinkBtn3 = new javax.swing.JButton();
        pLinkBtn4 = new javax.swing.JButton();
        pLinkMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuReturn = new javax.swing.JMenuItem();
        mnuHome = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Physics Links (Sam)");

        pLinks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pLinks.setText("Links");

        pSites.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pSites.setText("Physics Sites");

        pLinkBtn1.setText("www.physicsclassroom.com");
        pLinkBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pLinkBtn1ActionPerformed(evt);
            }
        });

        pLinkBtn2.setText("www.physics.org");
        pLinkBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pLinkBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSitesBackLayout = new javax.swing.GroupLayout(pSitesBack);
        pSitesBack.setLayout(pSitesBackLayout);
        pSitesBackLayout.setHorizontalGroup(
            pSitesBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSitesBackLayout.createSequentialGroup()
                .addGroup(pSitesBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSitesBackLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(pSites)
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addGroup(pSitesBackLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pLinkBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pSitesBackLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pLinkBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pSitesBackLayout.setVerticalGroup(
            pSitesBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSitesBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSites)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pLinkBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pLinkBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pGames.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pGames.setText("Physics Games");

        pLinkBtn3.setText("www.physicsgames.net");
        pLinkBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pLinkBtn3ActionPerformed(evt);
            }
        });

        pLinkBtn4.setText("www.hoodamath.com");
        pLinkBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pLinkBtn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pGamesBackLayout = new javax.swing.GroupLayout(pGamesBack);
        pGamesBack.setLayout(pGamesBackLayout);
        pGamesBackLayout.setHorizontalGroup(
            pGamesBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGamesBackLayout.createSequentialGroup()
                .addGroup(pGamesBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGamesBackLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pLinkBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pGamesBackLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(pGames)
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(pGamesBackLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pLinkBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pGamesBackLayout.setVerticalGroup(
            pGamesBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGamesBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pGames)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pLinkBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pLinkBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(pSitesBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pGamesBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(pLinks)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLinks)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pSitesBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pGamesBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("Go Back");

        mnuReturn.setText("Return to Physics");
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

        pLinkMenuBar.add(jMenu1);

        jMenu2.setText("Exit");

        mnuExit.setText("Save & Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu2.add(mnuExit);

        pLinkMenuBar.add(jMenu2);

        setJMenuBar(pLinkMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void pLinkBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pLinkBtn1ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.physicsclassroom.com/").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pLinkBtn1ActionPerformed

    private void pLinkBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pLinkBtn2ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.physics.org/").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pLinkBtn2ActionPerformed

    private void pLinkBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pLinkBtn3ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.physicsgames.net/").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pLinkBtn3ActionPerformed

    private void pLinkBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pLinkBtn4ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.hoodamath.com/games/physics.html").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pLinkBtn4ActionPerformed

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
            java.util.logging.Logger.getLogger(PLinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PLinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuHome;
    private javax.swing.JMenuItem mnuReturn;
    private javax.swing.JLabel pGames;
    private javax.swing.JPanel pGamesBack;
    private javax.swing.JButton pLinkBtn1;
    private javax.swing.JButton pLinkBtn2;
    private javax.swing.JButton pLinkBtn3;
    private javax.swing.JButton pLinkBtn4;
    private javax.swing.JMenuBar pLinkMenuBar;
    private javax.swing.JLabel pLinks;
    private javax.swing.JLabel pSites;
    private javax.swing.JPanel pSitesBack;
    // End of variables declaration//GEN-END:variables
}
