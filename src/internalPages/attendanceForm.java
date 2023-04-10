/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.dbconnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author admin
 */
public class attendanceForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form userPage
     */
    public attendanceForm() {
        initComponents();
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
       
    }
    public void displayData(){
       
        try{
       
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT * FROM attndance_form");
            attendance_tbl.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    }
    
    public void reset(){
        
       
        lname.setText("");
        email.setText("");
        time.setText("");
        fname.setText("");
        
         
        
        
    }
    
    
     Color navcolor= new Color(0,204,204);
    Color headcolor= new Color(0,255,204);
    Color bodycolor = new Color(0,204,102);
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        insertData = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendance_tbl = new javax.swing.JTable();
        delete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        clear = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        refresh = new javax.swing.JPanel();
        REFRESH = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(736, 436));

        jPanel1.setBackground(new java.awt.Color(1, 121, 111));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCT LIST");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 240, 30));

        insertData.setBackground(new java.awt.Color(0, 255, 204));
        insertData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertDataMouseExited(evt);
            }
        });
        insertData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ADD");
        insertData.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(insertData, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 80, 30));

        update.setBackground(new java.awt.Color(0, 255, 204));
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

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("UPDATE");
        update.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 80, 30));

        attendance_tbl.setBackground(new java.awt.Color(0, 204, 204));
        attendance_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendance_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(attendance_tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 330, 320));

        delete.setBackground(new java.awt.Color(0, 255, 204));
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

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DELETE");
        delete.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 80, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Time In:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Firstname:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 30));

        time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 220, 30));

        lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 220, 30));

        clear.setBackground(new java.awt.Color(0, 255, 204));
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

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CLEAR");
        clear.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 80, 30));

        print.setBackground(new java.awt.Color(0, 255, 204));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRINT");
        print.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 80, 30));

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 220, 30));

        refresh.setBackground(new java.awt.Color(0, 255, 204));
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

        REFRESH.setBackground(new java.awt.Color(153, 153, 153));
        REFRESH.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        REFRESH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REFRESH.setText("REFRESH");
        refresh.add(REFRESH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 80, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("Lastname:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
          clear.setBackground(headcolor);
    }//GEN-LAST:event_clearMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
         clear.setBackground(bodycolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        
         lname.setText(null);
         time.setText(null);        
         fname.setText(null);
         email.setText(null);
         
         
            
    }//GEN-LAST:event_clearMouseClicked

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(headcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       int rowIndex = attendance_tbl.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = attendance_tbl.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                            dbconnector dbc = new dbconnector();
                            int cid = Integer.parseInt(id);
                            dbc.deleteData(cid,"attendance_form","af_name");
                            displayData();
                            reset();
                    }    
       }
    }//GEN-LAST:event_deleteMouseClicked

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(headcolor);
    }//GEN-LAST:event_updateMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(bodycolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        dbconnector dbc = new dbconnector();
        int num = dbc.updateData("UPDATE attendance_form "
                + "SET af_name = '"+fname.getText()+"', al_name='"+lname.getText()+"', " + "a_email ='"+email.getText()+"', a_time='"+time.getText()+"'  "
                                + "WHERE af_name = '"+fname.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displayData();
           reset();
        }
    }//GEN-LAST:event_updateMouseClicked

    private void insertDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertDataMouseExited
        insertData.setBackground(headcolor);
    }//GEN-LAST:event_insertDataMouseExited

    private void insertDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertDataMouseEntered
        insertData.setBackground(bodycolor);
    }//GEN-LAST:event_insertDataMouseEntered

    private void insertDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertDataMouseClicked
         dbconnector dbc = new dbconnector();
        dbc.insertData("INSERT INTO attendance_form ( af_name, al_name, a_email, a_time) "
                
            + "VALUES ( '"+lname.getText()+"','"+email.getText()+"','"+time.getText()+"')");
        displayData();
        reset();
    }//GEN-LAST:event_insertDataMouseClicked

    private void attendance_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_tblMouseClicked
       int rowIndex = attendance_tbl.getSelectedRow();
      if(rowIndex < 0){
          
      }else{
          TableModel model = attendance_tbl.getModel();
          fname.setText(""+model.getValueAt(rowIndex, 0));
          lname.setText(""+model.getValueAt(rowIndex, 1));
          email.setText(""+model.getValueAt(rowIndex, 2));
          time.setText(""+model.getValueAt(rowIndex, 3));
         
          
         
          
          
      }
       
    }//GEN-LAST:event_attendance_tblMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        MessageFormat header = new MessageFormat("attendance Form");
       MessageFormat footer = new MessageFormat("Page {0, number,integer}");
       
       try
       {
           attendance_tbl.print(JTable.PrintMode.NORMAL,header,footer);
       }
       
       catch(java.awt.print.PrinterException e)
       {
           System.err.format("No Printer found", e.getMessage());
       }
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(bodycolor);
    }//GEN-LAST:event_printMouseEntered
       
    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(headcolor);
    }//GEN-LAST:event_printMouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
          displayData();
    
    
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
       refresh.setBackground(bodycolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
       refresh.setBackground(headcolor);

    }//GEN-LAST:event_refreshMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel REFRESH;
    private javax.swing.JTable attendance_tbl;
    private javax.swing.JPanel clear;
    private javax.swing.JPanel delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JPanel insertData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel print;
    private javax.swing.JPanel refresh;
    private javax.swing.JTextField time;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
