package org.hbrs.s1.ws22.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2022"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber(int number) {
		try {
			String [] feld ={"eins","zwei","drei","vier","fuenf","sechs","sieben","acht","neun","Zehn"};
			return feld[number-1];
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException("Uebersetzung der Zahl ["+ number+"] nicht moeglich !"+
												"Versionsnummer der Translator: " +Translator.version);
		}
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Okt/2022))
	 * Das Datum sollte system-intern durch eine Control-Klasse gesetzt werden
	 * und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
