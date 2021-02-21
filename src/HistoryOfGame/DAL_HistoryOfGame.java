package HistoryOfGame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAL_HistoryOfGame {

    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ArrayList<DTO_HistoryOfGame> ShowQuestionAnswer(int i) {
        ArrayList<DTO_HistoryOfGame> result = new ArrayList<>();
        String query = "select ques.QUESTION, ques.KEY_A, ques.KEY_B, ques.KEY_C, ques.KEY_D, ques.KEY_CORRECT from CATALOGS cata, QUESTIONS ques where cata.IDCATA = ques.IDCATA and cata.IDCATA = " + i + " order by random() offset 0 rows fetch first 1 rows only";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_HistoryOfGame dto = new DTO_HistoryOfGame();
                dto.setQuestion(rs.getString("QUESTION"));
                dto.setAnswer_a(rs.getString("KEY_A"));
                dto.setAnswer_b(rs.getString("KEY_B"));
                dto.setAnswer_c(rs.getString("KEY_C"));
                dto.setAnswer_d(rs.getString("KEY_D"));
                dto.setAnswer_correct(rs.getString("KEY_CORRECT"));
                result.add(dto);
            }
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }

    public String getCorrectAnswer(int i, DTO_HistoryOfGame dto) {
        String query = "select ques.KEY_CORRECT from CATALOGS cata, QUESTIONS ques where cata.IDCATA = ques.IDCATA and cata.IDCATA = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, i);
            ps.setString(2, dto.getAnswer_correct());
            rs = ps.executeQuery();
            while (rs.next()) {
                dto.getAnswer_correct();
            }
        } catch (SQLException e) {
        }
        return dto.getAnswer_correct();
    }
}
