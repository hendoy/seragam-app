/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seragamresign;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Donkdot
 */
public class FormSeragamResign extends javax.swing.JFrame {

    /**
     * Creates new form FormSeragamResign
     */
    public FormSeragamResign() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        ResignJco = new javax.swing.JMenu();
        JcoFl = new javax.swing.JMenuItem();
        JcoBaker = new javax.swing.JMenuItem();
        JcoMod = new javax.swing.JMenuItem();
        ResignBt = new javax.swing.JMenu();
        BtKasir = new javax.swing.JMenuItem();
        BtBaker = new javax.swing.JMenuItem();
        BtMod = new javax.swing.JMenuItem();
        BtMe = new javax.swing.JMenuItem();
        DaftarSeragam = new javax.swing.JMenu();
        SeragamJco = new javax.swing.JMenuItem();
        SeragamBt = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ResignJco.setText("Resign Jco");
        ResignJco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ResignJco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResignJcoActionPerformed(evt);
            }
        });

        JcoFl.setText("Casier/FL");
        JcoFl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcoFlActionPerformed(evt);
            }
        });
        ResignJco.add(JcoFl);

        JcoBaker.setText("Baker");
        JcoBaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcoBakerActionPerformed(evt);
            }
        });
        ResignJco.add(JcoBaker);

        JcoMod.setText("MOD");
        JcoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcoModActionPerformed(evt);
            }
        });
        ResignJco.add(JcoMod);

        jMenuBar1.add(ResignJco);

        ResignBt.setText("Resign BreadTalk");
        ResignBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ResignBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResignBtActionPerformed(evt);
            }
        });

        BtKasir.setText("Casier");
        BtKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtKasirActionPerformed(evt);
            }
        });
        ResignBt.add(BtKasir);

        BtBaker.setText("Baker");
        BtBaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBakerActionPerformed(evt);
            }
        });
        ResignBt.add(BtBaker);

        BtMod.setText("MOD");
        BtMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModActionPerformed(evt);
            }
        });
        ResignBt.add(BtMod);

        BtMe.setText("ME");
        BtMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMeActionPerformed(evt);
            }
        });
        ResignBt.add(BtMe);

        jMenuBar1.add(ResignBt);

        DaftarSeragam.setText("Daftar Seragam");
        DaftarSeragam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DaftarSeragam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarSeragamActionPerformed(evt);
            }
        });

        SeragamJco.setText("JCO");
        SeragamJco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeragamJcoActionPerformed(evt);
            }
        });
        DaftarSeragam.add(SeragamJco);

        SeragamBt.setText("BreadTalk");
        SeragamBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeragamBtActionPerformed(evt);
            }
        });
        DaftarSeragam.add(SeragamBt);

        jMenuBar1.add(DaftarSeragam);

        jMenu5.setText("Laporan");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenuItem1.setText("JCO");
        jMenu5.add(jMenuItem1);

        jMenuItem2.setText("BreadTalk");
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(694, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResignJcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResignJcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResignJcoActionPerformed

    private void JcoBakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcoBakerActionPerformed
        // TODO add your handling code here:
        new JcoBaker().setVisible(true);
    }//GEN-LAST:event_JcoBakerActionPerformed

    private void JcoFlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcoFlActionPerformed
        // TODO add your handling code here:
        new JcoFl().setVisible(true);
    }//GEN-LAST:event_JcoFlActionPerformed

    private void JcoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcoModActionPerformed
        // TODO add your handling code here:
        new ModJco().setVisible(true);
    }//GEN-LAST:event_JcoModActionPerformed

    private void DaftarSeragamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarSeragamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DaftarSeragamActionPerformed

    private void ResignBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResignBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResignBtActionPerformed

    private void BtBakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBakerActionPerformed
        // TODO add your handling code here:
        new BtBeker().setVisible(true);
    }//GEN-LAST:event_BtBakerActionPerformed

    private void SeragamJcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeragamJcoActionPerformed
        // TODO add your handling code here:
        new DafSeragamJco().setVisible(true);
    }//GEN-LAST:event_SeragamJcoActionPerformed

    private void SeragamBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeragamBtActionPerformed
        // TODO add your handling code here:
        new DafSeragam().setVisible(true);
    }//GEN-LAST:event_SeragamBtActionPerformed

    private void BtKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtKasirActionPerformed
        // TODO add your handling code here:
        new BtKasir().setVisible(true);
    }//GEN-LAST:event_BtKasirActionPerformed

    private void BtModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModActionPerformed
        // TODO add your handling code here:
        new BtMod().setVisible(true);
    }//GEN-LAST:event_BtModActionPerformed

    private void BtMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMeActionPerformed
        // TODO add your handling code here:
        new BtMe().setVisible(true);
    }//GEN-LAST:event_BtMeActionPerformed

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
            java.util.logging.Logger.getLogger(FormSeragamResign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSeragamResign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSeragamResign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSeragamResign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            SwingUtilities.updateComponentTreeUI(new FormSeragamResign());
        } catch (Exception e) {

        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSeragamResign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtBaker;
    private javax.swing.JMenuItem BtKasir;
    private javax.swing.JMenuItem BtMe;
    private javax.swing.JMenuItem BtMod;
    private javax.swing.JMenu DaftarSeragam;
    private javax.swing.JMenuItem JcoBaker;
    private javax.swing.JMenuItem JcoFl;
    private javax.swing.JMenuItem JcoMod;
    private javax.swing.JMenu ResignBt;
    private javax.swing.JMenu ResignJco;
    private javax.swing.JMenuItem SeragamBt;
    private javax.swing.JMenuItem SeragamJco;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
