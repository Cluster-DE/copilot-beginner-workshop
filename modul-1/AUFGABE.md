# Modul 1 · Übung 1: Erste Session in der CLI (~20 Min, einzeln)

**Ziel:** Erwartungen kalibrieren – wo überzeugt die CLI, wo nicht?

**Vorbereitung:** Terminal im **Repo-Root** öffnen, `copilot` starten,
Ordner-Zugriff bestätigen. Kurzcheck: `/model` zeigt das aktive Modell.

## 1.0 Warm-up: Der Piraten-Test (~3 Min, garantiert lustig)
Erste Frage an die CLI:
> „Erklär mir dieses Repository in drei Sätzen – im Stil eines Piraten."

Kein Witz, das hat einen Zweck: Sie sehen sofort, (a) dass die CLI das
Repo wirklich gelesen hat und (b) wie präzise sie Stil-Anweisungen
befolgt. Wer mag: Haiku statt Pirat. Bestes Ergebnis in den Chat! 🏴‍☠️

## 1.1 Starten & erklären lassen (~6 Min)
Fragen Sie die CLI:
> „Erklär mir modul-1/src/main/java/de/workshop/modul1/LegacyReportParser.java –
> was bedeuten die Flags X, S und R?"

Prüft die Antwort kritisch: Die fachliche Bedeutung der Flags steht
nirgends im Code – was davon ist hergeleitet, was geraten?

## 1.2 Code erzeugen lassen (~6 Min)
> „Implementiere isValid(String email) in EmailValidator.java gemäß
> TODO-Kommentar."

**Diff lesen, verstehen, dann bestätigen.** Würden Sie das so mergen?

## 1.3 Tests generieren & ausführen (~6 Min)
Lassen Sie Tests für den Validator erzeugen (Ziel: `src/test/java/...`)
und führen Sie sie aus:
```bash
mvn -q test -pl modul-1
```
**Kritisch prüfen:** Welche Randfälle fehlen? (`null`? doppeltes `@`?
Punkt direkt nach dem `@`?)

## Bonus
Mit `/model` das Modell wechseln und 1.2 wiederholen – was ändert sich
an Stil und Gründlichkeit? Danach `/usage`: erster Blick darauf, was
die Session verbraucht hat.
