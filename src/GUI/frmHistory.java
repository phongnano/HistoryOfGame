package GUI;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmHistory extends javax.swing.JInternalFrame {

    frmHome home;
    int count = 0;

    public frmHistory(frmHome home) {
        initComponents();
        this.home = home;
        if (frmHome.item.equals("Xem lịch sử chơi")) {
            readDataToFile();
        }
        if (frmHome.item.equals("Xem nội dung chi tiết")) {
            readDetailToFile();
        }
    }

    private void countDataFile() {
        File file = new File("HistoryOfGame.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
                if (count > 10) {
                    new FileWriter("HistoryOfGame.txt", false).close();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(frmHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void countDetailFile() {
        File file = new File("DetailOfHistory.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
                if (count > 10) {
                    new FileWriter("DetailOfHistory.txt", false).close();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(frmHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void readDataToFile() {
        String data = "ĐÚNG\t\tSAI\t\tBỎ QUA\t\tĐIỂM\t\tKHU VỰC\n";
        try (FileReader fr = new FileReader("HistoryOfGame.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                data += (char) i;
            }
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(frmHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtHistory.setText(data);
    }

    private void readDetailToFile() {
        String data = "CHI TIẾT\n";
        try (FileReader fr = new FileReader("DetailOfHistory.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                data += (char) i;
            }
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(frmHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtHistory.setText(data);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        txtHistory = new javax.swing.JTextArea();

        setClosable(true);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblTitle.setText("LỊCH SỬ NGƯỜI CHƠI");

        txtHistory.setEditable(false);
        txtHistory.setColumns(20);
        txtHistory.setRows(5);
        jScrollPane.setViewportView(txtHistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(lblTitle)
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtHistory;
    // End of variables declaration//GEN-END:variables
}
