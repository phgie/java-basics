package aufgabe6;

public class Fahrzeug {

    private final String farbe;
    private final int anzahlRaeder;
    private final Lampe beleuchtung;

    public Fahrzeug(String farbe, int anzahlRaeder) {

        this.farbe = farbe;
        this.anzahlRaeder = anzahlRaeder;
        this.beleuchtung = new Lampe();
    }

    public String gibFarbe() {

        return this.farbe;
    }

    public int gibAnzahlRaeder() {

        return this.anzahlRaeder;
    }

    public Lampe gibBeleuchtung() {

        return this.beleuchtung;
    }
}
