package db;

import java.sql.*;

public class DBHelper {
    private static final String USERNAME= "root";
    private static final String PASSWORD = "";
    private static final String DB = "program_kasir";
    private static final String MYCONN = "jdbc:mysql://localhost/" + DB;

    public static Connection getConnection(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
//            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi Gagal");
        }

        return conn;
    }
}