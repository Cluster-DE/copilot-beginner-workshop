package de.workshop.modul1;

/**
 * Übung 1.1 – Kommentar → Funktion.
 * Siehe modul-1/AUFGABE.md.
 */
public final class EmailValidator {

    private EmailValidator() {
    }

    /**
     * Prüft, ob eine E-Mail-Adresse gültig ist.
     * Regeln: genau ein '@', nicht-leerer Local-Part, Domain mit
     * mindestens einem '.' (nicht am Anfang oder Ende der Domain).
     *
     * @param email die zu prüfende E-Mail-Adresse
     * @return {@code true} wenn die Adresse gültig ist, sonst {@code false}
     */
    public static boolean isValid(String email) {
        if (email == null) {
            return false;
        }
        int atIndex = email.indexOf('@');
        if (atIndex <= 0) {
            return false;
        }
        if (email.indexOf('@', atIndex + 1) != -1) {
            return false;
        }
        String domain = email.substring(atIndex + 1);
        if (domain.isEmpty()) {
            return false;
        }
        int dotIndex = domain.indexOf('.');
        if (dotIndex <= 0 || dotIndex == domain.length() - 1) {
            return false;
        }
        return true;
    }

}
