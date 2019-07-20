package LIB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/";
    final private String encode = "?useUnicode=true&characterEncoding=utf-8";

    private String dbName = "sozluk";
    private String dbUser = "root";
    private String dbPass = "";

    private Connection conn = null;
    private Statement st = null;
    private PreparedStatement preSt = null;

    public DB() {

    }

    public DB(String dbName) {
        this.dbName = dbName;
    }

    public Statement connect() {
        try {
            if (st != null) {
                disconnect();
            }
            if (preSt != null) {
                disconnect();
            }
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName + encode, dbUser, dbPass);
            st = conn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return st;
    }

    public void disconnect() {
       try {
            if (preSt != null) {
                preSt.close();
                preSt = null;
            }
            if (st != null) {
                st.close();
                st = null;
            }
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException ex) {
        }
    }

}
