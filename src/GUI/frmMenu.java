package GUI;

import HistoryOfGame.BLL_HistoryOfGame;
import javax.swing.JOptionPane;

public class frmMenu extends javax.swing.JInternalFrame {
    
    frmHome home;
    frmPlay play;
    public static int i;
    BLL_HistoryOfGame bll = new BLL_HistoryOfGame();
    
    public frmMenu(frmHome home) {
        initComponents();
        this.home = home;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groups = new javax.swing.ButtonGroup();
        btnPlay = new javax.swing.JButton();
        radioVietNam = new javax.swing.JRadioButton();
        radioSouthAsian = new javax.swing.JRadioButton();
        lblTitle = new javax.swing.JLabel();

        setClosable(true);

        btnPlay.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/play.png"))); // NOI18N
        btnPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play(evt);
            }
        });

        groups.add(radioVietNam);
        radioVietNam.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        radioVietNam.setForeground(new java.awt.Color(0, 51, 204));
        radioVietNam.setText("Việt Nam");
        radioVietNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRadio(evt);
            }
        });

        groups.add(radioSouthAsian);
        radioSouthAsian.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        radioSouthAsian.setForeground(new java.awt.Color(153, 0, 0));
        radioSouthAsian.setText("Đông Nam Á");
        radioSouthAsian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRadio(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 40)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 102, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CHỌN KHU VỰC ĐỂ CHƠI");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioVietNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioSouthAsian))
                    .addComponent(lblTitle))
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(125, 125, 125)
                .addComponent(btnPlay)
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioVietNam)
                    .addComponent(radioSouthAsian))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Play(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play
        if (radioVietNam.isSelected() == false && radioSouthAsian.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn vùng để chơi !", "Thông báo", JOptionPane.QUESTION_MESSAGE);
        } else {
            checkRadio(evt);
            home.Play();
            groups.clearSelection();
        }
    }//GEN-LAST:event_Play

    private void checkRadio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRadio
        if (radioVietNam.isSelected()) {
            i = 0;
            bll.ShowQuestionAnswer(i);
        }
        if (radioSouthAsian.isSelected()) {
            i = 1;
            bll.ShowQuestionAnswer(i);
        }
    }//GEN-LAST:event_checkRadio


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.ButtonGroup groups;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radioSouthAsian;
    private javax.swing.JRadioButton radioVietNam;
    // End of variables declaration//GEN-END:variables
}
