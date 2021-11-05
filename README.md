# Oblig3---git-og-continuous-integration
Oblig 3

Først lagde jeg repository på Github.
Så opprettet jeg workflowen, hvor jeg brukte en av basic workflow'ene.
Etter litt surr fant jeg ut det var lettere å lage en tom repository uten ReadMe etc, så gjorde det.

Deretter pushet jeg Maven prosjektet med alle klassene til dette repoet.
Forså å lage et nytt workflow hvor jeg da kunne velge en workflow rettet mot Maven.

Skjønte ikke hvorfor jeg fikk et par errors, men det var grunnet jeg hadde satt Maven til versjon 11 og JDK til 17.
Så addet jeg koden som ble lagt ut på Canvas Announcments ift Maven prosjekter --Maven-Surefire-- som ikke kjørte, deretter funket koden som forventet. 
Maven visste at det var tester som skulle kjøres, men fant ikke fila pga den ikke inneholdt *Test* så refactora jeg det.
Slet forskjellen med "Test" og "verify" i workflowen, ettersom begge to så ut til å gjøre det samme, leste litt på det, men endte til slutt med å tenke at verify var en mer 
alt-mulig syntax. 

Kjørte forsåvidt en hel haug med tester igjennom Github før jeg så koden som lå på Announcments, så brukte en hel del tid forgjeves zzz

Fikk noen pekepinner fra studass og forelesere, utenom det jobbet jeg alene.

Om det er noe jeg ville gjort annereledes var det å ta i bruk branches, det stoppet meg ikke veldig å merge med main branch,
men i større og mer langvarige prosjekter ville jeg nok tatt det mer aktivt i bruk.
