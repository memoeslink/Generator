import common.DatabaseConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class DatabaseConnectionTest {

    @Test
    public void connect() throws Exception {
        Connection connection = DatabaseConnection.connect();
        Assertions.assertNotNull(connection);
    }
}
