package org.hbrs.s1.ws22.uebung1.test;
import org.hbrs.s1.ws22.uebung1.control.Translator;
import org.hbrs.s1.ws22.uebung1.util.TranslatorFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GermanTranslatorTest {

    Translator translator = TranslatorFactory.creatGermanTranslator();
    @Test
    public void translatNumberTestAssertEqual(){
       assertEquals("fuenf", translator.translateNumber(5));
    }
    @Test
    public void translatNumberTestAssertFalse(){
        assertNotEquals("drei", translator.translateNumber(2));
    }
    @Test
    public void translatNumberTestNegAssertThrows() {
        assertThrows(IndexOutOfBoundsException.class, () -> translator.translateNumber(-4));
    }

}
