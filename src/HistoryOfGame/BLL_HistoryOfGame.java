package HistoryOfGame;

import java.util.ArrayList;

public class BLL_HistoryOfGame {

    DAL_HistoryOfGame dal = new DAL_HistoryOfGame();

    public ArrayList<DTO_HistoryOfGame> ShowQuestionAnswer(int i) {
        return dal.ShowQuestionAnswer(i);
    }
}
