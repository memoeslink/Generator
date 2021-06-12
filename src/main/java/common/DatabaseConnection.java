package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DATABASE_NAME = "generator.sqlite";

    public static Connection connect() {
        Connection connection = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite::resource:" + DATABASE_NAME);
            System.out.println("common.Database " + StringHelper.defaultIfBlank(DATABASE_NAME, Database.DEFAULT_VALUE) + " was successfully connected.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
