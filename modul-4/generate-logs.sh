#!/usr/bin/env bash
# Erzeugt Beispiel-Logdateien mit unterschiedlichem Alter (für Ü2).
set -euo pipefail
cd "$(dirname "$0")"
mkdir -p logs archive

days="1 3 6 8 10 14 30"
for d in $days; do
  if stamp=$(date -d "-${d} days" +%Y%m%d%H%M 2>/dev/null); then
    :
  else
    stamp=$(date -v -"${d}"d +%Y%m%d%H%M)   # macOS/BSD-Fallback
  fi
  f="logs/app-${stamp:0:8}.log"
  {
    printf 'INFO  %s  Anwendung gestartet\n' "${stamp:0:8}"
    printf 'INFO  %s  Beispiel-Logeintrag (Alter: %s Tage)\n' "${stamp:0:8}" "$d"
    printf 'WARN  %s  Nichts Ernstes, nur Workshop-Daten\n' "${stamp:0:8}"
  } > "$f"
  touch -t "${stamp}" "$f"
done

count=$(ls logs/*.log | wc -l | tr -d ' ')
echo "✔ ${count} Logdateien in ./logs erzeugt (1–30 Tage alt)."
echo "  Davon älter als 7 Tage: $(find logs -name '*.log' -mtime +7 | wc -l | tr -d ' ')"
