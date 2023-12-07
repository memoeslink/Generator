package common;

import org.memoeslink.StringHelper;
import org.sqlite.SQLiteConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DATABASE_NAME = "generator.sqlite";

    public static Connection connect() {
        Connection connection = null;
        SQLiteConfig config = new SQLiteConfig();
        config.setReadOnly(true);

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite::resource:" + DATABASE_NAME, config.toProperties());
            System.out.println("Database " + StringHelper.defaultOnBlank(DATABASE_NAME) + " was successfully connected.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
