# Modul 4 · Übungsreihe Copilot CLI (~50 Min Kern + Optionale, Zweierteams)

**Regel des Tages: Verstehen, dann ausführen.** Jede vorgeschlagene
Aktion erst lesen, dann bestätigen.

**Vorbereitung:** Terminal im Repo-Root öffnen, `copilot` starten,
Ordner-Zugriff bestätigen. Modell prüfen: `/model`.
**Profi-Tipp zuerst:** `git status` sauber? Vor jedem Agent-Lauf
committen – dann ist Verwerfen jederzeit gefahrlos.

## Ü1 · Erklären lassen (~10 Min)
Öffne `modul-4/uebung1.md` und lass dir den Einzeiler von der CLI
erklären. Prüft im Team: Stimmt die Erklärung mit eurem Verständnis
überein? Was ist der Portabilitäts-Haken?
*(Der Einzeiler ist bewusst Unix – unter Windows in GitBash ansehen;
Ausführen ist optional, Erklären ist die Aufgabe.)*

## Ü2 · Generieren & prüfen (~15 Min)
Erst Testdaten erzeugen (macOS/Linux/GitBash **oder** Windows PowerShell):
```bash
./modul-4/generate-logs.sh
```
```powershell
powershell -ExecutionPolicy Bypass -File .\modul-4\generate-logs.ps1
```
Dann die CLI bitten: *„Finde alle .log-Dateien in modul-4/logs, die
älter als 7 Tage sind, und verschiebe sie nach modul-4/archive."*
**Vor dem Ausführen:** Vorschlag lesen. Erwartet ihr 3 oder 4 Dateien?
Danach kontrollieren: `ls modul-4/archive`.

## Ü3 · Git-Workflow (~15 Min)
Komplett per CLI: Branch `uebung/<team>` anlegen → kleine Änderung
umsetzen lassen (z. B. Javadoc für `Result.java`) → aussagekräftige
Commit-Message generieren lassen → committen. Lasst vor dem Commit
`mvn -q test` ausführen – Tools prüfen, nicht Vertrauen.
**Prüft die Message:** Würde sie in eurem Team ein Review bestehen?

## Ü4 · Challenge mit /plan (~20 Min, optional)
Aufgabe an die CLI – aber **erst `/plan`**, Plan prüfen, dann freigeben:
*„Analysiere dieses Repo und erstelle ein Skript `tools/todo-report.sh`,
das alle TODO-Kommentare in Java-Dateien findet und als Markdown-Tabelle
(Datei, Zeile, Text) nach `tools/TODO-REPORT.md` schreibt. Führe es aus
und zeig mir das Ergebnis."*
Bewertet: Hat der Plan gestimmt? Wo musstet ihr eingreifen?

## Ü5 · Schnitzeljagd 🥚 (optional, ~8 Min, Spaßfaktor hoch)
Irgendwo in diesem Repository verstecken sich **drei GEHEIMWORTE**
als Kommentare. Findet sie – aber nicht selbst mit grep tippen,
sondern **die CLI suchen lassen**. Bildet aus den drei Worten
(Reihenfolge 1/3, 2/3, 3/3) den Lösungssatz und postet ihn in den Chat.

Erstes Team gewinnt Ruhm, Ehre und die Erkenntnis, dass die CLI ein
komplettes Repo schneller durchsucht, als ihr `grep -rn` tippen könnt.

## Ü6 · Rubber-Duck-Review 🦆 (optional, ~5 Min)
Gebt `/rubber-duck` ein und lasst euch euren Ü3-Commit adversarial
zerpflücken – die Quietscheente ist seit Juni standardmäßig an Bord
und überraschend gnadenlos. Was hat sie gefunden, das euch entging?

## Abschluss-Checkpoint (~3 Min)
`/usage` – was hat eure Übungsreihe verbraucht? Kurz im Plenum
vergleichen: Wer war sparsam, wer hat den Autopiloten laufen lassen?
Und werft einmal `/agents` an: Welche Custom Agents sind bei euch
sichtbar? (Vorgeschmack auf den Folge-Workshop.)
Zum Schluss: Einmal mit der Pfeiltaste `→` durch die neuen Tabs
schalten (Session · Issues · Pull requests · Gists) – euer
GitHub-Überblick, ohne die CLI zu verlassen. **Optional, wenn Zeit:**
Im Issues-Tab ein Issue mit dem Label `agent-ready` markieren, mit `c`
als Referenz in den Prompt holen und die CLI einen Lösungsplan
vorschlagen lassen (noch **nicht** ausführen – erst den Plan ansehen).
So wird aus dem Überblick in Sekunden echte Arbeit.
