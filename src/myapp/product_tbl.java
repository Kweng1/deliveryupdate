/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.dbconnector;
import internalPages.dashBoardPage;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author admin
 */
public class product_tbl extends javax.swing.JFrame {

    /**
     * Creates new form product_tbl
     */
    public product_tbl() {
        initComponents();
    }
     public void displayData(){
       
        try{
       
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT * FROM product_tbl");
            product_tbl.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    }
     
     public void reset(){
           
        pname.setText("");
        ps.setText("");
        pm.setText("");
        pl.setText("");
        pid.setText("");
        
        
    }
     
       Color navcolor= new Color(204,204,204);
    Color headcolor= new Color(153,153,153);
    Color bodycolor = new Color(153,153,255);
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_tbl = new javax.swing.JTable();
        add = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        ps = new javax.swing.JTextField();
        pm = new javax.swing.JTextField();
        pl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        product_tbl.setBackground(new java.awt.Color(204, 204, 204));
        product_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(product_tbl);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(482, 0, 440, 470);

        add.setBackground(new java.awt.Color(153, 153, 153));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ADD");
        add.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        jPanel1.add(add);
        add.setBounds(10, 110, 80, 40);

        update.setBackground(new java.awt.Color(153, 153, 153));
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("UPDATE");
        update.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        jPanel1.add(update);
        update.setBounds(100, 110, 80, 40);

        delete.setBackground(new java.awt.Color(153, 153, 153));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DELETE");
        delete.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        jPanel1.add(delete);
        delete.setBounds(190, 110, 80, 40);

        clear.setBackground(new java.awt.Color(153, 153, 153));
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CLEAR");
        clear.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        jPanel1.add(clear);
        clear.setBounds(280, 110, 80, 40);

        refresh.setBackground(new java.awt.Color(153, 153, 153));
        refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("REFRESH");
        refresh.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        jPanel1.add(refresh);
        refresh.setBounds(370, 110, 80, 40);

        pname.setBackground(new java.awt.Color(153, 153, 153));
        pname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(pname);
        pname.setBounds(160, 270, 250, 30);

        ps.setBackground(new java.awt.Color(153, 153, 153));
        ps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ps);
        ps.setBounds(160, 320, 250, 30);

        pm.setBackground(new java.awt.Color(153, 153, 153));
        pm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(pm);
        pm.setBounds(160, 370, 250, 30);

        pl.setBackground(new java.awt.Color(153, 153, 153));
        pl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(pl);
        pl.setBounds(160, 420, 250, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PRODUCT NAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 270, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("P_ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 220, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MEDIUM:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 370, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("LARGE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 420, 60, 30);

        pid.setBackground(new java.awt.Color(153, 153, 153));
        pid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        jPanel1.add(pid);
        pid.setBounds(160, 220, 250, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("SMALL:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 320, 60, 30);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCT LIST");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 40, 170, 40);

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-left-arrow-30.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 10, 40, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        dbconnector dbc = new dbconnector();
        dbc.insertData("INSERT INTO product_tbl ( p_name, p_small, p_medium, p_large) "
                
            + "VALUES ( '"+pname.getText()+"','"+ps.getText()+"','"+pm.getText()+"','"+pl.getText()+"')");
        displayData();
        reset();
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(headcolor);
    }//GEN-LAST:event_addMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        dbconnector dbc = new dbconnector();
        int num = dbc.updateData("UPDATE product_tbl "
                + "SET p_name = '"+pname.getText()+"', p_small='"+ps.getText()+"', "
                        + "p_medium ='"+pm.getText()+"', p_large='"+pl.getText()+"'  "
                                + "WHERE p_id = '"+pid.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displayData();
           reset();
        }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(bodycolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
       update.setBackground(headcolor);
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
      int rowIndex = product_tbl.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = product_tbl.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                            dbconnector dbc = new dbconnector();
                            dbc.deletedata(Integer.parseInt(id));
                            displayData();
                            reset();
                    }    
       }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(headcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
       pid.setText(null);
         pname.setText(null);
         ps.setText(null);
         pm.setText(null);
         pl.setText(null);
    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(bodycolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
         clear.setBackground(headcolor);
    }//GEN-LAST:event_clearMouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
       refresh.setBackground(bodycolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(headcolor);
    }//GEN-LAST:event_refreshMouseExited

    private void product_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tblMouseClicked
       int rowIndex = product_tbl.getSelectedRow();
      if(rowIndex < 0){
          
      }else{
          TableModel model = product_tbl.getModel();
          pid.setText(""+model.getValueAt(rowIndex, 0));
          pname.setText(""+model.getValueAt(rowIndex, 1));
          ps.setText(""+model.getValueAt(rowIndex, 2));
          pm.setText(""+model.getValueAt(rowIndex, 3));
          pl.setText(""+model.getValueAt(rowIndex, 4));
          
      }
    }//GEN-LAST:event_product_tblMouseClicked

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
      dashBoardPage sf = new dashBoardPage();
        sf.setVisible(true);
         this.setVisible(false);
           this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
           this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(bodycolor);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(headcolor);
    }//GEN-LAST:event_backMouseExited

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
            java.util.logging.Logger.getLogger(product_tbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_tbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_tbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_tbl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_tbl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JLabel back;
    private javax.swing.JPanel clear;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pl;
    private javax.swing.JTextField pm;
    private javax.swing.JTextField pname;
    private javax.swing.JTable product_tbl;
    private javax.swing.JTextField ps;
    private javax.swing.JPanel refresh;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
