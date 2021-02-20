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

    public ArrayList<DTO_HistoryOfGame> ShowQuestionAnswer() {
        ArrayList<DTO_HistoryOfGame> result = new ArrayList<>();
        String query = "select ques.QUESTION, ques.KEY_A, ques.KEY_B, ques.KEY_C, ques.KEY_D from CATALOGS cata, QUESTIONS ques where cata.IDCATA = ques.IDCATA and cata.IDCATA = 0";
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
}
