import common.Constant;
import common.NameGenerator;
import common.NameType;
import common.StringHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NameGeneratorTest {

    @Test
    public void getNameOrDefault() throws Exception {
        NameGenerator nameGenerator = new NameGenerator();
        assertNotEquals(StringHelper.EMPTY, nameGenerator.getNameOrDefault(NameType.EMPTY, "John Doe"));
    }

    @Test
    public void getNameOrRetry() throws Exception {
        NameGenerator nameGenerator = new NameGenerator();
        assertNotEquals(StringHelper.EMPTY, nameGenerator.getNameOrRetry(NameType.DOUBLE_BARRELLED_MALE_FORENAME));
    }

    @Test
    public void getDefaultName() throws Exception {
        NameGenerator nameGenerator = new NameGenerator();
        assertEquals(Constant.DEFAULT_NAME, nameGenerator.getDefaultName());
    }
}
