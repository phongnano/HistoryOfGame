package GUI;

public class frmHome extends javax.swing.JFrame {

    private frmAbout about;
    private frmMenu menu;
    private frmPlay play;

    public frmHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopHome = new javax.swing.JDesktopPane();
        mnHome = new javax.swing.JMenuBar();
        mnSystem = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        itemPassword = new javax.swing.JMenuItem();
        itemLogout = new javax.swing.JMenuItem();
        mnHistory = new javax.swing.JMenu();
        mnInfo = new javax.swing.JMenu();
        itemTutorial = new javax.swing.JMenuItem();
        itemAuth = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout desktopHomeLayout = new javax.swing.GroupLayout(desktopHome);
        desktopHome.setLayout(desktopHomeLayout);
        desktopHomeLayout.setHorizontalGroup(
            desktopHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        desktopHomeLayout.setVerticalGroup(
            desktopHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        mnSystem.setForeground(new java.awt.Color(51, 51, 51));
        mnSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/system.png"))); // NOI18N
        mnSystem.setText("Hệ thống");
        mnSystem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        itemLogin.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        itemLogin.setForeground(new java.awt.Color(153, 0, 153));
        itemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login.png"))); // NOI18N
        itemLogin.setText("Đăng nhập");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login(evt);
            }
        });
        mnSystem.add(itemLogin);

        itemPassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        itemPassword.setForeground(new java.awt.Color(255, 102, 102));
        itemPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/password.png"))); // NOI18N
        itemPassword.setText("Đổi mật khẩu");
        mnSystem.add(itemPassword);

        itemLogout.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        itemLogout.setForeground(new java.awt.Color(255, 0, 51));
        itemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout.png"))); // NOI18N
        itemLogout.setText("Đăng xuất");
        mnSystem.add(itemLogout);

        mnHome.add(mnSystem);

        mnHistory.setForeground(new java.awt.Color(204, 153, 0));
        mnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/history.png"))); // NOI18N
        mnHistory.setText("Lịch sử");
        mnHistory.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        mnHome.add(mnHistory);

        mnInfo.setForeground(new java.awt.Color(153, 204, 0));
        mnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/info.png"))); // NOI18N
        mnInfo.setText("Thông tin");
        mnInfo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        itemTutorial.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        itemTutorial.setForeground(new java.awt.Color(102, 0, 255));
        itemTutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tutorial.png"))); // NOI18N
        itemTutorial.setText("Hướng dẫn");
        mnInfo.add(itemTutorial);

        itemAuth.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        itemAuth.setForeground(new java.awt.Color(51, 0, 51));
        itemAuth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/auth.png"))); // NOI18N
        itemAuth.setText("Tác giả");
        mnInfo.add(itemAuth);

        mnHome.add(mnInfo);

        setJMenuBar(mnHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopHome)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopHome)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login
        if (play == null || play.isClosed()) {
            play = new frmPlay(this);
            desktopHome.add(play);
            play.show();
        } else {
            play.show();
        }
    }//GEN-LAST:event_Login

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new frmHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopHome;
    private javax.swing.JMenuItem itemAuth;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuItem itemPassword;
    private javax.swing.JMenuItem itemTutorial;
    private javax.swing.JMenu mnHistory;
    private javax.swing.JMenuBar mnHome;
    private javax.swing.JMenu mnInfo;
    private javax.swing.JMenu mnSystem;
    // End of variables declaration//GEN-END:variables
}
