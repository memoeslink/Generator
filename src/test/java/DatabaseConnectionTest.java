import common.DatabaseConnection;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseConnectionTest {

    @Test
    public void connect() throws Exception {
        Connection connection = DatabaseConnection.connect();
        assertNotNull(connection);
    }
}
