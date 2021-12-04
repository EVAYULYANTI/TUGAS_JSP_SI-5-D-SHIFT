/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author evayulyanti
 */
public class formdata extends javax.swing.JFrame {
    DefaultTableModel model;

    /**
     * Creates new form formdata
     * @throws java.sql.SQLException
     */
    public formdata() throws SQLException {
        initComponents();
        String []judul = {"id","nama","masuk","keluar"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
        tampilKan();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFid = new javax.swing.JTextField();
        TFnama = new javax.swing.JTextField();
        TFmasuk = new javax.swing.JTextField();
        TFkeluar = new javax.swing.JTextField();
        BTNSIMPAN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BTNHAPUS = new javax.swing.JButton();
        BTNEDIT = new javax.swing.JButton();
        BTNRESET = new javax.swing.JButton();
        BTNCARI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATA KAS");

        jLabel2.setText("id");

        jLabel3.setText("nama");

        jLabel4.setText("masuk");

        jLabel5.setText("keluar");

        BTNSIMPAN.setText("SIMPAN");
        BTNSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSIMPANActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BTNHAPUS.setText("HAPUS");
        BTNHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNHAPUSActionPerformed(evt);
            }
        });

        BTNEDIT.setText("EDIT");
        BTNEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEDITActionPerformed(evt);
            }
        });

        BTNRESET.setText("RESET");
        BTNRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRESETActionPerformed(evt);
            }
        });

        BTNCARI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCARIActionPerformed(evt);
            }
        });

        jButton1.setText("CARI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(BTNSIMPAN)
                        .addGap(53, 53, 53)
                        .addComponent(BTNEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(BTNHAPUS)
                        .addGap(38, 38, 38)
                        .addComponent(BTNRESET))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFid)
                            .addComponent(TFnama, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFmasuk)
                                    .addComponent(TFkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                            .addComponent(BTNCARI, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton1)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(TFnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCARI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNSIMPAN)
                    .addComponent(BTNEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNHAPUS)
                    .addComponent(BTNRESET))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSIMPANActionPerformed
      try{
           Connection koneksi =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
           koneksi.createStatement().executeUpdate("insert into kas values "+"('"+TFid.getText()+"','"+TFnama.getText()+"','"+TFmasuk.getText()+"','"+TFkeluar.getText()+"')");
           tampilkan();      
      } catch (SQLException ex) {
            Logger.getLogger(formdata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNSIMPANActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
       
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i=jTable1.getSelectedRow();
        if(i>-1){
        TFid.setText(model.getValueAt(i, 0).toString());
        TFnama.setText(model.getValueAt(i, 1).toString());
        TFmasuk.setText(model.getValueAt(i, 2).toString());
        TFkeluar.setText(model.getValueAt(i, 3).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void BTNHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNHAPUSActionPerformed
        try{
           Connection koneksi =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
           koneksi.createStatement().executeUpdate("delete from kas where id='"+TFid.getText()+"'");
           tampilkan();      
      } catch (SQLException ex) {
            Logger.getLogger(formdata.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_BTNHAPUSActionPerformed

    private void BTNEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEDITActionPerformed
      try{
           Connection koneksi =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
           koneksi.createStatement().executeUpdate("update kas set id='"+TFid.getText()+"',nama='"+TFnama.getText()+"',masuk='"+TFmasuk.getText()+"',keluar='"+TFkeluar.getText()+"' WHERE id='"+TFid.getText()+"'");
           tampilkan();      
      } catch (SQLException ex) {
            Logger.getLogger(formdata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNEDITActionPerformed

    private void BTNRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRESETActionPerformed
        // TODO add your handling code here:
        reset();
        tampilkan();
    }//GEN-LAST:event_BTNRESETActionPerformed

    private void BTNCARIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCARIActionPerformed
    
        try {
            int row = jTable1.getRowCount();
            for(int a=0;a<row;a++){
                model.removeRow(0);
            }
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
            ResultSet hasil = koneksi.createStatement().executeQuery("Select * from kas where id='"+TFid.getText()+"' ");
            while (hasil.next()){
                String data[]= {hasil.getString(1),hasil.getString(2),hasil.getString(3),hasil.getString(4)};
                model.addRow(data);
            };
        } catch (SQLException ex) {
            Logger.getLogger(formdata.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_BTNCARIActionPerformed

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
            java.util.logging.Logger.getLogger(formdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new formdata().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(formdata.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BTNCARI;
    private javax.swing.JButton BTNEDIT;
    private javax.swing.JButton BTNHAPUS;
    private javax.swing.JButton BTNRESET;
    private javax.swing.JButton BTNSIMPAN;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFkeluar;
    private javax.swing.JTextField TFmasuk;
    private javax.swing.JTextField TFnama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("empty-statement")
    private void tampilKan(){
        try {
            int row = jTable1.getRowCount();
            for(int a=0;a<row;a++){
                model.removeRow(0);
            }
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
            ResultSet hasil = koneksi.createStatement().executeQuery("Select * from kas");
            while (hasil.next()){
                String data[]= {hasil.getString(1),hasil.getString(2),hasil.getString(3),hasil.getString(4)};
                model.addRow(data);
            };
        } catch (SQLException ex) {
            Logger.getLogger(formdata.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    
    }

    private void tampilkan() {
        
    }

    private void reset() {
       TFid.setText("");
       TFnama.setText("");
       TFmasuk.setText("");
       TFkeluar.setText("");
       
    }  
}
