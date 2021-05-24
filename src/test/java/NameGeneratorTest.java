import common.Constant;
import common.NameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameGeneratorTest {

    @Test
    public void getDefaultName() throws Exception {
        NameGenerator nameGenerator = new NameGenerator();
        assertEquals(Constant.DEFAULT_NAME, nameGenerator.getDefaultName());
    }
}
