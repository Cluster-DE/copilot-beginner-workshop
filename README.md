# GitHub Copilot Beginner-Workshop: Übungs-Repository

Begleitrepo zum ganztägigen Workshop am **13.07.2026** (Reply).
Ein Ordner pro Modul, jede Übung mit eigener `AUFGABE.md`.

## Voraussetzungen (bitte vor dem Workshop prüfen)

- **GitHub Copilot CLI**: `npm install -g @github/copilot` (Node ≥ 22), danach `copilot` → `/login`
- JDK 21 und Maven 3.9+ (`java -version`, `mvn -version`)
- Alle Module sind für Java 21 ausgelegt und nutzen moderne Sprachfeatures dieser Version.
- Aktive Copilot-Lizenz (Login auf github.com prüfen) + CLI in der Org-Policy freigeschaltet
- Optional, nur für Modul 5: IntelliJ mit GitHub-Copilot-Plugin
- Windows: Windows Terminal empfohlen; GitBash (bei Git für Windows dabei) deckt alle Bash-Beispiele ab, PowerShell-Varianten liegen bei

## Schnellstart

```bash
git clone <REPO-URL>
cd copilot-beginner-workshop
mvn -q test        # optional: Build-Check, sollte ohne Fehler durchlaufen
```

## Module

| Ordner     | Übung                                             | Dauer   |
|------------|---------------------------------------------------|---------|
| `modul-1/` | Erste Schritte: Completion, /explain, /tests      | ~25 Min |
| `modul-2/` | Prompt Engineering: A/B-Test, Few-Shot, Instructions | ~30 Min |
| `modul-3/` | Billing-Quiz, Szenario-Rechnung & Budget-Design      | ~20 Min |
| `modul-4/` | Copilot CLI: Erklären → Generieren → Git → /plan  | ~60 Min |

## AGENTS.md

`AGENTS.md` (Repo-Root) ist bewusst minimal und wird in **Übung 2 /
Task C** erweitert, um die Wirkung live zu testen.

## Material-Archiv (V2)

Für die Workshop-V2-Materialien wurde der Ordner `Matierlas/` ergänzt.
Zusätzlich liegt der bestehende `cheat-sheets/`-Inhalt als Archivkopie unter
`archiv/cheat-sheets/`.
