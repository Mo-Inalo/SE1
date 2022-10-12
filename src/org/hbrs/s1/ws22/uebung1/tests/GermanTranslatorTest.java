package org.hbrs.s1.ws22.uebung1.tests;
import org.hbrs.s1.ws22.uebung1.control.Translator;
import org.hbrs.s1.ws22.uebung1.control.TranslatorFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GermanTranslatorTest {

    Translator translator = TranslatorFactory.creatGermanTranslator();
    @Test
    public void translatNumberTestAssertEqual(){
       assertEquals("sechs", translator.translateNumber(6));
    }
    @Test
    public void translatNumberTestAssertFalse(){
        assertNotEquals("drei", translator.translateNumber(2));
    }
    @Test
    public void translatNumberTestAssertThrows() {
        assertThrows(IndexOutOfBoundsException.class, () -> translator.translateNumber(14));
    }

}
