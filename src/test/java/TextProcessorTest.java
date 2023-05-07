import common.TextProcessor;
import common.Word;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextProcessorTest {

    @Test
    void getFirstSeveredWord() throws Exception {
        Assertions.assertEquals(new Word("niña").getFeminineForm(), TextProcessor.getFirstSeveredWord("niño(a)").getFeminineForm());
    }

    @Test
    void getSeveredWords() throws Exception {
        Assertions.assertEquals(new Word("adulto").getWord(), TextProcessor.getSeveredWords("niño(a), adulto").get(1).getNeutralForm());
    }
}