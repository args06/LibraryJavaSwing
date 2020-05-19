package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserModel {
    Statement statement;

    public String[] login(String sUsername, String sPassword){
        try{
            String data[] = new String[4];

            String query = "SELECT * FROM user WHERE (`email` = '"+ sUsername +"' OR `username` = '"+ sUsername +"') AND `password` = '"+ sPassword +"'";
            statement = Database.getKoneksi().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[0] = resultSet.getString("user_id");
                data[1] = resultSet.getString("username");
                data[2] = resultSet.getString("email");
                data[3] = resultSet.getString("password");
            }
            return data;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public void  insertUser(String email, String username, String password) {
        try{
            String query = "INSERT INTO `user` (`username`, `email`, `password`) VALUES ('"+username+"','"+email+"','"+password+"')";
            statement = Database.getKoneksi().createStatement();
            statement.executeUpdate(query);
            System.out.println("User Successfully Added");
            JOptionPane.showMessageDialog(null, "User Successfully Added");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}
