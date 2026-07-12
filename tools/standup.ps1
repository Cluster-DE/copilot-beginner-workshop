# tools/standup.ps1 – Standup-Helfer: fasst die letzten N Git-Commits als Bullet-Liste zusammen.
# Aufruf:  powershell -ExecutionPolicy Bypass -File .\tools\standup.ps1 [-N <Zahl>]   Standard: N=5
# --allow-tool="shell(git:*)" gibt ausschliesslich git-Befehle frei – minimale Rechte.
param([int]$N = 5)

copilot -s `
        --allow-tool="shell(git:*)" `
        -p "Fasse die letzten $N Commits als Bullet-Liste zusammen"
