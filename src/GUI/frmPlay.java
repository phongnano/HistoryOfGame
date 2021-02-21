package GUI;

import HistoryOfGame.BLL_HistoryOfGame;
import HistoryOfGame.DAL_HistoryOfGame;
import HistoryOfGame.DTO_HistoryOfGame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class frmPlay extends javax.swing.JInternalFrame {

    frmHome home;
    DTO_HistoryOfGame dto = new DTO_HistoryOfGame();
    DAL_HistoryOfGame dal = new DAL_HistoryOfGame();
    BLL_HistoryOfGame bll = new BLL_HistoryOfGame();
    ArrayList<DTO_HistoryOfGame> arr = new ArrayList<>();
    int key_a, key_b, key_c, key_d, key_correct;
    String ques;
    JRadioButton radio;

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
            radio_A.setText(ans_a);
            radio_B.setText(ans_b);
            radio_C.setText(ans_c);
            radio_D.setText(ans_d);
        }
        groups.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groups = new javax.swing.ButtonGroup();
        panQuestion = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        panAnswer = new javax.swing.JPanel();
        radio_A = new javax.swing.JRadioButton();
        radio_B = new javax.swing.JRadioButton();
        radio_C = new javax.swing.JRadioButton();
        radio_D = new javax.swing.JRadioButton();

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
                .addContainerGap(278, Short.MAX_VALUE))
        );

        panAnswer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        groups.add(radio_A);
        radio_A.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        radio_A.setText("Đáp án A");
        radio_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCorrectAnswer(evt);
            }
        });

        groups.add(radio_B);
        radio_B.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        radio_B.setText("Đáp án B");
        radio_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCorrectAnswer(evt);
            }
        });

        groups.add(radio_C);
        radio_C.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        radio_C.setText("Đáp án C");
        radio_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCorrectAnswer(evt);
            }
        });

        groups.add(radio_D);
        radio_D.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        radio_D.setText("Đáp án D");
        radio_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCorrectAnswer(evt);
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
                        .addComponent(radio_A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radio_B))
                    .addGroup(panAnswerLayout.createSequentialGroup()
                        .addComponent(radio_C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 781, Short.MAX_VALUE)
                        .addComponent(radio_D)))
                .addContainerGap())
        );
        panAnswerLayout.setVerticalGroup(
            panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_A)
                    .addComponent(radio_B))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(panAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_C)
                    .addComponent(radio_D))
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
                .addComponent(panQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkCorrectAnswer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCorrectAnswer
        key_correct = dal.getCorrectAnswer(frmMenu.i, dto);
        if (radio_A.isSelected()) {
            key_a = 1;
            if (key_a == key_correct) {
                JOptionPane.showMessageDialog(null, "OK");
                StartUp();
            } else {
                JOptionPane.showMessageDialog(null, "NOT OK");
            }
        }
        if (radio_B.isSelected()) {
            key_b = 2;
            if (key_b == key_correct) {
                JOptionPane.showMessageDialog(null, "OK");
                StartUp();
            } else {
                JOptionPane.showMessageDialog(null, "NOT OK");
            }
        }
        if (radio_C.isSelected()) {
            key_c = 3;
            if (key_c == key_correct) {
                JOptionPane.showMessageDialog(null, "OK");
                StartUp();
            } else {
                JOptionPane.showMessageDialog(null, "NOT OK");
            }
        }
        if (radio_D.isSelected()) {
            key_d = 4;
            if (key_d == key_correct) {
                JOptionPane.showMessageDialog(null, "OK");
                StartUp();
            } else {
                JOptionPane.showMessageDialog(null, "NOT OK");
            }
        }
    }//GEN-LAST:event_checkCorrectAnswer


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groups;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JPanel panAnswer;
    private javax.swing.JPanel panQuestion;
    private javax.swing.JRadioButton radio_A;
    private javax.swing.JRadioButton radio_B;
    private javax.swing.JRadioButton radio_C;
    private javax.swing.JRadioButton radio_D;
    // End of variables declaration//GEN-END:variables
}
