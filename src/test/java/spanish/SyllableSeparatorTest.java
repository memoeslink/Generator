package spanish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SyllableSeparatorTest {

    @Test
    void getSyllableBySyllable() throws Exception {
        assertEquals("es-lo-gan", new SyllableSeparator("eslogan").getSyllableBySyllable());
        assertEquals("pa-na-de-ro", new SyllableSeparator("panadero").getSyllableBySyllable());
        assertEquals("mies", new SyllableSeparator("mies").getSyllableBySyllable());
        assertEquals("es-pé-ci-men", new SyllableSeparator("espécimen").getSyllableBySyllable());
    }
}