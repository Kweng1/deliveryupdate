/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import myapp.product_tbl;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import myapp.loginForm;
/**
 *
 * @author admin
 */
public class dashBoardPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashBoardPage
     */
    public dashBoardPage() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
     Color navcolor= new Color(0,204,204);
    Color headcolor= new Color(153,153,153);
    Color bodycolo = new Color(153,153,255);
    Color body = new Color (1,121,111);
    Color bodycolor = new Color (4,57,39);

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        manageuser = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(760, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DELIVERY TRACKER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 720, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Courier services");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 60, 730, 30);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delivery-64.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 30, 180, 110);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 130));

        jPanel2.setBackground(new java.awt.Color(1, 121, 111));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageuser.setBackground(new java.awt.Color(204, 255, 204));
        manageuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageuser.setPreferredSize(new java.awt.Dimension(160, 160));
        manageuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageuserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageuserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageuserMouseExited(evt);
            }
        });
        manageuser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delivery-96.png"))); // NOI18N
        manageuser.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 90));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRODUCT");
        manageuser.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 30));

        jPanel2.add(manageuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 140, 130));

        logout.setBackground(new java.awt.Color(204, 255, 204));
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logout.setPreferredSize(new java.awt.Dimension(160, 160));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-log-out-100.png"))); // NOI18N
        logout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 90));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGOUT");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        logout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 20));

        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 870, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseEntered
       manageuser.setBackground(navcolor);
    }//GEN-LAST:event_manageuserMouseEntered

    private void manageuserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseExited
         manageuser.setBackground(body);
    }//GEN-LAST:event_manageuserMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        JFrame mainFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        loginForm lf = new loginForm();
        lf.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(navcolor);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(body);
    }//GEN-LAST:event_logoutMouseExited

    private void manageuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseClicked
        product_tbl sf = new product_tbl();
        sf.setVisible(true);
         this.setVisible(false);
           this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
           this.dispose();
        
    }//GEN-LAST:event_manageuserMouseClicked
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel manageuser;
    // End of variables declaration//GEN-END:variables
}
