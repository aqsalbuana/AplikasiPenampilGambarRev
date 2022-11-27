/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author ACER
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButtonFullScreen() {
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

        buttonPanel = new javax.swing.JPanel();
        glassfishBT = new javax.swing.JButton();
        javaeeBT = new javax.swing.JButton();
        postgresqlBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        pilihan = new javax.swing.JPanel();
        postgresqlLB = new javax.swing.JLabel();
        javaeeLB = new javax.swing.JLabel();
        glasfishLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        glassfishBT.setText("GlassFish");
        glassfishBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassfishBTActionPerformed(evt);
            }
        });
        buttonPanel.add(glassfishBT);

        javaeeBT.setText("JavaEE");
        javaeeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaeeBTActionPerformed(evt);
            }
        });
        buttonPanel.add(javaeeBT);

        postgresqlBT.setText("PostgreSQL");
        postgresqlBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgresqlBTActionPerformed(evt);
            }
        });
        buttonPanel.add(postgresqlBT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(exitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        pilihan.setLayout(new java.awt.CardLayout());

        postgresqlLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/postgresql.jpg"))); // NOI18N
        postgresqlLB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        postgresqlLB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pilihan.add(postgresqlLB, "2");

        javaeeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/javaee.jpg"))); // NOI18N
        pilihan.add(javaeeLB, "1");

        glasfishLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/glassfish.jpg"))); // NOI18N
        pilihan.add(glasfishLB, "0");

        getContentPane().add(pilihan, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void glassfishBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassfishBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(pilihan.getLayout());
        cl.show(pilihan, "0");
    }//GEN-LAST:event_glassfishBTActionPerformed

    private void javaeeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaeeBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(pilihan.getLayout());
        cl.show(pilihan, "1");
    }//GEN-LAST:event_javaeeBTActionPerformed

    private void postgresqlBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgresqlBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(pilihan.getLayout());
        cl.show(pilihan, "2");
    
    }//GEN-LAST:event_postgresqlBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                PilihGambarButtonFullScreen fullFrame = new PilihGambarButtonFullScreen();
            
                    GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                    device.setFullScreenWindow(fullFrame);
                    
                    fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitBT;
    private javax.swing.JLabel glasfishLB;
    private javax.swing.JButton glassfishBT;
    private javax.swing.JButton javaeeBT;
    private javax.swing.JLabel javaeeLB;
    private javax.swing.JPanel pilihan;
    private javax.swing.JButton postgresqlBT;
    private javax.swing.JLabel postgresqlLB;
    // End of variables declaration//GEN-END:variables
}
