package Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpustakaan?useTimezone=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";

    private static Connection connection;

    public static Connection getKoneksi() {
        if (connection == null){
            try{
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Koneksi Berhasil");
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
                System.out.println("Koneksi Gagal");
            }
        }
        return connection;
    }

}
