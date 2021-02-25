package GUI;

import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JInternalFrame {

    frmHome home;

    public frmLogin(frmHome home) {
        initComponents();
        this.home = home;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLogin = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        ckShow = new javax.swing.JCheckBox();
        lblForget = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setClosable(true);

        panLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ĐĂNG NHẬP HỆ THỐNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 16), new java.awt.Color(153, 102, 0))); // NOI18N

        lblUser.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblUser.setForeground(new java.awt.Color(102, 0, 102));
        lblUser.setText("Tài khoản:");

        txtUser.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        lblPass.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblPass.setForeground(new java.awt.Color(102, 0, 51));
        lblPass.setText("Mật khẩu:");

        txtPass.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        ckShow.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        ckShow.setForeground(new java.awt.Color(0, 102, 102));
        ckShow.setText("Hiển thị mật khẩu");
        ckShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword(evt);
            }
        });

        lblForget.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblForget.setForeground(new java.awt.Color(0, 51, 102));
        lblForget.setText("Quên mật khẩu?");

        btnLogin.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login(evt);
            }
        });

        javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
        panLogin.setLayout(panLoginLayout);
        panLoginLayout.setHorizontalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addComponent(lblPass))
                .addGap(30, 30, 30)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser)
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addComponent(ckShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(lblForget))
                    .addComponent(txtPass))
                .addContainerGap())
        );
        panLoginLayout.setVerticalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser))
                .addGap(18, 18, 18)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass))
                .addGap(18, 18, 18)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckShow)
                    .addComponent(lblForget))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword
        if (ckShow.isSelected()) {
            txtPass.setEchoChar((char) 0);
        } else {
            txtPass.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_showPassword

    private void Login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login
        if (txtUser.getText().equals("user") && txtPass.getText().equals("user")) {
            home.Menu();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, " Tài khoản hoặc mật khẩu không đúng", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Login


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox ckShow;
    private javax.swing.JLabel lblForget;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
