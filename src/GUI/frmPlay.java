package GUI;

import HistoryOfGame.BLL_HistoryOfGame;
import HistoryOfGame.DAL_HistoryOfGame;
import HistoryOfGame.DTO_HistoryOfGame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class frmPlay extends javax.swing.JInternalFrame {

    frmHome home;
    DTO_HistoryOfGame dto = new DTO_HistoryOfGame();
    DAL_HistoryOfGame dal = new DAL_HistoryOfGame();
    BLL_HistoryOfGame bll = new BLL_HistoryOfGame();
    ArrayList<DTO_HistoryOfGame> arr = new ArrayList<>();
    List<String> radio;
    String key_correct;
    static int countCorrect, countWrong;

    public frmPlay(frmHome home) {
        initComponents();
        this.home = home;
        StartUp();
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

        setClosable(true);

        panQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblQuestion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
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

        btnFinish.setForeground(new java.awt.Color(102, 153, 0));
        btnFinish.setText("Kết thúc");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finish(evt);
            }
        });

        btnA.setText("Đáp án A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswers(evt);
            }
        });

        btnB.setText("Đáp án B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswers(evt);
            }
        });

        btnC.setText("Đáp án C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswers(evt);
            }
        });

        btnD.setText("Đáp án D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnswers(evt);
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
                .addGap(376, 376, 376)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panAnswerLayout.setVerticalGroup(
            panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        JOptionPane.showMessageDialog(null, "Đáp án đúng: " + countCorrect + "\nĐáp án sai: " + countWrong, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        countCorrect = countWrong = 0;
        this.dispose();
    }//GEN-LAST:event_Finish

    private void checkAnswers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnswers
        key_correct = dal.getCorrectAnswer(frmMenu.i, dto);
        if (evt.getSource().equals(btnA)) {
            if (key_correct.equals(btnA.getText())) {
                countCorrect++;
                StartUp();
            } else {
                countWrong++;
                StartUp();
            }
        }
        if (evt.getSource().equals(btnB)) {
            if (key_correct.equals(btnB.getText())) {
                countCorrect++;
                StartUp();
            } else {
                countWrong++;
                StartUp();
            }
        }
        if (evt.getSource().equals(btnC)) {
            if (key_correct.equals(btnC.getText())) {
                countCorrect++;
                StartUp();
            } else {
                countWrong++;
                StartUp();
            }
        }
        if (evt.getSource().equals(btnD)) {
            if (key_correct.equals(btnD.getText())) {
                countCorrect++;
                StartUp();
            } else {
                countWrong++;
                StartUp();
            }
        }
    }//GEN-LAST:event_checkAnswers


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnFinish;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JPanel panAnswer;
    private javax.swing.JPanel panQuestion;
    // End of variables declaration//GEN-END:variables
}
