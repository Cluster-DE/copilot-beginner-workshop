# Glossar – GitHub Copilot Beginner-Workshop

Kurznachschlagewerk für die Begriffe des Tages. Bewusst knapp – ein Satz
pro Eintrag.

| Begriff | Kurz erklärt |
|---|---|
| **Completion** | Inline-Vorschlag beim Tippen, mit Tab übernommen. Nur in der IDE, Flatrate. |
| **Chat** | Fragen, Erklärungen, Refactorings im Dialog – im Editor, auf github.com oder mobil. |
| **Copilot CLI** | Agentisches Copilot im Terminal: liest, schreibt, führt aus – Sie bestätigen. Unser Zuhause heute. |
| **Programmatischer Modus** | `copilot -p "..."` – ein Auftrag, ein Ergebnis, kein Chat. Baustein für Skripte und CI. |
| **Agent Mode** | Mehrschrittiges Arbeiten im Editor: analysieren, editieren, Tools ausführen. |
| **Coding Agent** | Cloud-Agent: Issue rein, Draft-PR raus. Läuft asynchron auf GitHub Actions. |
| **/plan** | Erst den Plan zeigen lassen, prüfen, freigeben – dann erst wird gearbeitet. |
| **Autopilot** | Shift+Tab: der Agent arbeitet selbstständig bis zum Ziel. Nur in sicherer Umgebung. |
| **/delegate** | Übergibt die Aufgabe an den Cloud Coding Agent (Branch + Draft-PR im Hintergrund). |
| **AGENTS.md** | Dauerhafte Projektregeln, die die CLI automatisch mitliest ("So arbeitet dieses Projekt"). |
| **Custom Agent** | Spezialisierte Copilot-Persona per Markdown-Datei (z. B. Release-Agent). |
| **Agent Skill** | Wiederverwendbare Fähigkeit (`SKILL.md`), bei Bedarf in den Kontext geladen. |
| **MCP** | Model Context Protocol: externe Systeme/Werkzeuge an den Agenten andocken. |
| **Kontextfenster** | Endliches Budget aus Prompt + Dateien + Verlauf. Läuft es über, fällt der Anfang raus. |
| **AI Credits** | Verbrauchsabrechnung seit 06/2026. Completions Flatrate, Agenten kosten Tokens. |
| **Agent HQ** | Kommandozentrale (Agents-Tab auf github.com) für alle laufenden Agent-Sessions. |
| **Rubber Duck** | `/rubber-duck`: zweites Modell als unabhängiger Kritiker auf Plan, Code oder Tests. |

_Beitrag als Seed-PR angelegt – gedacht als Demo-Objekt für den Pull-requests-Tab der CLI._
