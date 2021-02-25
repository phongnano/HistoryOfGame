package HistoryOfGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo {

    private static File file;
    private static FileOutputStream fos;

    public static void main(String[] args) {
        String title = "Người chời" + "\t" + "Số câu đúng" + "\t" + "Số câu sai" + "\t" + "Lần" + ""
                + "n";
        try {
            file = new File("Score.txt");
            fos = new FileOutputStream(file);

        } catch (FileNotFoundException e) {
        }
    }
}
