#!/usr/bin/env bash
# tools/standup.sh – Standup-Helfer: fasst die letzten N Git-Commits als Bullet-Liste zusammen.
# Aufruf:  ./tools/standup.sh [N]        Standard: N=5
# --allow-tool="shell(git:*)" gibt ausschliesslich git-Befehle frei – minimale Rechte.
set -euo pipefail

N=${1:-5}
copilot -s \
        --allow-tool="shell(git:*)" \
        -p "Fasse die letzten ${N} Commits als Bullet-Liste zusammen"
