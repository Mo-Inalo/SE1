package org.hbrs.s1.ws22.uebung1.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;
import org.hbrs.s1.ws22.uebung1.control.Translator;
import org.hbrs.s1.ws22.uebung1.control.TranslatorFactory;
import org.junit.Test;


 



public class GermanTranslatorTest {


    @Test
    public void germanTranlatorTest(){
        Translator translator = TranslatorFactory.creatGermanTranslator();
        assertEquals("sechs", translator.translateNumber(6));

    }

   /* @Test
    public void germanTranlatorTest2() throws IndexOutOfBoundsException {
        Translator translator = TranslatorFactory.creatGermanTranslator();
        IndexOutOfBoundsException e = null;
        assertThrows(e.getMessage(), translator.translateNumber(14));

    }*/


}
