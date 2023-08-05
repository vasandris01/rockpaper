# rockpaper
* kő-papír-ollo
*
* játékmenet -> játék elindítása után
*
* 1. kiválasztani 1v1 1vPC PCvsPC
* 1.2 név választása
* 2. választok 3 közül valamit
* 3. választ a másik is valamit
* 4. kiderül kinyer
* 5. közüljük a nyertest és a köröket
* 6. visza lehet lépni a menübe
*
* beállítási lehetőség
*
*
* menü
* új játék indítása
* kilépés

* task: osztályrendszer kialakítása minden előtt közösen
  * **RPS** enuum:
    * ROCK(kő) 
    * PAPER(papir)
    * SCISSOR(olló)
    * enuumokhoz magyar elnevezés
  * Game osztály:
    * **scoreboard** Map field
    * @Override default konstruktor:
      * létrehoz egy üres Map-et
    * kő - papir - olló választás metódus **choosingRPS(int choice)** :
      * választási lehetőség kiiratása
      * switch case
    * PC kő-papir-olló választás **choosingPC()**:
      * véletlenszerű enuum választás
    * játékmenet metódus **game(Enuum a, Enuum b)**:
      * paraméterként 2 enuum 
      * összehasonlitja az enuumokat és eldönti, hogy adott szituációban melyik enuum nyer
      * nyertes kiiratása
      * eredmény mentése Mapbe
    * 1v1 metódus **pVp()**:
      * játékmenet metódus hivás 2x a játékos választással
    * 1vPC metódus **pVpc()**:
      * játékmenet metódus hivás 1x a játékos választással 1x a pc választással
    * PCvPC metódus **pcVpc()**: 
      * játékmenet metódus hivás 2x a pc választással
    * új játékos metódus **newPlayer(String name)**:
      * a Map-be kulcsként beirjuk a felhasználó által megadott nevet, és értéknek 0-t állitunk be.
      * ha létezik kulcsként a játékos, akkor ne irjuk felül a már meglévő értéket!
    * beolvasási metódus  **String input()**:
      * új játékos metódus kiegészitéseként egy beolvasást hozunk létre
    * beolvasás **int choose()**
    * scoreboard lekérdezés (getter scoreboard fieldhez) **getScoreboard()**
    * **@Override toString()** scoreboard kiiratáshoz
    * játékos eredmény keresés metódus (név szerint) **findScore(String name)**
    * menü metódus **menu()**
    * új játék metódus **newGame()**
      * opció beállitás
        * 1v1 -> 2 új játékos létrehozása
        * 1vPC -> 1 új játékos létrehozása
        * PCvPC -> PC játékos metódusok hivása
* task: menü elkészítése
  * új játék
    * task: elején opciók beállítása (1v1 etc..)
      * 1v1
      * 1vPC
      * PCvPC
  * Scoreboard kiiratás
  * Játékos keresés
  * Kilépés
* task: játék menet (egy kör lefutása)
  * 1v1: 
    1. 2x létre kell hozni új játékost
    2. 'A' játékos választ enuumokból
    3. 'B' játékos választ enuumokból
    4. játékmenet metódus
  * 1vPC:
    1. 1x létre kell hozni új játékost
    2. játékos választ enuumokból
    3. PC választ enuumokból
    4. játékmenet metódus
  * PCvPC:
    1. PC választ enuumokból
    2. PC választ enuumokból
    3. játékmenet metódus
* task: játék vége logika
  * választás 3 opcióból:
      * Új játék
      * Menü
      * Kilépés
* task: grafikai megljelenítés  (SZORGALMI)