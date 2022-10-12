package org.hbrs.s1.ws22.uebung1.util;

import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;
import org.hbrs.s1.ws22.uebung1.control.Translator;

/*
* Anwendung des Factory Method Design Pattern
* Problem: Inkonsistenten Erzeugung von Objekte und
* inskonsistente Parametrisierung von objekten
* Lösung: Bereitstellung einer Klasse zur konsistenten und zentralen erzeugung von Objekte
* */
public class TranslatorFactory {

    public static Translator creatGermanTranslator() {
        // Das Datum konsistent einsetzen in Germantranslator
        GermanTranslator germanTranslator = new GermanTranslator();
        germanTranslator.setDate("Okt/2022");
        return new germanTranslator();
    }
}
