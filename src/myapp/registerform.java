/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class registerform extends javax.swing.JFrame {

    
    public registerform() {
        initComponents();
    }

     Color navcolor= new Color(204,204,204);
    Color headcolor= new Color(153,153,153);
    Color bodycolor = new Color(153,153,255);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        create = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 121, 111));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(540, 80, 280, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 80, 100, 20);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1000, 60));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 60);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 130, 100, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(540, 130, 280, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 230, 100, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(540, 180, 280, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(540, 330, 280, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Confirm Password:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 330, 170, 20);

        create.setBackground(new java.awt.Color(102, 255, 204));
        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createMouseExited(evt);
            }
        });
        create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CREATE");
        create.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 14));

        jPanel1.add(create);
        create.setBounds(790, 400, 100, 40);

        cancel.setBackground(new java.awt.Color(102, 255, 204));
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CANCEL");
        cancel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 100, 14));

        jPanel1.add(cancel);
        cancel.setBounds(660, 400, 100, 40);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Phone Number:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 190, 150, 20);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Password:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 280, 100, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(540, 230, 280, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/336646233_233690649040631_4196703286668098395_n-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 120, 310, 290);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(540, 280, 280, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
       cancel.setBackground(headcolor);
    }//GEN-LAST:event_cancelMouseEntered

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
       loginForm lf = new loginForm();
       lf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_createMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
       create.setBackground(headcolor);
       
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
       create.setBackground(navcolor);
    }//GEN-LAST:event_createMouseExited

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
       cancel.setBackground(navcolor);
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
       loginForm lf = new loginForm();
       lf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JPanel create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
