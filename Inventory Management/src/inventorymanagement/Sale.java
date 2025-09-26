package inventorymanagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sale extends javax.swing.JPanel {
    
    public static String cus_id = "0";
        
    /** Creates new form Sale */
    public Sale() {
        initComponents();
        data_load();        
    }
    
     public void pro_tot_cal(){
  // product calculation         
        Double qt = Double.valueOf(p_qty.getText());
        Double price = Double.valueOf(u_price.getText());
        Double tot ;
        tot=qt*price;
        tot_price.setText(String.valueOf(tot));
 }   
     
     public void cart_total(){
        int num_of_row = jTable1.getRowCount();
        double total = 0;
        for (int i = 0; i < num_of_row; i++) 
        { 
         double value = Double.valueOf(jTable1.getValueAt(i, 5).toString());
         total += value ;
        }
        bill_tot.setText(Double.toString(total));
     }
     
      public void tot_balance(){
       Double paid = Double.valueOf(paid_amt.getText());
       Double tot = Double.valueOf(bill_tot.getText());
       Double due ;
       due =  paid -tot ;       
       balance.setText(String.valueOf(due));
 
 }
  
     
     public void data_load(){
  
  
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
     
     // load Product
  
      try {   
          Statement s= db.mycon().createStatement();
          ResultSet rs = s.executeQuery("SELECT * FROM product");
          Vector v = new Vector();
          while (rs.next()) {              
              v.add(rs.getString("p_Name"));
              DefaultComboBoxModel comm = new DefaultComboBoxModel(v);
              product_box.setModel(comm);               
          }
           
      } 
      catch (SQLException e) {
            System.out.println(e);
      }
       try {
        Statement s = db.mycon().createStatement();
          ResultSet rs = s.executeQuery("SELECT * FROM innvoiceid WHERE exid =1");
          if (rs.next()) {             
              inid.setText(rs.getString("val"));
              
          }
          
      } catch (Exception e) {
      }
     
        // pluss new invoice
        int i = Integer.valueOf(inid.getText());
        i++;
        inid.setText(String.valueOf(i));
     }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        inid = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        u_price = new javax.swing.JLabel();
        customer_box = new javax.swing.JComboBox();
        product_box = new javax.swing.JComboBox();
        p_qty = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tot_price = new javax.swing.JLabel();
        barcode_id = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        paid_amt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bill_tot = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();

        jButton7.setFont(new java.awt.Font("Cambria", 0, 18));
        jButton7.setText("Pay");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 24));
        jLabel6.setText("Innvoice Number:");

        inid.setFont(new java.awt.Font("Cambria", 0, 24));
        inid.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inid)
                .addContainerGap(1108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inid))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel1.setText("Customer");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel2.setText("Product");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel3.setText("Qty");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel4.setText("Unit :");

        u_price.setFont(new java.awt.Font("Cambria", 1, 24));
        u_price.setText("00.00");

        customer_box.setFont(new java.awt.Font("Cambria", 0, 18));
        customer_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        customer_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_boxActionPerformed(evt);
            }
        });

        product_box.setFont(new java.awt.Font("Cambria", 0, 18));
        product_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        product_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_boxActionPerformed(evt);
            }
        });

        p_qty.setFont(new java.awt.Font("Cambria", 0, 24));
        p_qty.setText("0");
        p_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_qtyActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel13.setText("Total:");

        tot_price.setFont(new java.awt.Font("Cambria", 1, 24));
        tot_price.setText("00.00");

        barcode_id.setFont(new java.awt.Font("Cambria", 1, 24));
        barcode_id.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customer_box, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product_box, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(u_price)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(tot_price)
                .addGap(36, 36, 36)
                .addComponent(barcode_id)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                .addComponent(customer_box, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(product_box, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                            .addComponent(p_qty, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(u_price, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(tot_price, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(barcode_id, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setFont(new java.awt.Font("Cambria", 0, 18));
        jButton2.setText("Remove All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Cambria", 0, 18));
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Cambria", 0, 18));
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Cambria", 0, 18));
        jButton5.setText("Pay");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Cambria", 0, 18));
        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Cambria", 0, 18));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Innvoice Id", "Name", "Barcode", "Qty", "Unit Price", "Amount"
            }
        ));
        jTable1.setAlignmentX(1.0F);
        jTable1.setAlignmentY(1.0F);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(24);
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 24));
        jLabel8.setText("Paid Amount");

        paid_amt.setFont(new java.awt.Font("Cambria", 0, 24));
        paid_amt.setText("0");
        paid_amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid_amtActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 18));
        jLabel9.setText("Total Amount:");

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 18));
        jLabel10.setText("Balance:");

        bill_tot.setFont(new java.awt.Font("Cambria", 0, 18));
        bill_tot.setText("00.00");
        bill_tot.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        balance.setFont(new java.awt.Font("Cambria", 0, 18));
        balance.setText("00.00");
        balance.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bill_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bill_tot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(balance))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paid_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(391, 391, 391)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paid_amt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(49, 49, 49))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void p_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_qtyActionPerformed
   
        pro_tot_cal();
}//GEN-LAST:event_p_qtyActionPerformed

    private void paid_amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid_amtActionPerformed

        tot_balance();
}//GEN-LAST:event_paid_amtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // remove all
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
        
         cart_total();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // remove particular elemnts
            try {       
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            int rw = jTable1.getSelectedRow();
         
            dt.removeRow(rw);
            
            
        } catch (Exception e) {
        }
        cart_total();     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pro_tot_cal();
       
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();        
        Vector v = new Vector();
        v.add(inid.getText()); // invoice id
        v.add(product_box.getSelectedItem().toString()); // product name
        v.add(barcode_id.getText()); // barcode
        v.add(p_qty.getText()); // p qyt
        v.add(u_price.getText()); // unit price
        v.add(tot_price.getText()); // get totle price
        
        dt.addRow(v);
        cart_total();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void product_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_boxActionPerformed
        String  p_name = product_box.getSelectedItem().toString();
        try {
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT p_barcode,p_mrp FROM product WHERE p_name='"+p_name+"'");
            while(rs.next()) {
                u_price.setText(rs.getString("p_mrp"));
                barcode_id.setText(rs.getString("p_barcode"));                 
            }             
        } catch (SQLException e) {
            System.out.println(e);
        }  
    }//GEN-LAST:event_product_boxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
        
        try {           
            String inv_id = inid.getText();
            String cname  = customer_box.getSelectedItem().toString();
            String tot_bil = bill_tot.getText();   
            
                    Statement ss = db.mycon().createStatement();
                    ss.executeUpdate("INSERT INTO cart(INID, c_id, customer_name, total_bill) VALUES('"+inv_id+"','"+cus_id+"','"+cname+"','"+tot_bil+"')");

            }
          
         catch(SQLException e) {
            System.out.println(e);
        }
         JOptionPane.showMessageDialog(null, "Data Saved");
         
         try {           
            
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            int rc = dt.getRowCount();
            for (int i = 0; i < rc; i++) {
                
                String ini = dt.getValueAt(i, 0).toString(); // get inid
                String P_name = dt.getValueAt(i, 1).toString(); // get product name
                String bar_code = dt.getValueAt(i, 2).toString(); // get barcode
                String qty = dt.getValueAt(i, 3).toString(); // get product qty
                String un_price = dt.getValueAt(i, 4).toString(); // get product unit price
                String totprice = dt.getValueAt(i, 5).toString(); // get product total Price
            
                Statement s = db.mycon().createStatement();
                s.executeUpdate(" INSERT INTO productupdate (INID, Product_Name, Bar_code, qty, Unit_Price, Total_Price) VALUES ('"+ini+"','"+P_name+"','"+bar_code+"','"+qty+"','"+un_price+"','"+totprice+"') ");
                
                Statement st = db.mycon().createStatement();
                st.executeUpdate("Update product set p_qty=p_qty-'"+qty+"' where p_barcode='"+bar_code+"'");
            }
         }
            catch (SQLException e) {
            System.out.println(e);
        }
        try {
            
           String id = inid.getText(); 
            Statement s = db.mycon().createStatement();
            s.executeUpdate("UPDATE  innvoiceid SET val='"+id+"' WHERE exid = 1");
            
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
         
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        
        try{                      
            String inv_id = inid.getText();
            String cname  = customer_box.getSelectedItem().toString();
            String tot_bil = bill_tot.getText();   
            String blnc = balance.getText();
            
                 Statement ss = db.mycon().createStatement();
                 ss.executeUpdate("INSERT INTO sales(INID, c_id, customer_name, total_bill,balance) VALUES('"+inv_id+"','"+cus_id+"','"+cname+"','"+tot_bil+"','"+blnc+"')");
               
            }
          
         catch(SQLException e) {
            System.out.println(e);
        }
         JOptionPane.showMessageDialog(null, "Data Saved");
           try {                   
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            int rc = dt.getRowCount();
            for (int i = 0; i < rc; i++) {
                
                String ini = dt.getValueAt(i, 0).toString(); // get inid
                String P_name = dt.getValueAt(i, 1).toString(); // get product name
                String bar_code = dt.getValueAt(i, 2).toString(); // get barcode
                String qty = dt.getValueAt(i, 3).toString(); // get product qty
                String un_price = dt.getValueAt(i, 4).toString(); // get product unit price
                String totprice = dt.getValueAt(i, 5).toString(); // get product total Price
            
                Statement s = db.mycon().createStatement();
                s.executeUpdate(" INSERT INTO productupdate (INID, Product_Name, Bar_code, qty, Unit_Price, Total_Price) VALUES ('"+ini+"','"+P_name+"','"+bar_code+"','"+qty+"','"+un_price+"','"+totprice+"') ");
                
                Statement st = db.mycon().createStatement();
                st.executeUpdate("Update product set p_qty=p_qty-'"+qty+"' where p_barcode='"+bar_code+"'");
            }
         }
            catch (SQLException e) {
            System.out.println(e);
        }
         try {
            
           String id = inid.getText(); 
            Statement s = db.mycon().createStatement();
            s.executeUpdate("UPDATE  innvoiceid SET val='"+id+"' WHERE exid = 1");
            
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
        
   
    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance;
    private javax.swing.JLabel barcode_id;
    private javax.swing.JLabel bill_tot;
    private javax.swing.JComboBox customer_box;
    private javax.swing.JLabel inid;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField p_qty;
    private javax.swing.JTextField paid_amt;
    private javax.swing.JComboBox product_box;
    private javax.swing.JLabel tot_price;
    private javax.swing.JLabel u_price;
    // End of variables declaration//GEN-END:variables
}
