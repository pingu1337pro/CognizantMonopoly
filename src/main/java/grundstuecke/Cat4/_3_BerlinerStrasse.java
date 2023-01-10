package grundstuecke.Cat4;

import lombok.Getter;
import lombok.Setter;

@Getter
public class _3_BerlinerStrasse {
    private final String name = "Berliner Strasse";
    private final int preis = 200;
    private final int miete = 16;
    private final int hausPreis = 100;
    private final int mieteHaus1 = 80;
    private final int mieteHaus2 = 220;
    private final int mieteHaus3 = 600;
    private final int mieteHaus4 = 800;
    private final int mieteHotel = 1000;
    private final int hypothek = 100;
    private final int hypothekMitZins = 110;

    @Setter
    private int anzahlHaeuser = 0;
    @Setter
    private boolean hatHotel = false;
    @Setter
    private boolean hatHypothek = false;
    @Setter
    private boolean istGekauft = false;
    @Setter
    private int besitzerId = 0;

}
