/*
 * pendingbills.java
 *
 * Created on 5 November, 2020, 5:07 PM
 */

package inventorymanagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Neeraj
 */
public class innvoices extends javax.swing.JPanel {
     public static String cus_id = "0";
    /** Creates new form pendingbills */
    public innvoices() {
        initComponents();
        tb_load();
        data_load();
        
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
          
         
          
          Statement s = db.mycon().createStatement();
          ResultSet rs = s.executeQuery(" SELECT * FROM cart");
          DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
          dt.setRowCount(0);
          while(rs.next()) {              
              
              Vector v = new Vector();
              v.add(rs.getString(1));
              v.add(rs.getString(2));
              v.add(rs.getString(3));
              v.add(rs.getString(4));
              v.add(rs.getString(5));
              v.add(rs.getString(6));
              dt.addRow(v);
          }
          
      } catch (SQLException e) {
          System.out.println(e);
      }
  
  }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        customer_box = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24));
        jLabel1.setText("Date:");

        customer_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        customer_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_boxActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cambria", 0, 24));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        date_chooser.setDateFormatString("yyyy-MM-dd");
        date_chooser.setFont(new java.awt.Font("Cambria", 0, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(customer_box, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(customer_box, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTable1.setFont(new java.awt.Font("Cambria", 0, 18));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CartId", "INID", "c_id", "Customer Name", "Total Bill", "Date"
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String strDate = ((JTextField)date_chooser.getDateEditor().getUiComponent()).getText();
        try{
            //Date date = jDateChooser2.getDate();
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM cart WHERE order_date= '"+strDate+"' ");
            DefaultTableModel dt1 = (DefaultTableModel) jTable1.getModel();
            dt1.setRowCount(0);
            while(rs.next()){
              Vector v = new Vector();
              v.add(rs.getString(1));
              v.add(rs.getString(2));
              v.add(rs.getString(3));
              v.add(rs.getString(4));
              v.add(rs.getString(5));
              v.add(rs.getString(6));
              dt1.addRow(v);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customer_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_boxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_customer_boxActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tb_load();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox customer_box;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
