package bahnhoefe;

import lombok.Setter;

public class Suedbahnhof {
    private final String name = "Suedbahnhof";
    private final int preis = 200;
    private final int hypothek = 100;
    private final int hypothekMitZins = 110;
    private final int miete1 = 25;
    private final int miete2 = 50;
    private final int miete3 = 100;
    private final int miete4 = 200;
    //TODO: miete so speichern oder alternativ mit Methode berechnen lassen?; wenn ja wo?

    @Setter
    private boolean hatHypothek = false;
    @Setter
    private boolean istGekauft = false;
    @Setter
    private int besitzerId = 0;

}
