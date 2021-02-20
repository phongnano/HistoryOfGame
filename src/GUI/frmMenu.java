package GUI;

import javax.swing.JOptionPane;

public class frmMenu extends javax.swing.JInternalFrame {

    frmHome home;

    public frmMenu(frmHome home) {
        initComponents();
        this.home = home;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groups = new javax.swing.ButtonGroup();
        btnPlay = new javax.swing.JButton();
        radioSouthAsian = new javax.swing.JRadioButton();
        radioVietnam = new javax.swing.JRadioButton();

        btnPlay.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/play.png"))); // NOI18N
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play(evt);
            }
        });

        groups.add(radioSouthAsian);
        radioSouthAsian.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        radioSouthAsian.setForeground(new java.awt.Color(0, 51, 204));
        radioSouthAsian.setText("Đông Nam Á");

        groups.add(radioVietnam);
        radioVietnam.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        radioVietnam.setForeground(new java.awt.Color(153, 0, 0));
        radioVietnam.setText("Việt Nam");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(btnPlay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(radioSouthAsian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(radioVietnam)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnPlay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSouthAsian)
                    .addComponent(radioVietnam))
                .addGap(137, 137, 137))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Play(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play
        if (radioSouthAsian.isSelected() == false && radioVietnam.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn vùng để chơi !", "Thông báo", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_Play


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.ButtonGroup groups;
    private javax.swing.JRadioButton radioSouthAsian;
    private javax.swing.JRadioButton radioVietnam;
    // End of variables declaration//GEN-END:variables
}
