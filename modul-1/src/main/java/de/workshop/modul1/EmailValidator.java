package de.workshop.modul1;

/**
 * Übung 1.1 – Kommentar → Funktion.
 * Siehe modul-1/AUFGABE.md.
 */
public final class EmailValidator {

    private EmailValidator() {
    }

    // TODO Übung 1.1:
    // Schreibe direkt unter diesem Kommentar eine öffentliche statische
    // Methode isValid(String email), die prüft, ob eine E-Mail-Adresse
    // gültig ist: genau ein '@', nicht-leerer Local-Part, Domain mit
    // mindestens einem '.' (nicht am Anfang oder Ende).
    //
    // Tipp: Kommentar + Methodensignatur tippen und Copilots Vorschläge
    // mit Alt+] / Alt+[ durchblättern, bevor du übernimmst.

    public static boolean isValid(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex != email.lastIndexOf('@')) {
            return false;
        }
        String domain = email.substring(atIndex + 1);
        if (domain.isEmpty()) {
            return false;
        }
        int dotIndex = domain.indexOf('.');
        return dotIndex > 0 && dotIndex < domain.length() - 1;
    }

}
