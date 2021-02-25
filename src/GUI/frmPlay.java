package GUI;

import HistoryOfGame.BLL_HistoryOfGame;
import HistoryOfGame.DAL_HistoryOfGame;
import HistoryOfGame.DTO_HistoryOfGame;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class frmPlay extends javax.swing.JInternalFrame {

    frmHome home;
    DTO_HistoryOfGame dto = new DTO_HistoryOfGame();
    DAL_HistoryOfGame dal = new DAL_HistoryOfGame();
    BLL_HistoryOfGame bll = new BLL_HistoryOfGame();
    ArrayList<DTO_HistoryOfGame> arr = new ArrayList<>();
    List<String> radio;
    static String key_correct;
    static int countCorrect, countWrong, countSkip, countTimes, score = 1;
    Object obj;
    JButton btn;

    public frmPlay(frmHome home) {
        initComponents();
        this.home = home;
        StartUp();
    }

    private void writeDataToFile() {
        String data = Integer.toString(countCorrect) + "\t\t" + Integer.toString(countWrong) + "\t\t" + Integer.toString(countSkip) + "\t\t" + Integer.toString(score) + "\t\t" + frmMenu.cata + "\n";
        try (FileWriter fw = new FileWriter("HistoryOfGame.txt", true)) {
            fw.write(data);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(frmPlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void writeDetailToFile() {
        String data = "Lần: " + Integer.toString(countTimes++) + "\nCâu hỏi: " + lblQuestion.getText() + "\nCâu trả lời đúng: " + key_correct + "\nCâu bạn chọn: " + btn.getText() + "\n\n";
        try (FileWriter fw = new FileWriter("DetailOfHistory.txt", true)) {
            fw.write(data);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(frmPlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void StartUp() {
        arr = bll.ShowQuestionAnswer(frmMenu.i);
        for (int i = 0; i < arr.size(); i++) {
            dto = arr.get(i);
            String qst = dto.getQuestion();
            String ans_a = dto.getAnswer_a();
            String ans_b = dto.getAnswer_b();
            String ans_c = dto.getAnswer_c();
            String ans_d = dto.getAnswer_d();
            lblQuestion.setText(qst);
            radio = Arrays.asList(ans_a, ans_b, ans_c, ans_d);
            Collections.shuffle(radio);
            btnA.setText(radio.get(0));
            btnB.setText(radio.get(1));
            btnC.setText(radio.get(2));
            btnD.setText(radio.get(3));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panQuestion = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        panAnswer = new javax.swing.JPanel();
        btnFinish = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnSkip = new javax.swing.JButton();

        setClosable(true);

        panQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblQuestion.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblQuestion.setText("Câu hỏi");

        javax.swing.GroupLayout panQuestionLayout = new javax.swing.GroupLayout(panQuestion);
        panQuestion.setLayout(panQuestionLayout);
        panQuestionLayout.setHorizontalGroup(
            panQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panQuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panQuestionLayout.setVerticalGroup(
            panQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panQuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuestion)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        panAnswer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnFinish.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnFinish.setForeground(new java.awt.Color(102, 153, 0));
        btnFinish.setText("Kết thúc");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finish(evt);
            }
        });

        btnA.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnA.setText("Đáp án A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswers(evt);
            }
        });

        btnB.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnB.setText("Đáp án B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswers(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnC.setText("Đáp án C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswers(evt);
            }
        });

        btnD.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnD.setText("Đáp án D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswers(evt);
            }
        });

        btnSkip.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnSkip.setForeground(new java.awt.Color(0, 153, 153));
        btnSkip.setText("Bỏ qua");
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Skip(evt);
            }
        });

        javax.swing.GroupLayout panAnswerLayout = new javax.swing.GroupLayout(panAnswer);
        panAnswer.setLayout(panAnswerLayout);
        panAnswerLayout.setHorizontalGroup(
            panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAnswerLayout.createSequentialGroup()
                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panAnswerLayout.createSequentialGroup()
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panAnswerLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        panAnswerLayout.setVerticalGroup(
            panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Finish(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finish
        writeDataToFile();
        countCorrect = countWrong = countSkip = 0;
        this.dispose();
    }//GEN-LAST:event_Finish

    private void checkAnswers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnswers
        key_correct = dal.getCorrectAnswer(frmMenu.i, dto);
        obj = evt.getSource();
        if (obj instanceof JButton) {
            btn = (JButton) obj;
            if (key_correct.equals(btn.getText())) {
                JOptionPane.showMessageDialog(null, "Bạn trả lời đúng !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                ++score;
                ++countCorrect;
            } else {
                JOptionPane.showMessageDialog(null, "Bạn trả lời sai !", "Thông báo", JOptionPane.ERROR_MESSAGE);
                ++countWrong;
            }
            writeDetailToFile();
            StartUp();
        }
    }//GEN-LAST:event_checkAnswers

    private void Skip(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Skip
        ++countSkip;
        StartUp();
    }//GEN-LAST:event_Skip


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnSkip;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JPanel panAnswer;
    private javax.swing.JPanel panQuestion;
    // End of variables declaration//GEN-END:variables
}
