package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProccessModel {
    Statement statement;

    public String[][] readPeminjam() {
        try{
            int jmlData = 0;

            String data[][] = new String[getBanyakDataPeminjaman()][9];

            String query = "SELECT * FROM `borrow` JOIN `user` ON `borrow`.`user_id` = `user`.`user_id`";
            ResultSet resultSet = statement.executeQuery(query);
            int i = 1;
            while (resultSet.next()){
                data[jmlData][0] = String.valueOf(i);
                data[jmlData][1] = resultSet.getString("date");
                data[jmlData][2] = resultSet.getString("nim");
                data[jmlData][3] = resultSet.getString("name");
                data[jmlData][4] = resultSet.getString("book_id");
                data[jmlData][5] = resultSet.getString("book_name");
                data[jmlData][6] = resultSet.getString("username");
                data[jmlData][7] = resultSet.getString("borrow_id");
                jmlData++;
                i++;
            }
            return data;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public int getBanyakDataPeminjaman() {
        int jmlData = 0;
        try{
            statement = Database.getKoneksi().createStatement();
            String query = "SELECT * FROM `borrow`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    public void insertPeminjam (String name, String nim, String bookID, String bookName, String userID) {
        try{
            String date = currentDate();
            String query = "INSERT INTO `borrow` (`date`,`name`,`nim`,`book_id`,`book_name`,`user_id`) VALUES ('"+date+"','"+name+"','"+nim+"','"+bookID+"','"+bookName+"','"+userID+"')";
            statement = Database.getKoneksi().createStatement();
            statement.executeUpdate(query);
            System.out.println();
            JOptionPane.showMessageDialog(null, "Data Successfully Added");
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }

    public void deletePeminjam (String borrow_id) {
        try{
            String query = "DELETE FROM `borrow` WHERE `borrow_id` = '"+borrow_id+"'";
            statement = Database.getKoneksi().createStatement();
            statement.executeUpdate(query);
            System.out.println();
            JOptionPane.showMessageDialog(null, "Data Successfully Deleted");
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }

    public void updatePeminjam(String nama, String bookID, String borrowID) {
        try{
            String query = "UPDATE `borrow` set `name`='"+nama+"',`book_id`='"+bookID+"' WHERE `borrow_id`='"+borrowID+"'";
            statement = (Statement) Database.getKoneksi().createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Successfully Updated");
            JOptionPane.showMessageDialog(null, "Data Successfully Updated");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

    public String currentDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
