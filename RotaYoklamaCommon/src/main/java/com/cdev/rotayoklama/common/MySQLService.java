package com.cdev.rotayoklama.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLService {
    private final Connection connection;
    public MySQLService() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost/RotaryYoklama", "root", "Rotary01_");
    }

    public boolean checkLogin(String username, String password) {
        try(Statement st = connection.createStatement()) {
            var set = st.executeQuery("Select *from Users where Username='"+username+"' AND Password='"+password+"'");
            return set.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Account getAccount(String username){
        try(Statement st = connection.createStatement()) {
            var set = st.executeQuery("Select *from Users where Username='"+username+"'");
            set.next();
            return new Account(set.getInt(1), set.getString(2), set.getString(3), set.getInt(4), set.getString(5), set.getInt(6), set.getInt(7));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Checkup getCheck(Account a){
        try(Statement st = connection.createStatement()) {
            var set = st.executeQuery("Select *from Checkup where StudentId="+a.id+"");
            set.next();
            return new Checkup(set.getInt(1), set.getString(2), set.getInt(3), set.getInt(4), set.getInt(5));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addCheck(Checkup checkup){
        try(Statement st = connection.createStatement()) {

            st.execute("INSERT INTO Checkup (Date, StudentId, TeacherId, Check) values ()");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
