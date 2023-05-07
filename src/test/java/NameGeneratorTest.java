import common.Constant;
import common.NameGenerator;
import common.NameType;
import common.StringHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameGeneratorTest {

    @Test
    public void getNameOrDefault() throws Exception {
        NameGenerator nameGenerator = new NameGenerator();
        Assertions.assertNotEquals(StringHelper.EMPTY, nameGenerator.getNameOrDefault(NameType.EMPTY, "John Doe"));
    }

    @Test
    public void getNameOrRetry() throws Exception {
        NameGenerator nameGenerator = new NameGenerator();
        Assertions.assertNotEquals(StringHelper.EMPTY, nameGenerator.getNameOrRetry(NameType.DOUBLE_BARRELLED_MALE_FORENAME));
    }

    @Test
    public void getDefaultName() throws Exception {
        NameGenerator nameGenerator = new NameGenerator();
        Assertions.assertEquals(Constant.DEFAULT_NAME, nameGenerator.getDefaultName());
    }
}
