# Java Basis Aufgaben
Dieses Projekt entstand im Rahmen eines Kurses der Hacker School (www.hacker-school.de) für Kinder und Jugendliche. Es enthält 6 Aufgaben, die die Grundlagen
der Java-Programmierung an einfachen Beispielen verdeutlicht. 

Die Aufgaben sind lediglich eine Ergänzung zu den Kursmaterialien, in denen die zugrundeliegenden
Konzepte erklärt werden (sollten). Dieses Materialien sind nicht Bestandteil dieses Projekts.

## Aufgabe 01 (Erste Schritte, einfache Operationen)
### Die Main-Methode in der Klasse _Main _dient der Ausführung deines ersten Programms
- Gib `Hallo Welt!` auf der Kommandozeile aus. **Tipp**: Nutze den Befehl `System.out.println();`
- Gib das Ergebnis von 32523 + 312556 × 2 auf der Kommandozeile aus.
- Gib das Ergebnis von 1 > 2 auf der Kommandozeile aus.
- Gib einen Text aus, in dem zwei Spieler gegeneinander ein Symbol (Stein, Papier, Schere) spielen.
- Speichere diesen Text nun in einer Variablen und gib den Inhalt der Variablen auf der Kommandozeile aus.
- Speichere einen Text in einer Variablen a und eine Zahl in Variable b. Gib beides zusammen in einer Zeile auf der Kommandozeile aus.

### Aufgaben für Fortgeschrittene:
- Speichere den String `Hallo Welt` und gib jeden Buchstaben des Strings einzeln (jeweils eine neue Zeile) und in umgekehrter Reihenfolge aus. Nutze dafür Methoden der Klasse `String`.
- Gib das (korrekte) Ergebnis von 2147483647 × 2 aus. **Tipp**: Das richtige Ergebnis ist nicht negativ. ;-)
- Zeige an einem Beispiel, dass das Vergleichen von `String` mit == keine gute Idee ist. 
  - Warum ist das so? 
  - Was sollte man stattdessen verwenden?

## Aufgabe 02 (weitere Operationen, Schleifen)
- Gib die Zahlen von 1 bis 10 zeilenweise aus. Benutze dafür eine Schleife.
- Speichere deinen Namen in einer Variablen. 
  - Gib nun jeden Buchstaben einzeln zeilenweise aus. Benutze dafür eine Schleife und die Methode `charAt(int)` der Klasse `String` (z.B. `"Philipp".charAt(2)` gibt `i` zurück).
- Gib die Zahlen von 1 bis 10 zeilenweise aus, aber gib jede Zahl jeweils dreimal aus. Du darfst `System.out.println()` nur einmal verwenden! Nutze dafür eine Schleife in einer Schleife.
- Bei Schleifen muss man aufpassen, dass man nicht "über das Ziel hinaus läuft". Nimm wieder deinen Namen als Variable wie oben, aber lasse die Schleife diesmal weiter laufen. 
  - Was wird dir in der Kommandozeile angezeigt? 
  - Weißt du, warum das passiert? 
  - Warum ist das ein Problem?

## Aufgabe 03 (if else)
- Nimm wieder deine Schleife, die Zahlen von 1 bis 10 ausgibt. Erweitere die Schleife so, dass alle ungeraden Zahlen doppelt ausgegeben werden. **Tipp**: Eventuell ist der `%`-Operator hilfreich. ;-)
- Multipliziere jetzt alle geraden Zahlen mit 2 bevor du sie jeweils einmal ausgibst. Die ungeraden Zahlen sollen weiterhin doppelt ausgegeben werden. (Also: `1 1 4 3 3 8 5 5` ...)
- Speichere deinen Namen in einer Variablen und lass diese in einer Schleife buchstabenweise ausgeben (siehe Aufgabe 2). Gib aber **keine** Vokale (a, e, i, o, u) aus.
- Speichere den String `Hacker School` in einer Variablen. Nutze wie in der vorherigen Aufgabe eine Schleife und `charAt(int)` um dir die einzelnen Buchstaben anzuschauen. Falls der Buchstabe kein Vokal ist, soll er in einem neuen String gespeichert werden. 
  - Lass diesen neuen String dann ausgeben. Als Ausgabe müsste `Hckr Schl` erscheinen. **Tipp**: `String` lassen sich mit '+' verknüpfen. Aus `"Philip" + "p"` wird also `Philipp`.

## Aufgabe 04 (Klassen und Methode)
- Schreibe eine Klasse `Fahrzeug`. Ein `Fahrzeug` hat eine Farbe, und eine bestimmte Anzahl an Reifen. 
- Schreibe eine Methode, die eine Farbe zurückgibt. 
- Schreibe eine Methode, die die Anzahl an Rädern zurückgibt.


- Ein `Fahrzeug` hat auch Licht. Schreibe eine Klasse `Lampe` und schreibe in der Klasse `Fahrzeug` eine Methode `gibBeleuchtung()`, die eine Lampe zurückgibt.

## Aufgabe 05 (Besonderheiten von Klassen)
Klassenvariablen sind in der gesamten Klasse verfügbar und gelten jeweils für ein Objekt der Klasse.
- Speichere die Farbe eines `Fahrzeug` als Klassenvariable in der Klasse `Fahrzeug`. 
- Speichere die Anzahl der Räder als Klassenvariable in der Klasse `Fahrzeug`. 
- Verändere den Konstruktor der Klasse so, dass man einem `Fahrzeug` die Anzahl Räder und die Farbe beim Erstellen des Objekts mitgeben kann, z.B. `new Fahrzeug("Gelb", 4);`
- Außerdem wird eine `Lampe` in der Klasse `Fahrzeug` gespeichert. 
- Verändere außerdem die Rückgabe-Methoden der Klasse `Fahrzeug` so, dass jetzt der Inhalt der Klassenvariablen zurückgegeben wird.


- Erstelle zwei Objekte der Klasse `Fahrzeug` mit unterschiedlicher Anzahl Räder und verschiedenen Farben.
- Lass die Farbe und die Anzahl Räder beider Objekte auf der Kommandozeile ausgeben.

## Aufgabe 06 (Vererbung)
- Erstelle eine Klasse `Auto`, die von `Fahrzeug` erbt. Erstelle eine Klasse `Fahrrad`, die von `Fahrzeug` erbt. 
- Ein `Auto` hat immer 4 Räder, ein `Fahrrad` immer 2. Beiden Objekten soll nur noch eine Farbe mitgegeben werden können. Beide Klassen sollen trotzdem wie bisher die Anzahl Räder zurückgeben können.
```
Auto auto = new Auto("Gelb");
auto.gibAnzahlRaeder() // soll 4 zurückgeben
```

**Tipp**: Mit `super(...)` kann man den Konstruktor der übergeordneten Klasse aufrufen.