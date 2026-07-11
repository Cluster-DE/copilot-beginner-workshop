# Modul 4 · Übungsreihe Copilot CLI (~50 Min Kern + Optionale, Zweierteams)

**Regel des Tages: Verstehen, dann ausführen.** Jede vorgeschlagene
Aktion erst lesen, dann bestätigen.

**Vorbereitung:** Terminal im Repo-Root öffnen, `copilot` starten,
Ordner-Zugriff bestätigen. Modell prüfen: `/model`.
**Profi-Tipp zuerst:** `git status` sauber? Vor jedem Agent-Lauf
committen, dann ist Verwerfen jederzeit gefahrlos.

## Ü1 · Erklären lassen (~10 Min)
Öffne `modul-4/uebung1.md` und lass Dir den Einzeiler von der CLI
erklären. Prüfe im Team: Stimmt die Erklärung mit Deinem Verständnis
überein? Was ist der Portabilitäts-Haken?
*(Der Einzeiler ist bewusst Unix, unter Windows in GitBash ansehen;
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
**Vor dem Ausführen:** Vorschlag lesen. Erwartest Du 3 oder 4 Dateien?
Danach kontrollieren: `ls modul-4/archive`.

## Ü3 · Git-Workflow (~15 Min)
Komplett per CLI: Branch `uebung/<team>` anlegen → kleine Änderung
umsetzen lassen (z. B. Javadoc für `Result.java`) → aussagekräftige
Commit-Message generieren lassen → committen. Lass vor dem Commit
`mvn -q test` ausführen, Tools prüfen, nicht Vertrauen.
**Prüfe die Message:** Würde sie in Deinem Team ein Review bestehen?

## Ü4 · Challenge mit /plan (~20 Min, optional)
Aufgabe an die CLI, aber **erst `/plan`**, Plan prüfen, dann freigeben:
*„Analysiere dieses Repo und erstelle ein Skript `tools/todo-report.sh`,
das alle TODO-Kommentare in Java-Dateien findet und als Markdown-Tabelle
(Datei, Zeile, Text) nach `tools/TODO-REPORT.md` schreibt. Führe es aus
und zeig mir das Ergebnis."*
Bewerte: Hat der Plan gestimmt? Wo musstest Du eingreifen?

## Ü5 · Schnitzeljagd 🥚 (optional, ~8 Min, Spaßfaktor hoch)
Irgendwo in diesem Repository verstecken sich **drei GEHEIMWORTE**
als Kommentare. Finde sie, aber nicht selbst mit grep tippen,
sondern **die CLI suchen lassen**. Bilde aus den drei Worten
(Reihenfolge 1/3, 2/3, 3/3) den Lösungssatz und poste ihn in den Chat.

Erstes Team gewinnt Ruhm, Ehre und die Erkenntnis, dass die CLI ein
komplettes Repo schneller durchsucht, als Du `grep -rn` tippen kannst.

## Ü6 · Rubber-Duck-Review 🦆 (optional, ~5 Min)
Gib `/rubber-duck` ein und lass Dir Deinen Ü3-Commit adversarial
zerpflücken, die Quietscheente ist seit Juni standardmäßig an Bord
und überraschend gnadenlos. Was hat sie gefunden, das Dir entging?

## Abschluss-Checkpoint (~3 Min)
`/usage`: Was hat Deine Übungsreihe verbraucht? Kurz im Plenum
vergleichen: Wer war sparsam, wer hat den Autopiloten laufen lassen?
Und wirf einmal `/agents` an: Welche Custom Agents sind bei Dir
sichtbar? (Vorgeschmack auf den Folge-Workshop.)
Zum Schluss: Einmal mit der Pfeiltaste `→` durch die neuen Tabs
schalten (Session · Issues · Pull requests · Gists), Dein
GitHub-Überblick, ohne die CLI zu verlassen. **Optional, wenn Zeit:**
Im Issues-Tab ein Issue mit dem Label `agent-ready` markieren, mit `c`
als Referenz in den Prompt holen und die CLI einen Lösungsplan
vorschlagen lassen (noch **nicht** ausführen, erst den Plan ansehen).
So wird aus dem Überblick in Sekunden echte Arbeit.
