# Modul 3 · Billing-Quiz, Szenario-Rechnung & Budget-Design (~20 Min, Plenum/Teams)

Kein Code, nur Diskussion und Kopfrechnen. Stand: Juli 2026 (AI Credits,
Usage-Based Billing seit 01.06.2026).

## Teil 1: Quiz „Verbraucht das AI Credits?"

| # | Aktion                                             | Credits? |
|---|----------------------------------------------------|----------|
| 1 | Inline-Completion beim Tippen (Tab)                | ☐ Ja ☐ Nein |
| 2 | Frage im Copilot Chat                              | ☐ Ja ☐ Nein |
| 3 | Next Edit Suggestion annehmen                      | ☐ Ja ☐ Nein |
| 4 | Session in der Copilot CLI                         | ☐ Ja ☐ Nein |
| 5 | Task an den Coding Agent delegieren                | ☐ Ja ☐ Nein |
| 6 | Copilot Code Review auf einem PR                   | ☐ Ja ☐ Nein |

Zusatzfrage: Bei welchen zwei Aktionen fallen **zusätzlich**
GitHub-Actions-Minuten an?

## Teil 2: Szenario-Rechnung

Team: **10 Entwickler:innen**, 20 Arbeitstage/Monat. Annahmen:

- Ø 25 Chat-Turns pro Person/Tag, Ø **0,5 Credits** pro Turn
- Ø 2 CLI-/Agent-Sessions pro Person/Tag, Ø **8 Credits** pro Session
- 40 Coding-Agent-Tasks im Monat (Team), Ø **25 Credits** pro Task

**Fragen:**
1. Wie viele Credits verbraucht das Team pro Monat? (1 Credit = 0,01 USD)
2. Was kostet das in USD, und was davon ist der größte Hebel?
3. Welche zwei Admin-Maßnahmen würdest Du zuerst einrichten?

*(Die Annahmen sind Workshop-Beispiele, keine offiziellen Preise.
Reale Werte hängen von Modellwahl und Kontextgröße ab.)*

## Teil 3: Budget-Design (~5 Min, Diskussion)

Dein Beispielteam aus Teil 2 (10 Entwickler:innen, Copilot Business):

1. **Der Pool:** Jede Lizenz bringt ihr Credit-Guthaben in den gemeinsamen
   Enterprise-Pool ein (Business: 19 $ = 1.900 Credits pro Lizenz).
   Wie groß ist der Monats-Pool des Teams, und reicht er für den
   Verbrauch aus Teil 2?
2. **Fair oder 80/20?** Zwei der zehn sind erkennbare Power-User.
   Universelle User-Budgets für alle, oder individuelle Limits?
3. **Alerts:** Warn-Mails gehen bei 75 / 90 / 100 % an die Admins.
   Wer sollte das bei Dir sein, und was passiert bei 90 %?
4. **Stopp-Risiko:** Budget erreicht = User blockiert (kein Fallback!).
   Für welche Teams wäre das mitten im Sprint akzeptabel, und wo
   brauchst Du ein Cost-Center-Zusatzbudget?
