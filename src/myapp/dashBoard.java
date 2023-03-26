package myapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import internalPages.*;
import internalPages.dashBoardPage;

public class dashBoard extends javax.swing.JFrame {

    /**
     * Creates new form dashBoard
     */
    public dashBoard() {
        initComponents();
    }
    
    Color navcolor= new Color(0,204,204);
    Color headcolor= new Color(102,102,255);
    Color bodycolo = new Color(102,102,102);
    Color body = new Color (1,121,111);
    Color bodycolor = new Color (4,57,39);

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashpane1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userpane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(0, 204, 204));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane1.setBackground(new java.awt.Color(0, 204, 204));
        dashpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpane1MouseExited(evt);
            }
        });
        dashpane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD");
        dashpane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        navbar.add(dashpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, 40));

        userpane.setBackground(new java.awt.Color(0, 204, 204));
        userpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpaneMouseExited(evt);
            }
        });
        userpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CUSTOMER REPORT");
        userpane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        navbar.add(userpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, 40));

        firstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navbar.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-male-user-100.png"))); // NOI18N
        navbar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 110));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMIN!");
        navbar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WELCOME");
        navbar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, -1));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 180, 470);

        header.setBackground(new java.awt.Color(0, 153, 153));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

        close.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        jPanel1.add(header);
        header.setBounds(180, 0, 770, 40);

        maindesktop.setBackground(new java.awt.Color(1, 121, 111));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APP");
        maindesktop.add(jLabel1);
        jLabel1.setBounds(0, 220, 770, 50);

        jLabel5.setFont(new java.awt.Font("Engravers MT", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DELIVery");
        maindesktop.add(jLabel5);
        jLabel5.setBounds(0, 110, 770, 50);

        jLabel7.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TRACKER");
        maindesktop.add(jLabel7);
        jLabel7.setBounds(0, 170, 770, 50);
        maindesktop.add(jLabel9);
        jLabel9.setBounds(120, 30, 80, 20);

        jPanel1.add(maindesktop);
        maindesktop.setBounds(180, 40, 760, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseEntered
        dashpane1.setBackground(body);
    }//GEN-LAST:event_dashpane1MouseEntered

    private void dashpane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseExited
        dashpane1.setBackground(navcolor);
    }//GEN-LAST:event_dashpane1MouseExited

    private void userpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseEntered
      userpane.setBackground(body);
    }//GEN-LAST:event_userpaneMouseEntered

    private void userpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseExited
         userpane.setBackground(navcolor);
    }//GEN-LAST:event_userpaneMouseExited

    private void userpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseClicked
      userPage up = new userPage();
      maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_userpaneMouseClicked

    private void dashpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseClicked
     dashBoardPage dbp = new dashBoardPage();
     maindesktop.add(dbp).setVisible(true);
    }//GEN-LAST:event_dashpane1MouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

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
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashpane1;
    public static javax.swing.JLabel firstname;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel userpane;
    // End of variables declaration//GEN-END:variables
}
