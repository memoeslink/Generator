import common.NameGenerator;
import common.NameType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.memoeslink.StringHelper;

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
}
