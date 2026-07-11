# Erzeugt Beispiel-Logdateien mit unterschiedlichem Alter (fuer Ue2) - Windows/PowerShell
# Aufruf aus dem Repo-Root:  powershell -ExecutionPolicy Bypass -File .\modul-4\generate-logs.ps1
$ErrorActionPreference = "Stop"
Set-Location $PSScriptRoot
New-Item -ItemType Directory -Force -Path logs, archive | Out-Null

foreach ($d in 1, 3, 6, 8, 10, 14, 30) {
    $ts = (Get-Date).AddDays(-$d)
    $name = "logs/app-{0:yyyyMMdd}.log" -f $ts
    @(
        ("INFO  {0:yyyy-MM-dd}  Anwendung gestartet" -f $ts)
        ("INFO  {0:yyyy-MM-dd}  Beispiel-Logeintrag (Alter: $d Tage)" -f $ts)
        ("WARN  {0:yyyy-MM-dd}  Nichts Ernstes, nur Workshop-Daten" -f $ts)
    ) | Set-Content -Path $name
    (Get-Item $name).LastWriteTime = $ts
}

$count = (Get-ChildItem logs/*.log).Count
Write-Host "OK: $count Logdateien in ./logs erzeugt (1-30 Tage alt)."
$old = (Get-ChildItem logs/*.log | Where-Object { $_.LastWriteTime -lt (Get-Date).AddDays(-7) }).Count
Write-Host "Davon aelter als 7 Tage: $old"
