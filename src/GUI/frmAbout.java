package GUI;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class frmAbout extends javax.swing.JInternalFrame {

    frmHome home;

    public frmAbout(frmHome home) {
        initComponents();
        this.home = home;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnFB_1 = new javax.swing.JButton();
        lblAuth_1 = new javax.swing.JLabel();
        lblAuth_2 = new javax.swing.JLabel();
        btnFB_2 = new javax.swing.JButton();
        lblGame = new javax.swing.JLabel();

        setClosable(true);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 0, 102));
        lblTitle.setText("THÔNG TIN GAME - TÁC GIẢ");

        btnFB_1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnFB_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/facebook.png"))); // NOI18N
        btnFB_1.setToolTipText("Nguyễn Hoàng Phong"); // NOI18N
        btnFB_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFB_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkNHP(evt);
            }
        });

        lblAuth_1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        lblAuth_1.setForeground(new java.awt.Color(0, 153, 153));
        lblAuth_1.setText("Họ tên: Nguyễn Hoàng Phong");

        lblAuth_2.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        lblAuth_2.setForeground(new java.awt.Color(0, 51, 51));
        lblAuth_2.setText("Họ tên: Nguyễn Phương Duy");

        btnFB_2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnFB_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/facebook.png"))); // NOI18N
        btnFB_2.setToolTipText("Nguyễn Phương Duy"); // NOI18N
        btnFB_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFB_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkNPD(evt);
            }
        });

        lblGame.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        lblGame.setForeground(new java.awt.Color(153, 0, 0));
        lblGame.setText("GAME LỊCH SỬ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAuth_1)
                            .addComponent(lblAuth_2))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFB_1)
                            .addComponent(btnFB_2)))
                    .addComponent(lblGame)
                    .addComponent(lblTitle))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblGame)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFB_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblAuth_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAuth_2)
                    .addComponent(btnFB_2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkNHP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkNHP
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/nanopkong/"));
        } catch (IOException | URISyntaxException e1) {
        }
    }//GEN-LAST:event_linkNHP

    private void linkNPD(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkNPD
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/phuongduy.nguyen.583/"));
        } catch (IOException | URISyntaxException e1) {
        }
    }//GEN-LAST:event_linkNPD


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFB_1;
    private javax.swing.JButton btnFB_2;
    private javax.swing.JLabel lblAuth_1;
    private javax.swing.JLabel lblAuth_2;
    private javax.swing.JLabel lblGame;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
