package aufgabe6;

public class Aufgabe6 {
    public static void main(String[] args) {
        /* Aufgabe 6 */
        System.out.println("------------------------");
        System.out.println("Aufgabe 6");
        System.out.println("------------------------");

        Auto auto = new Auto("Gelb");
        Fahrrad fahrrad = new Fahrrad("Grün");

        System.out.println("Das Auto ist " + auto.gibFarbe() + " und hat " + auto.gibAnzahlRaeder() + " Räder");
        System.out.println("Das Fahrrad ist " + fahrrad.gibFarbe() + " und hat " + fahrrad.gibAnzahlRaeder() + " Räder");
    }
}
