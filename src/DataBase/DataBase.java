/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import Service.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import koneksi.*;
/**
 *
 * @author GF63
 */
public class DataBase extends javax.swing.JFrame {
    
    /**
     * Creates new form DataBase
     */
    private void comboMontir(){
        try {
            String query = "SELECT * FROM montir";
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.PreparedStatement stat = conn.prepareStatement(query);
            ResultSet rs = stat.executeQuery();
            
            while(rs.next()){
                montir.addItem(rs.getString("id_montir"));
            }
            rs.last();
            int jumlah = rs.getRow();
            rs.first();
        } catch (Exception e) {
        }
    }
    
    private void tampilData(){
        int no = 0;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO");
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("NO HP");
        model.addColumn("Tipe Mobil");
        model.addColumn("NOPOL");
        model.addColumn("Status Sewa");
        model.addColumn("Km");
        model.addColumn("Keluhan");
        model.addColumn("Nama Montir");
        
        try{
            no++;
            String sql = "SELECT a.id_data,a.nama,a.alamat,a.no_hp,a.tipe_mobil,a.nopol,a.status_sewa,"
                    + "a.km,a.keluhan,b.nama_montir FROM biodata a LEFT JOIN montir b ON a.id_montir = b.id_montir";
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.Statement stm= conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),
                res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
            tabeldata.setModel(model);
            
            
            
        } catch (SQLException e){
            System.out.println("Error : "+ e.getMessage());
        }
        TableColumnModel tcm = tabeldata.getColumnModel();
        tcm.removeColumn( tcm.getColumn(1) );
        tcm.removeColumn( tcm.getColumn(2) );
        
    }
      
    public DataBase() {
        initComponents();
        tampilData();   
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        tampilhapus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        keluhan = new javax.swing.JTextArea();
        montir = new javax.swing.JComboBox<>();
        sewa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Alamat", "No HP", "Tipe Mobil", "Nopol", "Status sewa", "KM", "Keluhan", "ID Montir"
            }
        ));
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);

        btn_edit.setText("Update");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        tampilhapus.setEditable(false);
        tampilhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilhapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Update Data");

        jLabel2.setText("Keluhan");

        jLabel3.setText("Sewa ");

        jLabel4.setText("Montir");

        keluhan.setColumns(20);
        keluhan.setRows(5);
        jScrollPane2.setViewportView(keluhan);

        montir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Montir" }));
        montir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montirActionPerformed(evt);
            }
        });

        sewa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Sewa", "Ya", "Tidak" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tampilhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(montir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(sewa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tampilhapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186)
                        .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(montir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        new Service().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabeldata.getModel();
        int row = tabeldata.getSelectedRow();
        if(row>=0){
            int ok=JOptionPane.showConfirmDialog(null, "Yakin Mau Hapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(ok==0){
                try{
                    String sql = "DELETE FROM biodata WHERE id_data='" + tampilhapus.getText()+ "'";
                    java.sql.Connection conn = (Connection)koneksi.configDB();
                    java.sql.PreparedStatement pstm= conn.prepareStatement(sql);
                    pstm.execute();
                    tampilData();
                    JOptionPane.showMessageDialog(null, "Hapus Data Berhasil..");
                } catch (HeadlessException | SQLException e){
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        String sql = "UPDATE biodata SET status_sewa = '"+sewa.getSelectedItem()+"', id_montir = '"+montir.getSelectedItem()+"', "
                + "keluhan = '"+keluhan.getText()+"' WHERE id_data = '"+tampilhapus.getText()+"'";
        try {
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            tampilData();
            JOptionPane.showMessageDialog(null, "Tersimpan");   
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        new DataBase().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_editActionPerformed

    private void tampilhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilhapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilhapusActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
        // TODO add your handling code here:
        int baris = tabeldata.rowAtPoint(evt.getPoint());
        String id_data = tabeldata.getModel().getValueAt(baris, 1).toString();
        tampilhapus.setText(id_data);
        sewa.setSelectedItem(tabeldata.getValueAt(baris, 5).toString());
        montir.setSelectedItem(tabeldata.getValueAt(baris, 8).toString());
        keluhan.setText(tabeldata.getValueAt(baris, 7).toString());
        comboMontir();
    }//GEN-LAST:event_tabeldataMouseClicked

    private void montirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montirActionPerformed
        // TODO add your handling code here:
        comboMontir();
    }//GEN-LAST:event_montirActionPerformed

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
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea keluhan;
    private javax.swing.JComboBox<String> montir;
    private javax.swing.JComboBox<String> sewa;
    private javax.swing.JTable tabeldata;
    private javax.swing.JTextField tampilhapus;
    // End of variables declaration//GEN-END:variables
}
