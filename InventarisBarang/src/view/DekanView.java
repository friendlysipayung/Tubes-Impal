/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ISAS
 */
public class DekanView extends javax.swing.JFrame {

    /**
     * Creates new form DekanView
     */
    public DekanView() {
        initComponents();
        this.setSize(800,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        btnVerifikasiPengajuan = new javax.swing.JButton();
        btnLaporanTahunan = new javax.swing.JButton();
        btnLaporanPengajuan = new javax.swing.JButton();
        btnLaporanBarang = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnNotif = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content.setLayout(new java.awt.CardLayout());

        btnVerifikasiPengajuan.setText("Verifikasi Pengajuan");

        btnLaporanTahunan.setText("View Laporan Tahunan");

        btnLaporanPengajuan.setText("View Laporan Pengajuan");

        btnLaporanBarang.setText("View Laporan Barang");

        btnLogout.setText("Logout");

        btnNotif.setText("Notifikasi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnVerifikasiPengajuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLaporanTahunan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLaporanPengajuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLaporanBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(btnNotif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnNotif))
                .addGap(22, 22, 22)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(btnVerifikasiPengajuan)
                .addGap(18, 18, 18)
                .addComponent(btnLaporanTahunan)
                .addGap(18, 18, 18)
                .addComponent(btnLaporanPengajuan)
                .addGap(18, 18, 18)
                .addComponent(btnLaporanBarang)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnVerifikasiPengajuan() {
        return btnVerifikasiPengajuan;
    }

    /**
     * @param args the command line arguments
     */
    

    public JButton getBtnLaporanBarang() {
        return btnLaporanBarang;
    }

    public JButton getBtnLaporanPengajuan() {
        return btnLaporanPengajuan;
    }

    public JButton getBtnLaporanTahunan() {
        return btnLaporanTahunan;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public JButton getBtnNotif() {
        return btnNotif;
    }

    public JPanel getContent() {
        return content;
    }
    
    public CardLayout getCardLayout(){
        return (CardLayout) content.getLayout();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaporanBarang;
    private javax.swing.JButton btnLaporanPengajuan;
    private javax.swing.JButton btnLaporanTahunan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNotif;
    private javax.swing.JButton btnVerifikasiPengajuan;
    private javax.swing.JPanel content;
    // End of variables declaration//GEN-END:variables
}
