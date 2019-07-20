package LIB;

import PROPERTIES.WordProperty;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Queries {

    DB db = new DB();
    Validator vld = new Validator();

    public boolean AddWord(WordProperty wp) {

        try {
            String query = "insert into sozcuk values(" + wp.getWordID() + ",'" + wp.getWord() + "','" + wp.getFile() + "')";
            int yazsonuc = db.connect().executeUpdate(query);
            if (yazsonuc > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("sorgu hatası: " + ex);
        } finally {
            db.disconnect();
        }
        return false;
    }

    public ArrayList<WordProperty> GetWords() {
        ArrayList<WordProperty> words = new ArrayList<>();
        try {
            String query = "select * from sozcuk";
            ResultSet rs = db.connect().executeQuery(query);
            while (rs.next()) {
                WordProperty wp = new WordProperty();
                wp.setWordID(rs.getString("sozcuk_id"));
                wp.setWord(rs.getString("sozcuk_sozcuk"));
                wp.setFile(rs.getString("sozcuk_yol"));
                words.add(wp);
            }
        } catch (SQLException e) {
            System.err.println("sorgu hatası:" + e);
        } finally {
            db.disconnect();
        }
        return words;
    }

        public ArrayList<WordProperty> GetWords(String search) {
        ArrayList<WordProperty> words = new ArrayList<>();
        try {
            String query = "select * from sozcuk where match(sozcuk_sozcuk) against ('" + search + "' in boolean mode)";
            ResultSet rs = db.connect().executeQuery(query);
            while (rs.next()) {
                WordProperty wp = new WordProperty();
                wp.setWordID(rs.getString("sozcuk_id"));
                wp.setWord(rs.getString("sozcuk_sozcuk"));
                wp.setFile(rs.getString("sozcuk_yol"));
                words.add(wp);
            }
        } catch (SQLException e) {
            System.err.println("sorgu hatası:" + e);
        } finally {
            db.disconnect();
        }
        return words;
    }
    
    public int DelWord(int id) {
        int i = 0;
        try {
            i = db.connect().executeUpdate("delete from sozcuk where sozcuk_id=" + id + "");

        } catch (SQLException ex) {
            System.err.println("Hata: " + ex);
        } finally {
            db.disconnect();
        }
        return i;
    }
}
