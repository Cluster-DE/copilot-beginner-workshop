# Modul 2 · Übung 2: Prompts, die treffen (~27 Min, Zweierteams)

**Ziel:** Gleiche Aufgabe, anderer Prompt – deutlich besseres Ergebnis
erleben. Alles in der Copilot CLI, gestartet im Repo-Root.

## Task A: A/B-Prompt-Experiment (~11 Min)
Ziel-Datei: `modul-2/src/main/java/de/workshop/modul2/taska/OrderStatistics.java`

**Runde 1 (vage):**
> „implementier topCustomers"

Ergebnis in eine Notiz kopieren, dann zurücksetzen:
```bash
git checkout -- modul-2
```

**Runde 2 (präzise):** Ziel + drei Randbedingungen, z. B.:
> „Implementiere topCustomers in OrderStatistics.java: Rückgabe der n
> Kunden-IDs mit höchstem Gesamtumsatz, absteigend sortiert; bei
> Gleichstand alphabetisch; keine externen Libraries; Java Streams
> bevorzugt; n größer als die Kundenzahl sauber behandeln.
> Erkläre zuerst kurz deinen Lösungsweg, dann implementiere."

**Vergleicht beide Ergebnisse im Team:** Was hat die Präzision verändert?

## Task B: Few-Shot – Stil vorgeben (~8 Min)
> „Ergänze in modul-2/.../taskb/UserService.java die Methode
> deactivateUser(String userId) im Stil der vorhandenen Methoden."

**Beobachtet:** Folgt die CLI dem Muster (Guard Clauses, `Result`,
englische Meldungen) – ohne dass ihr es beschreibt?

## Task C: AGENTS.md live (~8 Min)
Ergänzt `AGENTS.md` im Repo-Root um **drei Team-Regeln** (z. B. „Alle
öffentlichen Methoden brauchen Javadoc", „Keine Magic Numbers", „Tests
nutzen AssertJ"). Startet eine **neue Session** und stellt eine
Code-Aufgabe – werden die Regeln befolgt?

## Bonus: Prompt-Golf ⛳ (~10 Min, wenn Zeit ist)
**Die Aufgabe:** Eine Klasse `RomanNumerals` mit Methode
`String toRoman(int n)` für 1–100, im Paket
`de.workshop.modul2.bonus` (Modul 2, neue Datei).

**Die Regeln:**
1. **Ein einziger Prompt** pro Team – keine Nachbesserung!
2. Die CLI muss den Code erzeugen **und** einen Schnelltest ausführen
   (z. B. 1→I, 4→IV, 9→IX, 40→XL, 99→XCIX).
3. Punktwertung: funktioniert auf Anhieb = 5 Punkte.
   Bei Gleichstand gewinnt der **kürzeste Prompt** (Zeichen zählen).

Golf eben: So wenig Schläge (Zeichen) wie möglich – aber der Ball
muss ins Loch. Jury: das Plenum.
