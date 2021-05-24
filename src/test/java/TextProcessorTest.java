import common.TextProcessor;
import common.Word;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextProcessorTest {

    @Test
    void getFirstSeveredWord() {
        assertEquals(new Word("niña").getFeminineForm(), TextProcessor.getFirstSeveredWord("niño(a)").getFeminineForm());
    }

    @Test
    void getSeveredWords() {
        assertEquals(new Word("adulto").getWord(), TextProcessor.getSeveredWords("niño(a), adulto").get(1).getNeutralForm());
    }
}