*** Settings ***
Documentation     Ein einfaches Beispiel für einen Robot Framework Testfall.

*** Test Cases ***
Mein Erster Testfall
    [Documentation]    Prüft, ob eine einfache Log-Ausgabe funktioniert.
    Log                Hallo Welt!
    Should Be Equal    ${2 + 2}    ${4}

Zweiter Testfall mit Variablen
    [Documentation]    Prüft Text-Vergleich.
    ${name}=           Set Variable    Robot Framework
    Should Be Equal    ${name}         Robot Framework

