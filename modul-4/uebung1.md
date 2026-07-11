# Ü1: Was macht dieser Einzeiler?

```bash
find logs -name '*.log' -mtime +7 -print0 | xargs -0 awk 'ENDFILE{print FILENAME": "FNR" Zeilen"}' | sort -t: -k2 -rn
```

**Aufgabe:** Lass Dir den Befehl von der Copilot CLI erklären,
Stück für Stück. Danach im Team beantworten:

1. Was landet in der Ausgabe, und in welcher Reihenfolge?
2. Warum `-print0` und `xargs -0`?
3. Auf welchem System läuft das so **nicht**, und warum?
