/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.dbconnector;
import config.login_db;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class registerform extends javax.swing.JFrame {

    
    public registerform() {
        initComponents();
    }
    
   public String hashPassword(String password) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(password.getBytes());
    byte[] digest = md.digest();
    return String.format("%064x", new java.math.BigInteger(1, digest));
}  

     Color navcolor= new Color(204,204,204);
    Color headcolor= new Color(153,153,153);
    Color bodycolor = new Color(153,153,255);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        fname1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        create1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cancel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        time2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        time3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        confirm = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        create = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        click = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 121, 111));
        jPanel1.setLayout(null);

        firstname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(firstname);
        firstname.setBounds(560, 90, 280, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 90, 100, 20);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1000, 60));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 60);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 140, 100, 20);

        lastname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(lastname);
        lastname.setBounds(560, 140, 280, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 330, 180, 20);

        email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(email);
        email.setBounds(560, 190, 280, 30);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Email:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(340, 190, 150, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/336646233_233690649040631_4196703286668098395_n-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 120, 310, 290);

        username.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(username);
        username.setBounds(560, 240, 280, 30);

        jPanel3.setBackground(new java.awt.Color(1, 121, 111));
        jPanel3.setLayout(null);

        fname1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel3.add(fname1);
        fname1.setBounds(560, 120, 280, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("First Name:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(340, 120, 100, 20);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 153, 153));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ATTENDANCE FORM");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1000, 60));

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 940, 60);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("Last Name:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(340, 170, 100, 20);

        lname1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel3.add(lname1);
        lname1.setBounds(560, 170, 280, 30);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("Username:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(340, 270, 100, 20);

        email1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel3.add(email1);
        email1.setBounds(560, 220, 280, 30);

        create1.setBackground(new java.awt.Color(102, 255, 204));
        create1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        create1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create1MouseExited(evt);
            }
        });
        create1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CREATE");
        create1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 14));

        jPanel3.add(create1);
        create1.setBounds(710, 400, 100, 40);

        cancel1.setBackground(new java.awt.Color(102, 255, 204));
        cancel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel1MouseExited(evt);
            }
        });
        cancel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CANCEL");
        cancel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 100, 14));

        jPanel3.add(cancel1);
        cancel1.setBounds(570, 400, 100, 40);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setText("Email:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(340, 230, 150, 20);

        time2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel3.add(time2);
        time2.setBounds(560, 310, 280, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/336646233_233690649040631_4196703286668098395_n-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 120, 310, 290);

        time3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel3.add(time3);
        time3.setBounds(560, 270, 280, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setText("Username:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(340, 240, 100, 20);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setText("Password:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(340, 280, 100, 20);
        jPanel1.add(confirm);
        confirm.setBounds(560, 340, 280, 30);
        jPanel1.add(password);
        password.setBounds(560, 290, 280, 30);

        create.setBackground(new java.awt.Color(102, 255, 204));
        create.setText("CREATE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel1.add(create);
        create.setBounds(730, 380, 110, 30);

        cancel.setBackground(new java.awt.Color(102, 255, 204));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(560, 380, 110, 30);

        click.setBackground(new java.awt.Color(255, 255, 255));
        click.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        click.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        click.setText("Click here to login");
        click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickMouseExited(evt);
            }
        });
        jPanel1.add(click);
        click.setBounds(620, 420, 190, 30);

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

    private void create1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create1MouseClicked

    private void create1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_create1MouseEntered

    private void create1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_create1MouseExited

    private void cancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1MouseClicked

    private void cancel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1MouseEntered

    private void cancel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1MouseExited

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
     String fname = firstname.getText();
         String lname = lastname.getText();
      String mail = email.getText();
        String uname = username.getText();
        String pass = String.valueOf(password.getPassword());
        String cpass = String.valueOf(confirm.getPassword());
        
        if (uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "All Fields Are Required!");
        }else if (pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add a password");
        }else if (!pass.equals(cpass))
        {
            JOptionPane.showMessageDialog(null, "Password Don't Match");
        }
        
        else if (checkUsername(uname))
        {
             JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        else{
        PreparedStatement ps;
ResultSet rs;
String registerUserQuery = "INSERT INTO `user_db`(`f_name`, `l_name`, `email`, `user_name`, `pass_word`, `con_pass`) VALUES (?,?,?,?,?,?)";

try {
    ps = login_db.getConnection().prepareStatement(registerUserQuery);
    ps.setString(1, fname);
    ps.setString(2, lname);
    ps.setString(3, mail);
    ps.setString(4, uname);
    ps.setString(5, hashPassword(pass));
    ps.setString(6, hashPassword(cpass));
    if(ps.executeUpdate() > 0){
        JOptionPane.showMessageDialog(null, "New User Add");
        loginForm lf = new loginForm();
        this.dispose();
        lf.setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
    }
} catch (SQLException ex) {
    Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
}catch (NoSuchAlgorithmException ex) {
    Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex); 
        
        }
        }
    }//GEN-LAST:event_createActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
             loginForm lf = new loginForm();
       lf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseClicked
        this.dispose();
        loginForm sp = new loginForm();
        sp.setVisible(true);
    }//GEN-LAST:event_clickMouseClicked

    private void clickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseEntered
        click.setBackground(bodycolor);
    }//GEN-LAST:event_clickMouseEntered

    private void clickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseExited
        click.setBackground(bodycolor);
    }//GEN-LAST:event_clickMouseExited

     public boolean  checkUsername(String username)
    {
         PreparedStatement ps;      
        ResultSet rs;
        boolean checkUser= false    ;
        
         String query = "SELECT * FROM `user_db` WHERE `user_name`= ?";
         
        try {
            ps = login_db.getConnection().prepareStatement(query);
             ps.setString(1, username);
             
              rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser =true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
        }
          return checkUser; 
    }      
            
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
    private javax.swing.JButton cancel;
    private javax.swing.JPanel cancel1;
    private javax.swing.JLabel click;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JButton create;
    private javax.swing.JPanel create1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField lname1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField time2;
    private javax.swing.JTextField time3;
    private static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
