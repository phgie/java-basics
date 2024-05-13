package aufgabe5;

public class Aufgabe5 {
    public static void main(String[] args) {
        /* Aufgabe 5 */
        System.out.println("------------------------");
        System.out.println("Aufgabe 5");
        System.out.println("------------------------");

        Fahrzeug fahrzeug2 = new Fahrzeug("Gelb", 4);
        Fahrzeug fahrzeug3 = new Fahrzeug("Grün", 2);
        System.out.println("Fahrzeug 1 ist " + fahrzeug2.gibFarbe() + " und hat " + fahrzeug2.gibAnzahlRaeder() + " Räder");
        System.out.println("Fahrzeug 2 ist " + fahrzeug3.gibFarbe() + " und hat " + fahrzeug3.gibAnzahlRaeder() + " Räder");
    }
}
