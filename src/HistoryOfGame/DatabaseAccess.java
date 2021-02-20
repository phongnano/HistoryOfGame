package HistoryOfGame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class DatabaseAccess {

    private String url = null;
    private String usr = null;
    private String pwd = null;
    private String dvr = null;

    private Connection con;

    public Connection getConnection() {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("database.properties"));
            url = pro.getProperty("db_url");
            usr = pro.getProperty("db_usr");
            pwd = pro.getProperty("db_pwd");
            dvr = pro.getProperty("db_dvr");
            Class.forName(dvr);
            con = DriverManager.getConnection(url, usr, pwd);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy tệp tin database.properties: " + e, "Thông báo", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Có lỗi khi thao tác với tệp tin: " + e, "Thông báo", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Không tim thấy class: " + e, "Thông báo", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối cơ sở dữ liệu: " + e, "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        if (con == null) {
            throw new NullPointerException("Kết nối không thành công");
        }
        return con;
    }
}
