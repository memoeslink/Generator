package spanish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PluralizerTest {

    @Test
    void pluralize() throws Exception {
        assertEquals("amaneceres", Pluralizer.pluralize("amanecer"));
        assertEquals("amplitudes", Pluralizer.pluralize("amplitud"));
        assertEquals("lodazales", Pluralizer.pluralize("lodazal"));
        assertEquals("golpes de Estado", Pluralizer.pluralize("golpe de Estado"));
    }

    @Test
    void pluralizeInvariableWord() throws Exception {
        assertEquals("tórax", Pluralizer.pluralize("tórax"));
        assertEquals("viacrucis", Pluralizer.pluralize("viacrucis"));
    }

    @Test
    void pluralizeException() throws Exception {
        assertEquals("eslóganes", Pluralizer.pluralize("eslogan"));
        assertEquals("regímenes", Pluralizer.pluralize("régimen"));
        assertEquals("caracteres", Pluralizer.pluralize("carácter"));
    }

    @Test
    void pluralizeMonosyllable() throws Exception {
        assertEquals("grises", Pluralizer.pluralize("gris"));
        assertEquals("mieses", Pluralizer.pluralize("mies"));
        assertEquals("cuáles", Pluralizer.pluralize("cuál"));
        assertEquals("faxes", Pluralizer.pluralize("fax"));
        assertEquals("valses", Pluralizer.pluralize("vals"));
        assertEquals("reyes", Pluralizer.pluralize("rey"));
    }

    @Test
    void pluralizeConsonantEndingOxytoneWithAcuteAccent() throws Exception {
        assertEquals("atunes", Pluralizer.pluralize("atún"));
        assertEquals("corazones", Pluralizer.pluralize("corazón"));
        assertEquals("aviones", Pluralizer.pluralize("avión"));
    }

    @Test
    void pluralizeWordEndingWithZ() throws Exception {
        assertEquals("lápices", Pluralizer.pluralize("lápiz"));
        assertEquals("matraces", Pluralizer.pluralize("matraz"));
    }

    @Test
    void pluralizeProparoxytones() throws Exception {
        assertEquals("déficit", Pluralizer.pluralize("déficit"));
        assertEquals("déficit", Pluralizer.pluralize("déficit"));
    }
}