/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Quy;
import controller.Dao;
//import controller.ControllerImp;
import java.text.ParseException;
 import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class EditQuy extends javax.swing.JDialog {

    /**
     * Creates new form EditQuy
     */
    private TrangChu home;  
    Quy q;
    static int vitri;
    List<Quy> dsQuy = new Dao().getSpend();
    public EditQuy(java.awt.Frame parent, boolean modal, int vt) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home = (TrangChu)parent;
        vitri = vt;
        setDefaultData();
    }

    public void setDefaultData(){
        q = dsQuy.get(vitri);
        txtmachitieu.setText(q.getMaQuy());
        txtmachitieu.setEditable(false);
        cbbhoatdong.setSelectedItem(q.getTenHD());
        txtthoigian.setText(q.getThoiGian());
        txtchiphi.setText("" + q.getChiPhi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtmachitieu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbbhoatdong = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtthoigian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtchiphi = new javax.swing.JTextField();
        btsua = new javax.swing.JButton();
        bthuybo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mã chi tiêu:");

        jLabel2.setText("Tên hoạt động:");

        cbbhoatdong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truyền thông ", "Cơ sở vật chất", "Sự kiện" }));

        jLabel3.setText("Thời gian:");

        jLabel4.setText("Chi phí:");

        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        bthuybo.setText("Hủy bỏ");
        bthuybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthuyboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btsua)
                        .addGap(92, 92, 92)
                        .addComponent(bthuybo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmachitieu)
                            .addComponent(cbbhoatdong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtthoigian)
                            .addComponent(txtchiphi))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtmachitieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbhoatdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtthoigian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtchiphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        // TODO add your handling code here:
        
        String ma = txtmachitieu.getText();
        String ten = cbbhoatdong.getSelectedItem().toString();
        String ngay = txtthoigian.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date ngayChiTieu = null;
        Double chitieu = Double.parseDouble(txtchiphi.getText());
     //   Double tongquy = Double.parseDouble(txt.getText());
        int maxLength = 30;
        String pattern = "^[a-zA-Z0-9]+$";
        boolean isOk = true; 
        if (ma.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống mã chi tiêu!");
            isOk = false;
        } else if (ma.length() > maxLength) {
            JOptionPane.showMessageDialog(rootPane, "Mã chi tiêu không được vượt quá " + maxLength + " ký tự!");
            isOk = false;
        } else if (!ma.matches(pattern)) {
            JOptionPane.showMessageDialog(rootPane, "Mã chi tiêu chỉ được chứa chữ cái và số!");
            isOk = false;
        }
        else if (ten.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống Tên hoạt động chi tiêu!");
            isOk = false;
        } else if (ten.length() > maxLength) {
            JOptionPane.showMessageDialog(rootPane, "Tên hoạt động chi tiêu không được vượt quá " + maxLength + " ký tự!");
            isOk = false;
        } else if (ten.matches("^[a-zA-Z] + $")) {
            JOptionPane.showMessageDialog(rootPane, "Tên hoạt động chi tiêu chỉ được chứa chữ cái!");
            isOk = false;
        }
        else if (ngay.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập thời gian chi tiêu!");
            isOk = false;
        } else if (ngay.trim().length() != 0) {
            try {
                ngayChiTieu = dateFormat.parse(ngay);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "Thời gian chi tiêu không hợp lệ!VD:10/11/2002");
                isOk = false;
            }
        }
        else if (chitieu.toString().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập khoan chi tieu!");
            isOk = false;
        }
        if(isOk){
          //  Quy q = new Quy(ma, ten, ngay, chitieu);
          ///  home.updataQuy(q);
            JOptionPane.showMessageDialog(rootPane, "Chinh sua thanh cong");
        }
        
    }//GEN-LAST:event_btsuaActionPerformed

    private void bthuyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthuyboActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bthuyboActionPerformed

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
            java.util.logging.Logger.getLogger(EditQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditQuy dialog = new EditQuy(new javax.swing.JFrame(), true, vitri);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthuybo;
    private javax.swing.JButton btsua;
    private javax.swing.JComboBox<String> cbbhoatdong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtchiphi;
    private javax.swing.JTextField txtmachitieu;
    private javax.swing.JTextField txtthoigian;
    // End of variables declaration//GEN-END:variables
}
