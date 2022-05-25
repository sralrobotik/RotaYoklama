package com.cdev.rotayoklama.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLService {
    private final Connection connection;
    public MySQLService() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql:/localhost", "root", "Rotary01_");
    }
}
