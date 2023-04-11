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
 * @author SCC-PC
 */
public class orderinfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form orderinfo
     */
    public orderinfo() {
        initComponents();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
     public void displayData(){
       
        try{
       
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT customer_tbl.c_id,"
                    + "customer_tbl.c_name,product_tbl.p_name"
                    + " FROM customer_order LEFT JOIN customer_tbl ON \n" +
                     "customer_order.c_id = customer_tbl.c_id "
                    + "LEFT JOIN product_tbl ON customer_order.p_id = product_tbl.p_id");
            order_table.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    }
    
    public void reset(){
        
       
        cid.setText("");
        status.setText("");
        pid.setText("");
        oid.setText("");
        
        
    }
    
     Color navcolor= new Color(0,204,204);
    Color headcolor= new Color(0,255,204);
    Color bodycolor = new Color(0,204,102);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        search = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        insertData1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        REFRESH = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        oid = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(736, 436));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 121, 111));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("DELIVERY INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        searchbar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchbar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchbar.setOpaque(false);
        searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarActionPerformed(evt);
            }
        });
        jPanel1.add(searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 620, 30));

        search.setBackground(new java.awt.Color(0, 255, 204));
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SEARCH");
        search.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 80, 30));

        insertData1.setBackground(new java.awt.Color(0, 255, 204));
        insertData1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertData1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertData1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertData1MouseExited(evt);
            }
        });
        insertData1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ADD");
        insertData1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(insertData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, 30));

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

        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 80, 30));

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

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

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

        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

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

        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

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

        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        oid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(oid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 220, 20));

        cid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, 20));

        pid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 220, 20));

        status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 220, 20));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Status:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 70, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("P_ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("C_ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("O_ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 40, 20));

        order_table.setBackground(new java.awt.Color(0, 204, 204));
        order_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(order_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 360, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarActionPerformed
        searchbar.setText(null);
    }//GEN-LAST:event_searchbarActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
      DefaultTableModel model = (DefaultTableModel) order_table.getModel();
       TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
       order_table.setRowSorter(obj);
       obj.setRowFilter(RowFilter.regexFilter(searchbar.getText()));

    }//GEN-LAST:event_searchMouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setBackground(bodycolor);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
       search.setBackground(headcolor);
    }//GEN-LAST:event_searchMouseExited

    private void insertData1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertData1MouseClicked
       dbconnector dbc = new dbconnector();
        dbc.insertData("INSERT INTO customer_order (  c_id, cu_name,cu_add,cu_contact,p_id,cu_order,cu_size,cu_quant,cu_price,cu_tp) "
                + "VALUES ( '"+oid.getText()+"','"+cid.getText()+"','"+status.getText()+pid.getText()+ "')");
        displayData();
        reset();
    }//GEN-LAST:event_insertData1MouseClicked

    private void insertData1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertData1MouseEntered
     insertData1.setBackground(bodycolor);
    }//GEN-LAST:event_insertData1MouseEntered

    private void insertData1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertData1MouseExited
        insertData1.setBackground(headcolor);
    }//GEN-LAST:event_insertData1MouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
    dbconnector dbc = new dbconnector();
        int num = dbc.updateData("UPDATE customer_order "
                + "SET o_id = '"+oid.getText()+"', c_id='"+cid.getText()+"', " + "p_id ='"+pid.getText()+"', cu_status='"+status.getText()+"'  "
                                + "WHERE o_id = '"+oid.getText()+"'");
       
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
        int rowIndex = order_table.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = order_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                            dbconnector dbc = new dbconnector();
                             int oid = Integer.parseInt(id);
                            dbc.deleteData(oid,"customer_order","o_id");
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
         oid.setText(null);
         oid.setText(null);
         cid.setText(null);
         status.setText(null);      
         pid.setText(null);
         pid.setText(null);
       
        
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

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
     MessageFormat header = new MessageFormat("Customer Order");
       MessageFormat footer = new MessageFormat("Page {0, number,integer}");
       
       try
       {
           order_table.print(JTable.PrintMode.NORMAL,header,footer);
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

    private void order_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_tableMouseClicked
        int rowIndex = order_table.getSelectedRow();
        if(rowIndex < 0){

        }else{
            TableModel model = order_table.getModel();
            oid.setText(""+model.getValueAt(rowIndex, 0));      
            cid.setText(""+model.getValueAt(rowIndex, 2));
            status.setText(""+model.getValueAt(rowIndex, 3));         
            pid.setText(""+model.getValueAt(rowIndex, 4));
            
        }
    }//GEN-LAST:event_order_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel REFRESH;
    private javax.swing.JTextField cid;
    private javax.swing.JPanel clear;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel insertData1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oid;
    private javax.swing.JTable order_table;
    private javax.swing.JTextField pid;
    private javax.swing.JPanel print;
    private javax.swing.JPanel refresh;
    private javax.swing.JPanel search;
    private javax.swing.JTextField searchbar;
    private javax.swing.JTextField status;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
