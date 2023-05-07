import common.DatabaseConnection;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.assertNotNull;

public class DatabaseConnectionTest {

    @Test
    public void connect() throws Exception {
        Connection connection = DatabaseConnection.connect();
        assertNotNull(connection);
    }
}
