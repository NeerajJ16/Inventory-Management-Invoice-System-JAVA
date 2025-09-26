/*
 * pendingbills.java
 *
 * Created on 5 November, 2020, 5:07 PM
 */

package inventorymanagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Neeraj
 */
public class pendingbills extends javax.swing.JPanel {
     public static String cus_id = "0";
    /** Creates new form pendingbills */
    public pendingbills() {
        initComponents();
        data_load();
        tb_load();
    }
    public void data_load(){
  
  // load customer
  
      try {
          Statement s= db.mycon().createStatement();
          ResultSet rs = s.executeQuery("SELECT * FROM customer");
          Vector v = new Vector();
          while (rs.next()) {              
              v.add(rs.getString("c_name"));
              DefaultComboBoxModel com = new DefaultComboBoxModel(v);
              customer_box.setModel(com);
          }     
      } 
      catch (SQLException e) {
            System.out.println(e);
      }
    }
     public void tb_load(){
      try {
          
          DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
          dt.setRowCount(0);
          
          Statement s = db.mycon().createStatement();
          ResultSet rs = s.executeQuery(" SELECT * FROM sales");
          while (rs.next()) {              
              
              Vector v = new Vector();
              v.add(rs.getString(1));
              v.add(rs.getString(2));
              v.add(rs.getString(3));
              v.add(rs.getString(4));
              v.add(rs.getString(5));
              v.add(rs.getString(6));
              v.add(rs.getString(7));
              dt.addRow(v);
          }
          
      } catch (SQLException e) {
          System.out.println(e);
      }
  
  }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customer_box = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36));
        jLabel1.setText("Customer Name:");

        customer_box.setFont(new java.awt.Font("Cambria", 0, 24));
        customer_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        customer_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_boxActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Cambria", 0, 24));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cambria", 0, 24));
        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Cambria", 0, 24));
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customer_box, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(customer_box, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Cambria", 0, 18));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SaleId", "INID", "c_id", "Customer Name", "Total Bill", "Balance", "Date"
            }
        ));
        jTable1.setRowHeight(24);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            String cname = customer_box.getSelectedItem().toString();
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM sales  WHERE customer_name ='" + cname + "'  ");
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString(1));
              v.add(rs.getString(2));
              v.add(rs.getString(3));
              v.add(rs.getString(4));
              v.add(rs.getString(5));
              v.add(rs.getString(6));
              v.add(rs.getString(7));
              dt.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pendingbills.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            Statement st = db.mycon().createStatement();
            st.executeUpdate("Delete from sales where c_id='"+cus_id+"'");
            JOptionPane.showMessageDialog(null, "Billed Payed");
        }
                
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void customer_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_boxActionPerformed
        // TODO add your handling code here:
        String  name =customer_box.getSelectedItem().toString();
        try {
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT c_id,c_name FROM customer  WHERE c_name ='"+name+"'  ");
            if (rs.next()) {
                 cus_id = (rs.getString("c_id"));    
            }  
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    
}//GEN-LAST:event_customer_boxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tb_load();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            String cname = customer_box.getSelectedItem().toString();
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM sales  WHERE customer_name ='" + cname + "'  ");
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString(1));
              v.add(rs.getString(2));
              v.add(rs.getString(3));
              v.add(rs.getString(4));
              v.add(rs.getString(5));
              v.add(rs.getString(6));
              v.add(rs.getString(7));
              dt.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pendingbills.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1KeyPressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox customer_box;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
